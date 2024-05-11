package com.msbshamim60.todoapp.feature_todo.domain.util

sealed class SortDirection {
    object Up: SortDirection()
    object Down: SortDirection()
}