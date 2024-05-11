package com.msbshamim60.todoapp.feature_todo.domain.usecase

import com.msbshamim60.todoapp.core.utils.TodoUseCaseString
import com.msbshamim60.todoapp.feature_todo.domain.model.TodoItem
import com.msbshamim60.todoapp.feature_todo.domain.repo.TodoRepository
import com.msbshamim60.todoapp.feature_todo.domain.util.InvalidTodoItemException
import javax.inject.Inject

class ToggleArchivedUseCase @Inject constructor(
    private val repo: TodoRepository
) {
    suspend operator fun invoke(todoItem: TodoItem){
        repo.updateTodoItem(todoItem.copy(archived = !todoItem.archived))
    }
}