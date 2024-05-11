package com.msbshamim60.todoapp.feature_todo.presentation.todo_list;

import com.msbshamim60.todoapp.feature_todo.domain.model.TodoItem;
import com.msbshamim60.todoapp.feature_todo.domain.util.TodoItemOrder;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0005\b\t\n\u000b\f\u00a8\u0006\r"}, d2 = {"Lcom/msbshamim60/todoapp/feature_todo/presentation/todo_list/TodoListEvent;", "", "()V", "Delete", "Sort", "ToggleArchive", "ToggleComplete", "UndoDelete", "Lcom/msbshamim60/todoapp/feature_todo/presentation/todo_list/TodoListEvent$Delete;", "Lcom/msbshamim60/todoapp/feature_todo/presentation/todo_list/TodoListEvent$Sort;", "Lcom/msbshamim60/todoapp/feature_todo/presentation/todo_list/TodoListEvent$ToggleArchive;", "Lcom/msbshamim60/todoapp/feature_todo/presentation/todo_list/TodoListEvent$ToggleComplete;", "Lcom/msbshamim60/todoapp/feature_todo/presentation/todo_list/TodoListEvent$UndoDelete;", "app_debug"})
public abstract class TodoListEvent {
    
    private TodoListEvent() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/msbshamim60/todoapp/feature_todo/presentation/todo_list/TodoListEvent$Delete;", "Lcom/msbshamim60/todoapp/feature_todo/presentation/todo_list/TodoListEvent;", "todoItem", "Lcom/msbshamim60/todoapp/feature_todo/domain/model/TodoItem;", "(Lcom/msbshamim60/todoapp/feature_todo/domain/model/TodoItem;)V", "getTodoItem", "()Lcom/msbshamim60/todoapp/feature_todo/domain/model/TodoItem;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class Delete extends com.msbshamim60.todoapp.feature_todo.presentation.todo_list.TodoListEvent {
        @org.jetbrains.annotations.NotNull
        private final com.msbshamim60.todoapp.feature_todo.domain.model.TodoItem todoItem = null;
        
        public Delete(@org.jetbrains.annotations.NotNull
        com.msbshamim60.todoapp.feature_todo.domain.model.TodoItem todoItem) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.msbshamim60.todoapp.feature_todo.domain.model.TodoItem getTodoItem() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.msbshamim60.todoapp.feature_todo.domain.model.TodoItem component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.msbshamim60.todoapp.feature_todo.presentation.todo_list.TodoListEvent.Delete copy(@org.jetbrains.annotations.NotNull
        com.msbshamim60.todoapp.feature_todo.domain.model.TodoItem todoItem) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/msbshamim60/todoapp/feature_todo/presentation/todo_list/TodoListEvent$Sort;", "Lcom/msbshamim60/todoapp/feature_todo/presentation/todo_list/TodoListEvent;", "todoItemOrder", "Lcom/msbshamim60/todoapp/feature_todo/domain/util/TodoItemOrder;", "(Lcom/msbshamim60/todoapp/feature_todo/domain/util/TodoItemOrder;)V", "getTodoItemOrder", "()Lcom/msbshamim60/todoapp/feature_todo/domain/util/TodoItemOrder;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class Sort extends com.msbshamim60.todoapp.feature_todo.presentation.todo_list.TodoListEvent {
        @org.jetbrains.annotations.NotNull
        private final com.msbshamim60.todoapp.feature_todo.domain.util.TodoItemOrder todoItemOrder = null;
        
        public Sort(@org.jetbrains.annotations.NotNull
        com.msbshamim60.todoapp.feature_todo.domain.util.TodoItemOrder todoItemOrder) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.msbshamim60.todoapp.feature_todo.domain.util.TodoItemOrder getTodoItemOrder() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.msbshamim60.todoapp.feature_todo.domain.util.TodoItemOrder component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.msbshamim60.todoapp.feature_todo.presentation.todo_list.TodoListEvent.Sort copy(@org.jetbrains.annotations.NotNull
        com.msbshamim60.todoapp.feature_todo.domain.util.TodoItemOrder todoItemOrder) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/msbshamim60/todoapp/feature_todo/presentation/todo_list/TodoListEvent$ToggleArchive;", "Lcom/msbshamim60/todoapp/feature_todo/presentation/todo_list/TodoListEvent;", "todoItem", "Lcom/msbshamim60/todoapp/feature_todo/domain/model/TodoItem;", "(Lcom/msbshamim60/todoapp/feature_todo/domain/model/TodoItem;)V", "getTodoItem", "()Lcom/msbshamim60/todoapp/feature_todo/domain/model/TodoItem;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class ToggleArchive extends com.msbshamim60.todoapp.feature_todo.presentation.todo_list.TodoListEvent {
        @org.jetbrains.annotations.NotNull
        private final com.msbshamim60.todoapp.feature_todo.domain.model.TodoItem todoItem = null;
        
        public ToggleArchive(@org.jetbrains.annotations.NotNull
        com.msbshamim60.todoapp.feature_todo.domain.model.TodoItem todoItem) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.msbshamim60.todoapp.feature_todo.domain.model.TodoItem getTodoItem() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.msbshamim60.todoapp.feature_todo.domain.model.TodoItem component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.msbshamim60.todoapp.feature_todo.presentation.todo_list.TodoListEvent.ToggleArchive copy(@org.jetbrains.annotations.NotNull
        com.msbshamim60.todoapp.feature_todo.domain.model.TodoItem todoItem) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/msbshamim60/todoapp/feature_todo/presentation/todo_list/TodoListEvent$ToggleComplete;", "Lcom/msbshamim60/todoapp/feature_todo/presentation/todo_list/TodoListEvent;", "todoItem", "Lcom/msbshamim60/todoapp/feature_todo/domain/model/TodoItem;", "(Lcom/msbshamim60/todoapp/feature_todo/domain/model/TodoItem;)V", "getTodoItem", "()Lcom/msbshamim60/todoapp/feature_todo/domain/model/TodoItem;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class ToggleComplete extends com.msbshamim60.todoapp.feature_todo.presentation.todo_list.TodoListEvent {
        @org.jetbrains.annotations.NotNull
        private final com.msbshamim60.todoapp.feature_todo.domain.model.TodoItem todoItem = null;
        
        public ToggleComplete(@org.jetbrains.annotations.NotNull
        com.msbshamim60.todoapp.feature_todo.domain.model.TodoItem todoItem) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.msbshamim60.todoapp.feature_todo.domain.model.TodoItem getTodoItem() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.msbshamim60.todoapp.feature_todo.domain.model.TodoItem component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.msbshamim60.todoapp.feature_todo.presentation.todo_list.TodoListEvent.ToggleComplete copy(@org.jetbrains.annotations.NotNull
        com.msbshamim60.todoapp.feature_todo.domain.model.TodoItem todoItem) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/msbshamim60/todoapp/feature_todo/presentation/todo_list/TodoListEvent$UndoDelete;", "Lcom/msbshamim60/todoapp/feature_todo/presentation/todo_list/TodoListEvent;", "()V", "app_debug"})
    public static final class UndoDelete extends com.msbshamim60.todoapp.feature_todo.presentation.todo_list.TodoListEvent {
        @org.jetbrains.annotations.NotNull
        public static final com.msbshamim60.todoapp.feature_todo.presentation.todo_list.TodoListEvent.UndoDelete INSTANCE = null;
        
        private UndoDelete() {
        }
    }
}