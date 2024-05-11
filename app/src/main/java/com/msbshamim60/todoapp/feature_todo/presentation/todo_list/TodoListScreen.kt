package com.msbshamim60.todoapp.feature_todo.presentation.todo_list

import android.annotation.SuppressLint
import android.content.res.Configuration
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.SnackbarResult
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.msbshamim60.todoapp.core.utils.ContentDescription
import com.msbshamim60.todoapp.core.utils.TodoListString
import com.msbshamim60.todoapp.feature_todo.presentation.todo_list.component.SortingDrawerOptions
import com.msbshamim60.todoapp.feature_todo.presentation.todo_list.component.TodoItemCard
import com.msbshamim60.todoapp.feature_todo.presentation.utils.Screen
import com.msbshamim60.todoapp.ui.theme.TodoAppTheme
import kotlinx.coroutines.launch

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@ExperimentalMaterial3Api
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TodoListScreen(
    navController: NavController,
    viewModel: TodoListViewModel = hiltViewModel()
){
    val state = viewModel.state.value
    val snackHostState = remember {
        SnackbarHostState()
    }
    val scope= rememberCoroutineScope()
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)

    LaunchedEffect(key1 = true) {
        viewModel.getAllTodos()
    }

    ModalNavigationDrawer(
        modifier = Modifier.fillMaxSize(),
        drawerState = drawerState,
        drawerContent = {
            ModalDrawerSheet {
                Text(
                    modifier = Modifier.padding(16.dp),
                    text = TodoListString.SORT_BY,
                    style = MaterialTheme.typography.headlineMedium,
                )
                HorizontalDivider(modifier = Modifier.padding(horizontal = 10.dp))
                SortingDrawerOptions(
                    todoItemOrder =state.todoItemOrder,
                    onOrderChange = {order ->
                        viewModel.onEvent(TodoListEvent.Sort(order))
                    }
                )
            }
        }
    ){
        Scaffold(
            modifier = Modifier.fillMaxSize(),
            floatingActionButton = {
                FloatingActionButton(
                    onClick = {
                        navController.navigate(
                            route = Screen.TodoNewUpdateScreen.rout
                        )
                    },
                    shape = CircleShape,
                ) {
                    Icon(
                        imageVector = Icons.Default.AddCircle,
                        contentDescription =ContentDescription.ADD_FLOATING_ACTION_BUTTON,
                    )
                }
            },
            topBar = {
                CenterAlignedTopAppBar(
                    modifier = Modifier.fillMaxWidth(),
                    title = {
                        Text(
                            text = TodoListString.TODO_LIST,
                            style = MaterialTheme.typography.titleLarge,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis
                        )
                    },
                    navigationIcon = {/*TODO*/ },
                    scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior(),
                    actions = {
                        IconButton(
                            onClick = {
                                scope.launch { drawerState.open() }
                            }
                        ) {
                            Icon(
                                imageVector = Icons.Default.Menu,
                                contentDescription = ContentDescription.DRAWER_SHEET
                            )
                        }
                    },
                    colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                        containerColor = MaterialTheme.colorScheme.secondaryContainer
                    )
                )
            },
            snackbarHost = { SnackbarHost(hostState = snackHostState) },
        ){  padding ->
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center,
            ){
                LazyColumn(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(horizontal = 20.dp)
                        .padding(top = padding.calculateTopPadding())
                ) {
                    items( state.todoItems){ todo ->
                        TodoItemCard(
                            todoItem = todo,
                            onDeleteClick = {
                                viewModel.onEvent(TodoListEvent.Delete(todo))
                                scope.launch {
                                    val undo= snackHostState.showSnackbar(
                                        message = TodoListString.TODO_ITEM_DELETED,
                                        actionLabel = TodoListString.UNDO
                                    )
                                    if (undo == SnackbarResult.ActionPerformed){
                                        viewModel.onEvent(TodoListEvent.UndoDelete)
                                    }
                                }
                            },
                            onArchiveClick = {
                                viewModel.onEvent(TodoListEvent.ToggleArchive(todo))
                            },
                            onCompleteClick = {
                                viewModel.onEvent(TodoListEvent.ToggleComplete(todo))
                            },
                            onCardClick = {
                                navController.navigate(
                                    route = Screen.TodoNewUpdateScreen.rout+"?todoId=${todo.id}"
                                )
                            }
                        )

                    }//items

                }//lazy column
                if(state.isLoading){
                    CircularProgressIndicator(
                        modifier = Modifier
                            .semantics {
                                this.contentDescription =
                                    ContentDescription.CIRCULAR_PROGRESS_INDICATION
                            }
                            .size(50.dp),
                    )
                }//if

                if (state.error !=null){
                    Text(
                        text = state.error,
                        style = MaterialTheme.typography.bodyLarge,
                        color = MaterialTheme.colorScheme.error
                    )
                }//if

            }//Box

        }//Scaffold
    }//Navigation drawer

}




@Preview
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun TodoListScreenPreview(){
    TodoAppTheme {
        Surface(
            modifier = Modifier.fillMaxSize()
        ) {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center,
            ) {


            }
        }
    }
}