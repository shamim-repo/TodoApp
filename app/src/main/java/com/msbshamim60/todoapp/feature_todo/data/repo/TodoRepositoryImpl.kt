package com.msbshamim60.todoapp.feature_todo.data.repo

import com.msbshamim60.todoapp.feature_todo.data.local.TodoDao
import com.msbshamim60.todoapp.feature_todo.data.mapper.toLocalTodoItem
import com.msbshamim60.todoapp.feature_todo.data.mapper.toTodoItem
import com.msbshamim60.todoapp.feature_todo.data.mapper.toTodoItems
import com.msbshamim60.todoapp.feature_todo.domain.model.TodoItem
import com.msbshamim60.todoapp.feature_todo.domain.repo.TodoRepository


class TodoRepositoryImpl(
    private val todoDao: TodoDao
) : TodoRepository{
    override suspend fun getAllTodoItems(): List<TodoItem> {
        return todoDao.getAllTodoItems().toTodoItems()
    }

    override suspend fun getTodoItemById(id: Int): TodoItem? {
        return todoDao.getTodoItemById(id)?.toTodoItem()
    }

    override suspend fun insertTodoItem(todoItem: TodoItem) {
        todoDao.insertTodoItem(todoItem.toLocalTodoItem())
    }

    override suspend fun insertAllTodoItems(todoItems: List<TodoItem>) {
        todoDao.insertAllTodoItems(todoItems.map { it.toLocalTodoItem() })
    }

    override suspend fun updateTodoItem(todoItem: TodoItem) {
        todoDao.updateTodoItem(todoItem.toLocalTodoItem())
    }

    override suspend fun deleteTodoItem(todoItem: TodoItem) {
        todoDao.deleteTodoItem(todoItem.toLocalTodoItem())
    }

}