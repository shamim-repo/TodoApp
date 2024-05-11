package com.msbshamim60.todoapp.feature_todo.presentation.todo_new_update

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material.icons.filled.Save
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.BottomAppBarDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.SnackbarResult
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.msbshamim60.todoapp.core.presentation.component.ArchiveButton
import com.msbshamim60.todoapp.core.presentation.component.CompleteButton
import com.msbshamim60.todoapp.core.presentation.component.DeleteButton
import com.msbshamim60.todoapp.core.utils.ContentDescription
import com.msbshamim60.todoapp.core.utils.NewUpdateString
import com.msbshamim60.todoapp.feature_todo.presentation.todo_new_update.component.HintTextField
import com.msbshamim60.todoapp.ui.theme.TodoAppTheme
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NewUpdateTodoScreen(
    navController: NavController,
    viewmodel: NewUpdateTodoViewmodel = hiltViewModel()
) {
    val state = viewmodel.state.value
    val snackBarHostState = remember { SnackbarHostState()}
    val scope = rememberCoroutineScope()

    val configuration = LocalConfiguration.current
    val isPortrait = configuration.orientation == Configuration.ORIENTATION_PORTRAIT

    LaunchedEffect(key1 = true) {
        viewmodel.eventFlow.collectLatest { eventFlow ->
            when(eventFlow){
                NewUpdateTodoViewmodel.UiEvents.Back -> {
                    navController.navigateUp()
                }
                NewUpdateTodoViewmodel.UiEvents.Save -> {
                    navController.navigateUp()
                }
                is NewUpdateTodoViewmodel.UiEvents.ShowSnackBar -> {
                    snackBarHostState.showSnackbar(
                        message = eventFlow.message
                    )
                }
            }
        }
    }

    Scaffold(
        floatingActionButton = {
            if(!isPortrait){
                FloatingActionButton(
                    onClick = {
                        viewmodel.onEvent(NewUpdateTodoEvent.Save)
                    },
                    shape = CircleShape,
                ) {
                    Icon(
                        imageVector = Icons.Default.Save,
                        contentDescription = ContentDescription.SAVE_TODO)
                }
            }
        },
        topBar = {
            if (isPortrait){
                CenterAlignedTopAppBar(
                    title = {
                        Text(
                            text = NewUpdateString.NEW_UPDATE_TODO,
                            style = MaterialTheme.typography.headlineSmall,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis
                        )
                    },
                    navigationIcon = {
                        IconButton(
                            onClick = { navController.navigateUp() },
                            modifier = Modifier.padding(start = 10.dp)
                        ) {
                            Icon(
                                imageVector = Icons.Default.ArrowBackIosNew,
                                contentDescription = ContentDescription.BACK
                            )
                        }
                    },
                    scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior(),
                    colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                        containerColor = if(state.todoItem.archived)
                            MaterialTheme.colorScheme.tertiaryContainer
                        else
                            MaterialTheme.colorScheme.secondaryContainer
                    )
                )
            }
        }/*top bar*/,
        bottomBar = {
            if(isPortrait){
                BottomAppBar(
                    actions = {
                        CompleteButton(
                            onClick = {
                                viewmodel.onEvent(NewUpdateTodoEvent.ToggleCompleted)
                            },
                            isComplete = state.todoItem.completed
                        )
                        ArchiveButton(
                            onClick = { viewmodel.onEvent(NewUpdateTodoEvent.ToggleArchived) },
                            isArchived = state.todoItem.archived
                        )

                        DeleteButton {
                            scope.launch {
                                val confirm = snackBarHostState.showSnackbar(
                                    message = NewUpdateString.CONFIRM_DELETE,
                                    actionLabel = NewUpdateString.YES
                                )
                                if (confirm == SnackbarResult.ActionPerformed){
                                    viewmodel.onEvent(NewUpdateTodoEvent.Delete)
                                }
                            }
                        }
                    },
                    floatingActionButton = {
                        FloatingActionButton(
                            onClick = {
                                viewmodel.onEvent(NewUpdateTodoEvent.Save)
                            },
                            shape = CircleShape,
                        ) {
                            Icon(
                                imageVector = Icons.Default.Save,
                                contentDescription = ContentDescription.SAVE_TODO)
                        }
                    },
                    containerColor = BottomAppBarDefaults.containerColor.copy(alpha = 0.5f)
                )
            }
        },/*Bottom AppBar*/
        snackbarHost = { SnackbarHost(hostState = snackBarHostState) }
    ) { padding ->
        Column(
            verticalArrangement = Arrangement.Top,
            modifier = Modifier
                .fillMaxSize()
                .padding(
                    top = padding.calculateTopPadding(),
                    bottom = padding.calculateBottomPadding(),
                    start = 10.dp,
                    end = 10.dp,
                )
        ) {
            HintTextField(
                text = state.todoItem.title,
                hint = NewUpdateString.TITLE_HINT,
                singleLine = true,
                textStyle = MaterialTheme.typography.headlineSmall,
                onChange ={
                    viewmodel.onEvent(NewUpdateTodoEvent.EnteredTitle(it))
                },
                onFocusChange = {
                    viewmodel.onEvent(NewUpdateTodoEvent.ChangedTitleFocus(it))
                },
                isHintVisible = state.isIsTitleHintVisible,

            )
            HorizontalDivider(Modifier.padding(vertical = 20.dp))

            HintTextField(
                modifier = Modifier.fillMaxSize(),
                text = state.todoItem.description,
                hint = NewUpdateString.DESCRIPTION_HINT,
                singleLine = false,
                textStyle = MaterialTheme.typography.titleLarge,
                onChange ={
                    viewmodel.onEvent(NewUpdateTodoEvent.EnteredDescription(it))
                },
                onFocusChange = {
                    viewmodel.onEvent(NewUpdateTodoEvent.ChangedDescriptionFocus(it))
                },
                isHintVisible = state.isDescriptionHintVisible,
            )
        }
    }
}

@Preview
@Composable
private fun NewUpdateScreenPreview() {
    TodoAppTheme {
        Surface( modifier = Modifier.fillMaxSize()) {
            Column(
                verticalArrangement = Arrangement.Top,
                modifier = Modifier
                    .fillMaxSize()
            ) {
                HintTextField(
                    text = "",
                    hint = NewUpdateString.TITLE_HINT,
                    singleLine = true,
                    onChange ={

                    },
                    textStyle = MaterialTheme.typography.titleLarge,
                    onFocusChange = {

                    },
                    isHintVisible = false,
                )

                HorizontalDivider(Modifier.padding(vertical = 20.dp))

                HintTextField(
                    text = "state.todoItem.description",
                    hint = NewUpdateString.DESCRIPTION_HINT,
                    singleLine = false,
                    textStyle = MaterialTheme.typography.labelLarge,
                    onChange ={

                    },
                    onFocusChange = {

                    },
                    isHintVisible = false,
                )
            }
        }
    }
}