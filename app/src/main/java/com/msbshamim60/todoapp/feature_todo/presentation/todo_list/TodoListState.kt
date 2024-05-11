package com.msbshamim60.todoapp.feature_todo.presentation.todo_list

import com.msbshamim60.todoapp.feature_todo.domain.model.TodoItem
import com.msbshamim60.todoapp.feature_todo.domain.util.SortDirection
import com.msbshamim60.todoapp.feature_todo.domain.util.TodoItemOrder

data class TodoListState(
    val todoItems: List<TodoItem> = emptyList(),
    val todoItemOrder: TodoItemOrder= TodoItemOrder.Time(showArchive = true, sortDirection = SortDirection.Down),
    val isLoading: Boolean= true,
    val error: String?= null
)
