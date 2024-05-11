package com.msbshamim60.todoapp.feature_todo.presentation.todo_list

import com.msbshamim60.todoapp.feature_todo.domain.model.TodoItem
import com.msbshamim60.todoapp.feature_todo.domain.util.TodoItemOrder

sealed class TodoListEvent {
    data class Sort(val todoItemOrder: TodoItemOrder) : TodoListEvent()
    data class Delete(val todoItem: TodoItem) : TodoListEvent()
    data class ToggleArchive(val todoItem: TodoItem) : TodoListEvent()
    data class ToggleComplete(val todoItem: TodoItem) : TodoListEvent()
    object UndoDelete:TodoListEvent()

}