package com.msbshamim60.todoapp.feature_todo.presentation.todo_list;

import androidx.compose.runtime.State;
import androidx.lifecycle.ViewModel;
import com.msbshamim60.todoapp.core.utils.TodoListString;
import com.msbshamim60.todoapp.feature_todo.domain.model.TodoItem;
import com.msbshamim60.todoapp.feature_todo.domain.usecase.AddTodoUseCase;
import com.msbshamim60.todoapp.feature_todo.domain.usecase.DeleteTodoUseCase;
import com.msbshamim60.todoapp.feature_todo.domain.usecase.GetAllTodoUseCase;
import com.msbshamim60.todoapp.feature_todo.domain.usecase.ToggleArchivedUseCase;
import com.msbshamim60.todoapp.feature_todo.domain.usecase.ToggleCompletedUseCase;
import com.msbshamim60.todoapp.feature_todo.domain.util.GetAllTodoItemResult;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001cR\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/msbshamim60/todoapp/feature_todo/presentation/todo_list/TodoListViewModel;", "Landroidx/lifecycle/ViewModel;", "addTodoUseCase", "Lcom/msbshamim60/todoapp/feature_todo/domain/usecase/AddTodoUseCase;", "deleteTodoUseCase", "Lcom/msbshamim60/todoapp/feature_todo/domain/usecase/DeleteTodoUseCase;", "toggleArchivedUseCase", "Lcom/msbshamim60/todoapp/feature_todo/domain/usecase/ToggleArchivedUseCase;", "toggleCompletedUseCase", "Lcom/msbshamim60/todoapp/feature_todo/domain/usecase/ToggleCompletedUseCase;", "getAllTodoUseCase", "Lcom/msbshamim60/todoapp/feature_todo/domain/usecase/GetAllTodoUseCase;", "(Lcom/msbshamim60/todoapp/feature_todo/domain/usecase/AddTodoUseCase;Lcom/msbshamim60/todoapp/feature_todo/domain/usecase/DeleteTodoUseCase;Lcom/msbshamim60/todoapp/feature_todo/domain/usecase/ToggleArchivedUseCase;Lcom/msbshamim60/todoapp/feature_todo/domain/usecase/ToggleCompletedUseCase;Lcom/msbshamim60/todoapp/feature_todo/domain/usecase/GetAllTodoUseCase;)V", "_state", "Landroidx/compose/runtime/MutableState;", "Lcom/msbshamim60/todoapp/feature_todo/presentation/todo_list/TodoListState;", "errorHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "state", "Landroidx/compose/runtime/State;", "getState", "()Landroidx/compose/runtime/State;", "undoTodoItem", "Lcom/msbshamim60/todoapp/feature_todo/domain/model/TodoItem;", "getAllTodos", "", "onEvent", "event", "Lcom/msbshamim60/todoapp/feature_todo/presentation/todo_list/TodoListEvent;", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class TodoListViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.msbshamim60.todoapp.feature_todo.domain.usecase.AddTodoUseCase addTodoUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final com.msbshamim60.todoapp.feature_todo.domain.usecase.DeleteTodoUseCase deleteTodoUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final com.msbshamim60.todoapp.feature_todo.domain.usecase.ToggleArchivedUseCase toggleArchivedUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final com.msbshamim60.todoapp.feature_todo.domain.usecase.ToggleCompletedUseCase toggleCompletedUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final com.msbshamim60.todoapp.feature_todo.domain.usecase.GetAllTodoUseCase getAllTodoUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<com.msbshamim60.todoapp.feature_todo.presentation.todo_list.TodoListState> _state = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.State<com.msbshamim60.todoapp.feature_todo.presentation.todo_list.TodoListState> state = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.CoroutineExceptionHandler errorHandler = null;
    @org.jetbrains.annotations.Nullable
    private com.msbshamim60.todoapp.feature_todo.domain.model.TodoItem undoTodoItem;
    
    @javax.inject.Inject
    public TodoListViewModel(@org.jetbrains.annotations.NotNull
    com.msbshamim60.todoapp.feature_todo.domain.usecase.AddTodoUseCase addTodoUseCase, @org.jetbrains.annotations.NotNull
    com.msbshamim60.todoapp.feature_todo.domain.usecase.DeleteTodoUseCase deleteTodoUseCase, @org.jetbrains.annotations.NotNull
    com.msbshamim60.todoapp.feature_todo.domain.usecase.ToggleArchivedUseCase toggleArchivedUseCase, @org.jetbrains.annotations.NotNull
    com.msbshamim60.todoapp.feature_todo.domain.usecase.ToggleCompletedUseCase toggleCompletedUseCase, @org.jetbrains.annotations.NotNull
    com.msbshamim60.todoapp.feature_todo.domain.usecase.GetAllTodoUseCase getAllTodoUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.State<com.msbshamim60.todoapp.feature_todo.presentation.todo_list.TodoListState> getState() {
        return null;
    }
    
    public final void onEvent(@org.jetbrains.annotations.NotNull
    com.msbshamim60.todoapp.feature_todo.presentation.todo_list.TodoListEvent event) {
    }
    
    public final void getAllTodos() {
    }
}