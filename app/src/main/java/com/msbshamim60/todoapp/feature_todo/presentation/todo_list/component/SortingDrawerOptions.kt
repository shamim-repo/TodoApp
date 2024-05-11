package com.msbshamim60.todoapp.feature_todo.presentation.todo_list.component

import android.content.res.Configuration
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.msbshamim60.todoapp.core.utils.TodoListString
import com.msbshamim60.todoapp.feature_todo.domain.util.SortDirection
import com.msbshamim60.todoapp.feature_todo.domain.util.TodoItemOrder
import com.msbshamim60.todoapp.ui.theme.TodoAppTheme

@Composable
fun SortingDrawerOptions(
    todoItemOrder: TodoItemOrder,
    onOrderChange: (TodoItemOrder) -> Unit
){
    val isTitleSelected = todoItemOrder::class == TodoItemOrder.Title::class
    NavigationDrawerItem(
        label = {
            SortingRow(
                text = TodoListString.TITLE,
                isSelected = isTitleSelected
            )
        },
        selected = false,
        onClick = {
            onOrderChange(
                TodoItemOrder.Title(
                    showArchive = todoItemOrder.showArchive,
                    sortDirection = todoItemOrder.sortDirection
                )
            )
        }
    )
    val isTimeSelected = todoItemOrder::class == TodoItemOrder.Time::class
    NavigationDrawerItem(
        label = {
            SortingRow(
                text = TodoListString.TIME,
                isSelected = isTimeSelected
            )
        },
        selected = false,
        onClick = {
            onOrderChange(
                TodoItemOrder.Time(
                    showArchive = todoItemOrder.showArchive,
                    sortDirection = todoItemOrder.sortDirection
                )
            )
        }
    )

    val isCompletedSelected = todoItemOrder::class == TodoItemOrder.Completed::class
    NavigationDrawerItem(
        label = {
            SortingRow(
                text = TodoListString.COMPLETED,
                isSelected = isCompletedSelected
            )
        },
        selected = false,
        onClick = {
            onOrderChange(
                TodoItemOrder.Completed(
                    showArchive = todoItemOrder.showArchive,
                    sortDirection = todoItemOrder.sortDirection
                )
            )
        }
    )

    HorizontalDivider()

    val isSortingDown = todoItemOrder.sortDirection == SortDirection.Down
    NavigationDrawerItem(
        label = {
            SortingRow(
                text = TodoListString.SORT_DOWN,
                isSelected = isSortingDown
            )
        },
        selected = false,
        onClick = {
            onOrderChange(todoItemOrder.copy(sortDirection = SortDirection.Down))
        }
    )

    val isSortingUp = todoItemOrder.sortDirection == SortDirection.Up
    NavigationDrawerItem(
        label = {
            SortingRow(
                text = TodoListString.SORT_UP,
                isSelected = isSortingUp
            )
        },
        selected = false,
        onClick = {
            onOrderChange(todoItemOrder.copy(sortDirection = SortDirection.Up))
        }
    )

    HorizontalDivider()


    NavigationDrawerItem(
        label = {
            SortingRow(
                text = TodoListString.SHOW_ARCHIVED,
                isSelected = todoItemOrder.showArchive
            )
        },
        selected = false,
        onClick = {
            onOrderChange(todoItemOrder.copy(showArchive = !todoItemOrder.showArchive))
        }
    )

}

@Preview
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun SortingDrawerPreview(){
    TodoAppTheme {
        Surface(modifier = Modifier.fillMaxSize()) {
            Column {
                SortingDrawerOptions(
                    onOrderChange = {},
                    todoItemOrder = TodoItemOrder.Title(false, sortDirection = SortDirection.Down),
                )
            }

        }

    }
}