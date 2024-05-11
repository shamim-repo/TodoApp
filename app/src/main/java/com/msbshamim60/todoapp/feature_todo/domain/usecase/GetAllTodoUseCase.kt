package com.msbshamim60.todoapp.feature_todo.domain.usecase

import com.msbshamim60.todoapp.feature_todo.domain.model.TodoItem
import com.msbshamim60.todoapp.feature_todo.domain.repo.TodoRepository
import com.msbshamim60.todoapp.feature_todo.domain.util.GetAllTodoItemResult
import com.msbshamim60.todoapp.feature_todo.domain.util.SortDirection
import com.msbshamim60.todoapp.feature_todo.domain.util.TodoItemOrder
import javax.inject.Inject

class GetAllTodoUseCase @Inject constructor(
    private val repo: TodoRepository
) {
    suspend operator fun invoke(
        order: TodoItemOrder = TodoItemOrder.Time(showArchive = true, sortDirection = SortDirection.Down)
    ): GetAllTodoItemResult {
        val todoItems=repo.getAllTodoItems()

        val filterTodos=if (order.showArchive){
            todoItems
        }else{
            todoItems.filter { !it.archived }
        }

        return when(order.sortDirection){
            is SortDirection.Up ->{
                when(order){
                    is TodoItemOrder.Title -> GetAllTodoItemResult.Success(filterTodos.sortedBy { it.title.lowercase() })
                    is TodoItemOrder.Time -> GetAllTodoItemResult.Success(filterTodos.sortedBy { it.timestamp })
                    is TodoItemOrder.Completed -> GetAllTodoItemResult.Success(filterTodos.sortedBy { it.completed })
                }
            }
            is SortDirection.Down ->{
                when(order){
                    is TodoItemOrder.Title -> GetAllTodoItemResult.Success(filterTodos.sortedByDescending { it.title.lowercase() })
                    is TodoItemOrder.Time -> GetAllTodoItemResult.Success(filterTodos.sortedByDescending { it.timestamp })
                    is TodoItemOrder.Completed -> GetAllTodoItemResult.Success(filterTodos.sortedByDescending { it.completed })
                }
            }
        }
    }
}

