package com.msbshamim60.todoapp.feature_todo.data.mapper

import com.msbshamim60.todoapp.feature_todo.data.local.dto.LocalTodoItem
import com.msbshamim60.todoapp.feature_todo.domain.model.TodoItem

fun TodoItem.toLocalTodoItem() = LocalTodoItem(
    id = id,
    title = title,
    description = description,
    completed = completed,
    timestamp = timestamp,
    archived = archived
)

fun LocalTodoItem.toTodoItem() = TodoItem(
    id = id,
    title = title,
    description = description,
    completed = completed,
    timestamp = timestamp,
    archived = archived
)


fun List<TodoItem>.toLocalTodoItems() = map { it.toLocalTodoItem() }

fun List<LocalTodoItem>.toTodoItems() = map { it.toTodoItem() }
