package com.msbshamim60.todoapp.feature_todo.data.local.dto

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "todo")
data class LocalTodoItem(
    @PrimaryKey(autoGenerate = true)
    val id: Int?,
    val title: String,
    val description: String,
    val completed: Boolean,
    val timestamp: Long,
    val archived: Boolean
)
