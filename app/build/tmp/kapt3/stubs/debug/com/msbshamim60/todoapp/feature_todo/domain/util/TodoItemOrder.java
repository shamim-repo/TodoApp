package com.msbshamim60.todoapp.feature_todo.domain.util;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\f\r\u000eB\u0017\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0082\u0001\u0003\u000f\u0010\u0011\u00a8\u0006\u0012"}, d2 = {"Lcom/msbshamim60/todoapp/feature_todo/domain/util/TodoItemOrder;", "", "showArchive", "", "sortDirection", "Lcom/msbshamim60/todoapp/feature_todo/domain/util/SortDirection;", "(ZLcom/msbshamim60/todoapp/feature_todo/domain/util/SortDirection;)V", "getShowArchive", "()Z", "getSortDirection", "()Lcom/msbshamim60/todoapp/feature_todo/domain/util/SortDirection;", "copy", "Completed", "Time", "Title", "Lcom/msbshamim60/todoapp/feature_todo/domain/util/TodoItemOrder$Completed;", "Lcom/msbshamim60/todoapp/feature_todo/domain/util/TodoItemOrder$Time;", "Lcom/msbshamim60/todoapp/feature_todo/domain/util/TodoItemOrder$Title;", "app_debug"})
public abstract class TodoItemOrder {
    private final boolean showArchive = false;
    @org.jetbrains.annotations.NotNull
    private final com.msbshamim60.todoapp.feature_todo.domain.util.SortDirection sortDirection = null;
    
    private TodoItemOrder(boolean showArchive, com.msbshamim60.todoapp.feature_todo.domain.util.SortDirection sortDirection) {
        super();
    }
    
    public final boolean getShowArchive() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.msbshamim60.todoapp.feature_todo.domain.util.SortDirection getSortDirection() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.msbshamim60.todoapp.feature_todo.domain.util.TodoItemOrder copy(boolean showArchive, @org.jetbrains.annotations.NotNull
    com.msbshamim60.todoapp.feature_todo.domain.util.SortDirection sortDirection) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/msbshamim60/todoapp/feature_todo/domain/util/TodoItemOrder$Completed;", "Lcom/msbshamim60/todoapp/feature_todo/domain/util/TodoItemOrder;", "showArchive", "", "sortDirection", "Lcom/msbshamim60/todoapp/feature_todo/domain/util/SortDirection;", "(ZLcom/msbshamim60/todoapp/feature_todo/domain/util/SortDirection;)V", "app_debug"})
    public static final class Completed extends com.msbshamim60.todoapp.feature_todo.domain.util.TodoItemOrder {
        
        public Completed(boolean showArchive, @org.jetbrains.annotations.NotNull
        com.msbshamim60.todoapp.feature_todo.domain.util.SortDirection sortDirection) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/msbshamim60/todoapp/feature_todo/domain/util/TodoItemOrder$Time;", "Lcom/msbshamim60/todoapp/feature_todo/domain/util/TodoItemOrder;", "showArchive", "", "sortDirection", "Lcom/msbshamim60/todoapp/feature_todo/domain/util/SortDirection;", "(ZLcom/msbshamim60/todoapp/feature_todo/domain/util/SortDirection;)V", "app_debug"})
    public static final class Time extends com.msbshamim60.todoapp.feature_todo.domain.util.TodoItemOrder {
        
        public Time(boolean showArchive, @org.jetbrains.annotations.NotNull
        com.msbshamim60.todoapp.feature_todo.domain.util.SortDirection sortDirection) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/msbshamim60/todoapp/feature_todo/domain/util/TodoItemOrder$Title;", "Lcom/msbshamim60/todoapp/feature_todo/domain/util/TodoItemOrder;", "showArchive", "", "sortDirection", "Lcom/msbshamim60/todoapp/feature_todo/domain/util/SortDirection;", "(ZLcom/msbshamim60/todoapp/feature_todo/domain/util/SortDirection;)V", "app_debug"})
    public static final class Title extends com.msbshamim60.todoapp.feature_todo.domain.util.TodoItemOrder {
        
        public Title(boolean showArchive, @org.jetbrains.annotations.NotNull
        com.msbshamim60.todoapp.feature_todo.domain.util.SortDirection sortDirection) {
        }
    }
}