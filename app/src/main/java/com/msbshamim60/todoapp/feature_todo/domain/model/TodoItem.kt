package com.msbshamim60.todoapp.feature_todo.domain.model

data class TodoItem(
    val id: Int?,
    val title: String,
    val description: String,
    val completed: Boolean,
    val timestamp: Long,
    val archived: Boolean
)
