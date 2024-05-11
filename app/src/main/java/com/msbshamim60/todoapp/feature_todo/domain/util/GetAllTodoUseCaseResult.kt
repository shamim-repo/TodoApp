package com.msbshamim60.todoapp.feature_todo.domain.util

import com.msbshamim60.todoapp.feature_todo.domain.model.TodoItem

sealed class GetAllTodoItemResult{
    data class Success(val todoItems:List<TodoItem>):GetAllTodoItemResult()
    data class Error(val message: String):GetAllTodoItemResult()
}