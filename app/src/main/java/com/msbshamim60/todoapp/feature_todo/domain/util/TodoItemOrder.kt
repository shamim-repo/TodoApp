package com.msbshamim60.todoapp.feature_todo.domain.util

sealed class TodoItemOrder(
    val showArchive: Boolean,
    val sortDirection: SortDirection
) {
    class Title( showArchive: Boolean,sortDirection: SortDirection) : TodoItemOrder(showArchive, sortDirection)
    class Completed( showArchive: Boolean,sortDirection: SortDirection) : TodoItemOrder(showArchive, sortDirection)
    class Time( showArchive: Boolean,sortDirection: SortDirection) : TodoItemOrder(showArchive, sortDirection)

    fun copy(showArchive: Boolean = this.showArchive, sortDirection: SortDirection = this.sortDirection) : TodoItemOrder {
        return when(this) {
            is Title -> Title(showArchive, sortDirection)
            is Completed -> Completed(showArchive, sortDirection)
            is Time -> Time(showArchive, sortDirection)
        }
    }
}