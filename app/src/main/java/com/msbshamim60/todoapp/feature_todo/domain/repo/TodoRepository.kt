package com.msbshamim60.todoapp.feature_todo.domain.repo

import com.msbshamim60.todoapp.feature_todo.domain.model.TodoItem


interface TodoRepository {
    suspend fun getAllTodoItems(): List<TodoItem>
    suspend fun getTodoItemById(id: Int): TodoItem?
    suspend fun insertTodoItem(todoItem: TodoItem)
    suspend fun insertAllTodoItems(todoItems: List<TodoItem>)
    suspend fun updateTodoItem(todoItem:TodoItem)
    suspend fun deleteTodoItem(todoItem: TodoItem)
}