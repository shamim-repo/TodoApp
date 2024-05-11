package com.msbshamim60.todoapp.feature_todo.domain.usecase

import com.msbshamim60.todoapp.feature_todo.domain.model.TodoItem
import com.msbshamim60.todoapp.feature_todo.domain.repo.TodoRepository
import javax.inject.Inject

class DeleteTodoUseCase@Inject constructor(
    private val repo: TodoRepository
) {
    suspend operator fun invoke(todoItem: TodoItem) {
        repo.deleteTodoItem(todoItem)
    }
}