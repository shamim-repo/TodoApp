package com.msbshamim60.todoapp.feature_todo.presentation.todo_new_update

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.msbshamim60.todoapp.core.utils.NewUpdateString
import com.msbshamim60.todoapp.feature_todo.domain.usecase.AddTodoUseCase
import com.msbshamim60.todoapp.feature_todo.domain.usecase.DeleteTodoUseCase
import com.msbshamim60.todoapp.feature_todo.domain.usecase.GetTodoItemByIDUseCase
import com.msbshamim60.todoapp.feature_todo.domain.usecase.ToggleArchivedUseCase
import com.msbshamim60.todoapp.feature_todo.domain.usecase.ToggleCompletedUseCase
import com.msbshamim60.todoapp.feature_todo.domain.usecase.UpdateTodoUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class NewUpdateTodoViewmodel @Inject constructor(
    val addTodoUseCase: AddTodoUseCase,
    val getTodoItemByIDUseCase: GetTodoItemByIDUseCase,
    val deleteTodoUseCase: DeleteTodoUseCase,
    val updateTodoUseCase: UpdateTodoUseCase,
    savedStateHandle: SavedStateHandle
):ViewModel() {
    private val _state = mutableStateOf(TodoNewUpdateState())
    val state: State<TodoNewUpdateState> = _state

    private val errorHandler = CoroutineExceptionHandler {_,e ->
        e.printStackTrace()
        _state.value = _state.value.copy(
            error = e.message,
            isLoading = false
        )
    }
    private var currentTodoId: Int? = null

    private val _eventFlow = MutableSharedFlow<UiEvents>()
    val eventFlow = _eventFlow.asSharedFlow()

    sealed class UiEvents{
        data class ShowSnackBar(val message: String):UiEvents()
        object Save:UiEvents()
        object Back:UiEvents()
    }
    init {
        savedStateHandle.get<Int>("todoId")?.let {id ->
            if(id != -1){
                viewModelScope.launch(errorHandler) {
                    getTodoItemByIDUseCase(id)?.also { todo->
                        currentTodoId = todo.id
                        _state.value = _state.value.copy(
                            todoItem = todo,
                            isLoading = false,
                            isIsTitleHintVisible = todo.title.isBlank(),
                            isDescriptionHintVisible = todo.description.isBlank()
                        )
                    }
                }
            }else{
                _state.value = _state.value.copy(
                    isLoading = false
                )
            }

        }
    }
    fun onEvent(event : NewUpdateTodoEvent){
        when(event){
            NewUpdateTodoEvent.Back -> {
                viewModelScope.launch(errorHandler) {
                    _eventFlow.emit(UiEvents.Back)
                }
            }
            is NewUpdateTodoEvent.ChangedDescriptionFocus -> {
                val isDescriptionHintVisible = !event.state.isFocused && _state.value.todoItem.description.isBlank()
                _state.value = _state.value.copy(
                    isDescriptionHintVisible = isDescriptionHintVisible
                )
            }
            is NewUpdateTodoEvent.ChangedTitleFocus -> {
                val isTileHintVisible = !event.state.isFocused && _state.value.todoItem.title.isBlank()
                _state.value = _state.value.copy(
                    isIsTitleHintVisible = isTileHintVisible
                )
            }
            NewUpdateTodoEvent.Delete -> {
                viewModelScope.launch(errorHandler){
                    if (currentTodoId != null){
                        deleteTodoUseCase(_state.value.todoItem)
                    }
                    _eventFlow.emit(UiEvents.Back)
                }
            }
            is NewUpdateTodoEvent.EnteredDescription -> {
                _state.value = _state.value.copy(
                    todoItem = _state.value.todoItem.copy(
                        description = event.value
                    )
                )
            }
            is NewUpdateTodoEvent.EnteredTitle -> {
                _state.value = _state.value.copy(
                    todoItem = _state.value.todoItem.copy(
                        title = event.value
                    )
                )
            }
            NewUpdateTodoEvent.Save -> {
                viewModelScope.launch(errorHandler) {
                    try {
                        if (currentTodoId != null){
                            updateTodoUseCase(_state.value.todoItem)
                        }else{
                            addTodoUseCase(_state.value.todoItem.copy(
                                timestamp = System.currentTimeMillis(),
                                id = null
                            ))
                        }
                        _eventFlow.emit(UiEvents.Save)
                    }catch (e : Exception){
                        _eventFlow.emit(
                            UiEvents.ShowSnackBar(
                                message = e.message ?: NewUpdateString.SAVE_ERROR
                            )
                        )
                    }
                }
            }
            NewUpdateTodoEvent.ToggleArchived -> {
                _state.value = _state.value.copy(
                    todoItem = _state.value.todoItem.copy(
                        archived = !_state.value.todoItem.archived
                    )
                )
            }
            NewUpdateTodoEvent.ToggleCompleted -> {
                _state.value = _state.value.copy(
                    todoItem = _state.value.todoItem.copy(
                        completed = !_state.value.todoItem.completed
                    )
                )
            }
        }
    }
}