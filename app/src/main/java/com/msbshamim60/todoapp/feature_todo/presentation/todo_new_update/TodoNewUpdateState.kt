package com.msbshamim60.todoapp.feature_todo.presentation.todo_new_update

import com.msbshamim60.todoapp.feature_todo.domain.model.TodoItem

data class TodoNewUpdateState (
    val isIsTitleHintVisible: Boolean =true,
    val isDescriptionHintVisible : Boolean = true,
    val todoItem: TodoItem = TodoItem(
        id = null,
        title = "",
        description = "",
        timestamp = 0,
        completed = false,
        archived = false
    ),
    val isLoading: Boolean = true,
    val error : String? = null,
)