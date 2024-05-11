package com.msbshamim60.todoapp.feature_todo.presentation.todo_new_update;

import androidx.compose.ui.focus.FocusState;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\t\u0003\u0004\u0005\u0006\u0007\b\t\n\u000bB\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\t\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u00a8\u0006\u0015"}, d2 = {"Lcom/msbshamim60/todoapp/feature_todo/presentation/todo_new_update/NewUpdateTodoEvent;", "", "()V", "Back", "ChangedDescriptionFocus", "ChangedTitleFocus", "Delete", "EnteredDescription", "EnteredTitle", "Save", "ToggleArchived", "ToggleCompleted", "Lcom/msbshamim60/todoapp/feature_todo/presentation/todo_new_update/NewUpdateTodoEvent$Back;", "Lcom/msbshamim60/todoapp/feature_todo/presentation/todo_new_update/NewUpdateTodoEvent$ChangedDescriptionFocus;", "Lcom/msbshamim60/todoapp/feature_todo/presentation/todo_new_update/NewUpdateTodoEvent$ChangedTitleFocus;", "Lcom/msbshamim60/todoapp/feature_todo/presentation/todo_new_update/NewUpdateTodoEvent$Delete;", "Lcom/msbshamim60/todoapp/feature_todo/presentation/todo_new_update/NewUpdateTodoEvent$EnteredDescription;", "Lcom/msbshamim60/todoapp/feature_todo/presentation/todo_new_update/NewUpdateTodoEvent$EnteredTitle;", "Lcom/msbshamim60/todoapp/feature_todo/presentation/todo_new_update/NewUpdateTodoEvent$Save;", "Lcom/msbshamim60/todoapp/feature_todo/presentation/todo_new_update/NewUpdateTodoEvent$ToggleArchived;", "Lcom/msbshamim60/todoapp/feature_todo/presentation/todo_new_update/NewUpdateTodoEvent$ToggleCompleted;", "app_debug"})
public abstract class NewUpdateTodoEvent {
    
    private NewUpdateTodoEvent() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/msbshamim60/todoapp/feature_todo/presentation/todo_new_update/NewUpdateTodoEvent$Back;", "Lcom/msbshamim60/todoapp/feature_todo/presentation/todo_new_update/NewUpdateTodoEvent;", "()V", "app_debug"})
    public static final class Back extends com.msbshamim60.todoapp.feature_todo.presentation.todo_new_update.NewUpdateTodoEvent {
        @org.jetbrains.annotations.NotNull
        public static final com.msbshamim60.todoapp.feature_todo.presentation.todo_new_update.NewUpdateTodoEvent.Back INSTANCE = null;
        
        private Back() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/msbshamim60/todoapp/feature_todo/presentation/todo_new_update/NewUpdateTodoEvent$ChangedDescriptionFocus;", "Lcom/msbshamim60/todoapp/feature_todo/presentation/todo_new_update/NewUpdateTodoEvent;", "state", "Landroidx/compose/ui/focus/FocusState;", "(Landroidx/compose/ui/focus/FocusState;)V", "getState", "()Landroidx/compose/ui/focus/FocusState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class ChangedDescriptionFocus extends com.msbshamim60.todoapp.feature_todo.presentation.todo_new_update.NewUpdateTodoEvent {
        @org.jetbrains.annotations.NotNull
        private final androidx.compose.ui.focus.FocusState state = null;
        
        public ChangedDescriptionFocus(@org.jetbrains.annotations.NotNull
        androidx.compose.ui.focus.FocusState state) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.compose.ui.focus.FocusState getState() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.compose.ui.focus.FocusState component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.msbshamim60.todoapp.feature_todo.presentation.todo_new_update.NewUpdateTodoEvent.ChangedDescriptionFocus copy(@org.jetbrains.annotations.NotNull
        androidx.compose.ui.focus.FocusState state) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/msbshamim60/todoapp/feature_todo/presentation/todo_new_update/NewUpdateTodoEvent$ChangedTitleFocus;", "Lcom/msbshamim60/todoapp/feature_todo/presentation/todo_new_update/NewUpdateTodoEvent;", "state", "Landroidx/compose/ui/focus/FocusState;", "(Landroidx/compose/ui/focus/FocusState;)V", "getState", "()Landroidx/compose/ui/focus/FocusState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class ChangedTitleFocus extends com.msbshamim60.todoapp.feature_todo.presentation.todo_new_update.NewUpdateTodoEvent {
        @org.jetbrains.annotations.NotNull
        private final androidx.compose.ui.focus.FocusState state = null;
        
        public ChangedTitleFocus(@org.jetbrains.annotations.NotNull
        androidx.compose.ui.focus.FocusState state) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.compose.ui.focus.FocusState getState() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.compose.ui.focus.FocusState component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.msbshamim60.todoapp.feature_todo.presentation.todo_new_update.NewUpdateTodoEvent.ChangedTitleFocus copy(@org.jetbrains.annotations.NotNull
        androidx.compose.ui.focus.FocusState state) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/msbshamim60/todoapp/feature_todo/presentation/todo_new_update/NewUpdateTodoEvent$Delete;", "Lcom/msbshamim60/todoapp/feature_todo/presentation/todo_new_update/NewUpdateTodoEvent;", "()V", "app_debug"})
    public static final class Delete extends com.msbshamim60.todoapp.feature_todo.presentation.todo_new_update.NewUpdateTodoEvent {
        @org.jetbrains.annotations.NotNull
        public static final com.msbshamim60.todoapp.feature_todo.presentation.todo_new_update.NewUpdateTodoEvent.Delete INSTANCE = null;
        
        private Delete() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/msbshamim60/todoapp/feature_todo/presentation/todo_new_update/NewUpdateTodoEvent$EnteredDescription;", "Lcom/msbshamim60/todoapp/feature_todo/presentation/todo_new_update/NewUpdateTodoEvent;", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class EnteredDescription extends com.msbshamim60.todoapp.feature_todo.presentation.todo_new_update.NewUpdateTodoEvent {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String value = null;
        
        public EnteredDescription(@org.jetbrains.annotations.NotNull
        java.lang.String value) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getValue() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.msbshamim60.todoapp.feature_todo.presentation.todo_new_update.NewUpdateTodoEvent.EnteredDescription copy(@org.jetbrains.annotations.NotNull
        java.lang.String value) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/msbshamim60/todoapp/feature_todo/presentation/todo_new_update/NewUpdateTodoEvent$EnteredTitle;", "Lcom/msbshamim60/todoapp/feature_todo/presentation/todo_new_update/NewUpdateTodoEvent;", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class EnteredTitle extends com.msbshamim60.todoapp.feature_todo.presentation.todo_new_update.NewUpdateTodoEvent {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String value = null;
        
        public EnteredTitle(@org.jetbrains.annotations.NotNull
        java.lang.String value) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getValue() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.msbshamim60.todoapp.feature_todo.presentation.todo_new_update.NewUpdateTodoEvent.EnteredTitle copy(@org.jetbrains.annotations.NotNull
        java.lang.String value) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/msbshamim60/todoapp/feature_todo/presentation/todo_new_update/NewUpdateTodoEvent$Save;", "Lcom/msbshamim60/todoapp/feature_todo/presentation/todo_new_update/NewUpdateTodoEvent;", "()V", "app_debug"})
    public static final class Save extends com.msbshamim60.todoapp.feature_todo.presentation.todo_new_update.NewUpdateTodoEvent {
        @org.jetbrains.annotations.NotNull
        public static final com.msbshamim60.todoapp.feature_todo.presentation.todo_new_update.NewUpdateTodoEvent.Save INSTANCE = null;
        
        private Save() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/msbshamim60/todoapp/feature_todo/presentation/todo_new_update/NewUpdateTodoEvent$ToggleArchived;", "Lcom/msbshamim60/todoapp/feature_todo/presentation/todo_new_update/NewUpdateTodoEvent;", "()V", "app_debug"})
    public static final class ToggleArchived extends com.msbshamim60.todoapp.feature_todo.presentation.todo_new_update.NewUpdateTodoEvent {
        @org.jetbrains.annotations.NotNull
        public static final com.msbshamim60.todoapp.feature_todo.presentation.todo_new_update.NewUpdateTodoEvent.ToggleArchived INSTANCE = null;
        
        private ToggleArchived() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/msbshamim60/todoapp/feature_todo/presentation/todo_new_update/NewUpdateTodoEvent$ToggleCompleted;", "Lcom/msbshamim60/todoapp/feature_todo/presentation/todo_new_update/NewUpdateTodoEvent;", "()V", "app_debug"})
    public static final class ToggleCompleted extends com.msbshamim60.todoapp.feature_todo.presentation.todo_new_update.NewUpdateTodoEvent {
        @org.jetbrains.annotations.NotNull
        public static final com.msbshamim60.todoapp.feature_todo.presentation.todo_new_update.NewUpdateTodoEvent.ToggleCompleted INSTANCE = null;
        
        private ToggleCompleted() {
        }
    }
}