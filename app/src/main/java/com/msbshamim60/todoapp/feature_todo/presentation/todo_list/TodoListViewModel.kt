package com.msbshamim60.todoapp.feature_todo.presentation.todo_list

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.msbshamim60.todoapp.core.utils.TodoListString
import com.msbshamim60.todoapp.feature_todo.domain.model.TodoItem
import com.msbshamim60.todoapp.feature_todo.domain.usecase.AddTodoUseCase
import com.msbshamim60.todoapp.feature_todo.domain.usecase.DeleteTodoUseCase
import com.msbshamim60.todoapp.feature_todo.domain.usecase.GetAllTodoUseCase
import com.msbshamim60.todoapp.feature_todo.domain.usecase.ToggleArchivedUseCase
import com.msbshamim60.todoapp.feature_todo.domain.usecase.ToggleCompletedUseCase
import com.msbshamim60.todoapp.feature_todo.domain.util.GetAllTodoItemResult
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class TodoListViewModel @Inject constructor(
    private val addTodoUseCase: AddTodoUseCase,
    private val deleteTodoUseCase: DeleteTodoUseCase,
    private val toggleArchivedUseCase: ToggleArchivedUseCase,
    private val toggleCompletedUseCase: ToggleCompletedUseCase,
    private val getAllTodoUseCase: GetAllTodoUseCase
):ViewModel() {
    private val _state= mutableStateOf(TodoListState())
    val state: State<TodoListState> = _state

    private val errorHandler= CoroutineExceptionHandler{_,e->
        e.printStackTrace()
        _state.value=_state.value.copy(
            error = e.message,
            isLoading = false
        )
    }
    private var undoTodoItem: TodoItem? = null

    fun onEvent(event: TodoListEvent){
        when(event){
            is TodoListEvent.Delete -> {
                viewModelScope.launch(errorHandler) {
                    deleteTodoUseCase(event.todoItem)
                    getAllTodos()
                    undoTodoItem = event.todoItem
                }
            }
            is TodoListEvent.Sort -> {
                val isAllReadySorted=  _state.value.todoItemOrder::class == event.todoItemOrder::class &&
                        _state.value.todoItemOrder.showArchive == event.todoItemOrder.showArchive &&
                        _state.value.todoItemOrder.sortDirection == event.todoItemOrder.sortDirection

                if (isAllReadySorted) return
                _state.value= _state.value.copy(
                    todoItemOrder = event.todoItemOrder
                )
                getAllTodos()
            }
            is TodoListEvent.ToggleArchive -> {
                viewModelScope.launch(errorHandler){
                    toggleArchivedUseCase(event.todoItem)
                    getAllTodos()
                }
            }
            is TodoListEvent.ToggleComplete -> {
                viewModelScope.launch(errorHandler) {
                    toggleCompletedUseCase(event.todoItem)
                    getAllTodos()
                }
            }
            TodoListEvent.UndoDelete -> {
                viewModelScope.launch(errorHandler){
                    addTodoUseCase(undoTodoItem ?: return@launch)
                    undoTodoItem=null
                    getAllTodos()
                }
            }
        }
    }

    public fun getAllTodos(){
        viewModelScope.launch(errorHandler) {
            when(val result = getAllTodoUseCase(order = _state.value.todoItemOrder)){
                is GetAllTodoItemResult.Success -> {
                    _state.value = _state.value.copy(
                        todoItems = result.todoItems,
                        todoItemOrder = _state.value.todoItemOrder,
                        isLoading = false
                    )
                }
                is GetAllTodoItemResult.Error -> {
                    _state.value = _state.value.copy(
                        error=TodoListString.CANT_GET_TODOS,
                        isLoading = false
                    )
                }
            }
        }
    }
}