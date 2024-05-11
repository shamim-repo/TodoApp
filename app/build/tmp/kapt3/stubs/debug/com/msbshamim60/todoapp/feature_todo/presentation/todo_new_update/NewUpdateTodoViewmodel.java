package com.msbshamim60.todoapp.feature_todo.presentation.todo_new_update;

import androidx.compose.runtime.State;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.msbshamim60.todoapp.core.utils.NewUpdateString;
import com.msbshamim60.todoapp.feature_todo.domain.usecase.AddTodoUseCase;
import com.msbshamim60.todoapp.feature_todo.domain.usecase.DeleteTodoUseCase;
import com.msbshamim60.todoapp.feature_todo.domain.usecase.GetTodoItemByIDUseCase;
import com.msbshamim60.todoapp.feature_todo.domain.usecase.ToggleArchivedUseCase;
import com.msbshamim60.todoapp.feature_todo.domain.usecase.ToggleCompletedUseCase;
import com.msbshamim60.todoapp.feature_todo.domain.usecase.UpdateTodoUseCase;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001,B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u000e\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001d\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00120#\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'\u00a8\u0006-"}, d2 = {"Lcom/msbshamim60/todoapp/feature_todo/presentation/todo_new_update/NewUpdateTodoViewmodel;", "Landroidx/lifecycle/ViewModel;", "addTodoUseCase", "Lcom/msbshamim60/todoapp/feature_todo/domain/usecase/AddTodoUseCase;", "getTodoItemByIDUseCase", "Lcom/msbshamim60/todoapp/feature_todo/domain/usecase/GetTodoItemByIDUseCase;", "deleteTodoUseCase", "Lcom/msbshamim60/todoapp/feature_todo/domain/usecase/DeleteTodoUseCase;", "updateTodoUseCase", "Lcom/msbshamim60/todoapp/feature_todo/domain/usecase/UpdateTodoUseCase;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Lcom/msbshamim60/todoapp/feature_todo/domain/usecase/AddTodoUseCase;Lcom/msbshamim60/todoapp/feature_todo/domain/usecase/GetTodoItemByIDUseCase;Lcom/msbshamim60/todoapp/feature_todo/domain/usecase/DeleteTodoUseCase;Lcom/msbshamim60/todoapp/feature_todo/domain/usecase/UpdateTodoUseCase;Landroidx/lifecycle/SavedStateHandle;)V", "_eventFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/msbshamim60/todoapp/feature_todo/presentation/todo_new_update/NewUpdateTodoViewmodel$UiEvents;", "_state", "Landroidx/compose/runtime/MutableState;", "Lcom/msbshamim60/todoapp/feature_todo/presentation/todo_new_update/TodoNewUpdateState;", "getAddTodoUseCase", "()Lcom/msbshamim60/todoapp/feature_todo/domain/usecase/AddTodoUseCase;", "currentTodoId", "", "Ljava/lang/Integer;", "getDeleteTodoUseCase", "()Lcom/msbshamim60/todoapp/feature_todo/domain/usecase/DeleteTodoUseCase;", "errorHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "eventFlow", "Lkotlinx/coroutines/flow/SharedFlow;", "getEventFlow", "()Lkotlinx/coroutines/flow/SharedFlow;", "getGetTodoItemByIDUseCase", "()Lcom/msbshamim60/todoapp/feature_todo/domain/usecase/GetTodoItemByIDUseCase;", "state", "Landroidx/compose/runtime/State;", "getState", "()Landroidx/compose/runtime/State;", "getUpdateTodoUseCase", "()Lcom/msbshamim60/todoapp/feature_todo/domain/usecase/UpdateTodoUseCase;", "onEvent", "", "event", "Lcom/msbshamim60/todoapp/feature_todo/presentation/todo_new_update/NewUpdateTodoEvent;", "UiEvents", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class NewUpdateTodoViewmodel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.msbshamim60.todoapp.feature_todo.domain.usecase.AddTodoUseCase addTodoUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final com.msbshamim60.todoapp.feature_todo.domain.usecase.GetTodoItemByIDUseCase getTodoItemByIDUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final com.msbshamim60.todoapp.feature_todo.domain.usecase.DeleteTodoUseCase deleteTodoUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final com.msbshamim60.todoapp.feature_todo.domain.usecase.UpdateTodoUseCase updateTodoUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<com.msbshamim60.todoapp.feature_todo.presentation.todo_new_update.TodoNewUpdateState> _state = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.State<com.msbshamim60.todoapp.feature_todo.presentation.todo_new_update.TodoNewUpdateState> state = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.CoroutineExceptionHandler errorHandler = null;
    @org.jetbrains.annotations.Nullable
    private java.lang.Integer currentTodoId;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.msbshamim60.todoapp.feature_todo.presentation.todo_new_update.NewUpdateTodoViewmodel.UiEvents> _eventFlow = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.SharedFlow<com.msbshamim60.todoapp.feature_todo.presentation.todo_new_update.NewUpdateTodoViewmodel.UiEvents> eventFlow = null;
    
    @javax.inject.Inject
    public NewUpdateTodoViewmodel(@org.jetbrains.annotations.NotNull
    com.msbshamim60.todoapp.feature_todo.domain.usecase.AddTodoUseCase addTodoUseCase, @org.jetbrains.annotations.NotNull
    com.msbshamim60.todoapp.feature_todo.domain.usecase.GetTodoItemByIDUseCase getTodoItemByIDUseCase, @org.jetbrains.annotations.NotNull
    com.msbshamim60.todoapp.feature_todo.domain.usecase.DeleteTodoUseCase deleteTodoUseCase, @org.jetbrains.annotations.NotNull
    com.msbshamim60.todoapp.feature_todo.domain.usecase.UpdateTodoUseCase updateTodoUseCase, @org.jetbrains.annotations.NotNull
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.msbshamim60.todoapp.feature_todo.domain.usecase.AddTodoUseCase getAddTodoUseCase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.msbshamim60.todoapp.feature_todo.domain.usecase.GetTodoItemByIDUseCase getGetTodoItemByIDUseCase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.msbshamim60.todoapp.feature_todo.domain.usecase.DeleteTodoUseCase getDeleteTodoUseCase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.msbshamim60.todoapp.feature_todo.domain.usecase.UpdateTodoUseCase getUpdateTodoUseCase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.State<com.msbshamim60.todoapp.feature_todo.presentation.todo_new_update.TodoNewUpdateState> getState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.SharedFlow<com.msbshamim60.todoapp.feature_todo.presentation.todo_new_update.NewUpdateTodoViewmodel.UiEvents> getEventFlow() {
        return null;
    }
    
    public final void onEvent(@org.jetbrains.annotations.NotNull
    com.msbshamim60.todoapp.feature_todo.presentation.todo_new_update.NewUpdateTodoEvent event) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lcom/msbshamim60/todoapp/feature_todo/presentation/todo_new_update/NewUpdateTodoViewmodel$UiEvents;", "", "()V", "Back", "Save", "ShowSnackBar", "Lcom/msbshamim60/todoapp/feature_todo/presentation/todo_new_update/NewUpdateTodoViewmodel$UiEvents$Back;", "Lcom/msbshamim60/todoapp/feature_todo/presentation/todo_new_update/NewUpdateTodoViewmodel$UiEvents$Save;", "Lcom/msbshamim60/todoapp/feature_todo/presentation/todo_new_update/NewUpdateTodoViewmodel$UiEvents$ShowSnackBar;", "app_debug"})
    public static abstract class UiEvents {
        
        private UiEvents() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/msbshamim60/todoapp/feature_todo/presentation/todo_new_update/NewUpdateTodoViewmodel$UiEvents$Back;", "Lcom/msbshamim60/todoapp/feature_todo/presentation/todo_new_update/NewUpdateTodoViewmodel$UiEvents;", "()V", "app_debug"})
        public static final class Back extends com.msbshamim60.todoapp.feature_todo.presentation.todo_new_update.NewUpdateTodoViewmodel.UiEvents {
            @org.jetbrains.annotations.NotNull
            public static final com.msbshamim60.todoapp.feature_todo.presentation.todo_new_update.NewUpdateTodoViewmodel.UiEvents.Back INSTANCE = null;
            
            private Back() {
            }
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/msbshamim60/todoapp/feature_todo/presentation/todo_new_update/NewUpdateTodoViewmodel$UiEvents$Save;", "Lcom/msbshamim60/todoapp/feature_todo/presentation/todo_new_update/NewUpdateTodoViewmodel$UiEvents;", "()V", "app_debug"})
        public static final class Save extends com.msbshamim60.todoapp.feature_todo.presentation.todo_new_update.NewUpdateTodoViewmodel.UiEvents {
            @org.jetbrains.annotations.NotNull
            public static final com.msbshamim60.todoapp.feature_todo.presentation.todo_new_update.NewUpdateTodoViewmodel.UiEvents.Save INSTANCE = null;
            
            private Save() {
            }
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/msbshamim60/todoapp/feature_todo/presentation/todo_new_update/NewUpdateTodoViewmodel$UiEvents$ShowSnackBar;", "Lcom/msbshamim60/todoapp/feature_todo/presentation/todo_new_update/NewUpdateTodoViewmodel$UiEvents;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
        public static final class ShowSnackBar extends com.msbshamim60.todoapp.feature_todo.presentation.todo_new_update.NewUpdateTodoViewmodel.UiEvents {
            @org.jetbrains.annotations.NotNull
            private final java.lang.String message = null;
            
            public ShowSnackBar(@org.jetbrains.annotations.NotNull
            java.lang.String message) {
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String getMessage() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.msbshamim60.todoapp.feature_todo.presentation.todo_new_update.NewUpdateTodoViewmodel.UiEvents.ShowSnackBar copy(@org.jetbrains.annotations.NotNull
            java.lang.String message) {
                return null;
            }
            
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override
            @org.jetbrains.annotations.NotNull
            public java.lang.String toString() {
                return null;
            }
        }
    }
}