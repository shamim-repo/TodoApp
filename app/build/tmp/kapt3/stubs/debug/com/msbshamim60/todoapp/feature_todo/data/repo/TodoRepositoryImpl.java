package com.msbshamim60.todoapp.feature_todo.data.repo;

import com.msbshamim60.todoapp.feature_todo.data.local.TodoDao;
import com.msbshamim60.todoapp.feature_todo.domain.model.TodoItem;
import com.msbshamim60.todoapp.feature_todo.domain.repo.TodoRepository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u001b\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\u00062\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u0019\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0016"}, d2 = {"Lcom/msbshamim60/todoapp/feature_todo/data/repo/TodoRepositoryImpl;", "Lcom/msbshamim60/todoapp/feature_todo/domain/repo/TodoRepository;", "todoDao", "Lcom/msbshamim60/todoapp/feature_todo/data/local/TodoDao;", "(Lcom/msbshamim60/todoapp/feature_todo/data/local/TodoDao;)V", "deleteTodoItem", "", "todoItem", "Lcom/msbshamim60/todoapp/feature_todo/domain/model/TodoItem;", "(Lcom/msbshamim60/todoapp/feature_todo/domain/model/TodoItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllTodoItems", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTodoItemById", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertAllTodoItems", "todoItems", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertTodoItem", "updateTodoItem", "app_debug"})
public final class TodoRepositoryImpl implements com.msbshamim60.todoapp.feature_todo.domain.repo.TodoRepository {
    @org.jetbrains.annotations.NotNull
    private final com.msbshamim60.todoapp.feature_todo.data.local.TodoDao todoDao = null;
    
    public TodoRepositoryImpl(@org.jetbrains.annotations.NotNull
    com.msbshamim60.todoapp.feature_todo.data.local.TodoDao todoDao) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object getAllTodoItems(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.msbshamim60.todoapp.feature_todo.domain.model.TodoItem>> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object getTodoItemById(int id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.msbshamim60.todoapp.feature_todo.domain.model.TodoItem> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object insertTodoItem(@org.jetbrains.annotations.NotNull
    com.msbshamim60.todoapp.feature_todo.domain.model.TodoItem todoItem, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object insertAllTodoItems(@org.jetbrains.annotations.NotNull
    java.util.List<com.msbshamim60.todoapp.feature_todo.domain.model.TodoItem> todoItems, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object updateTodoItem(@org.jetbrains.annotations.NotNull
    com.msbshamim60.todoapp.feature_todo.domain.model.TodoItem todoItem, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object deleteTodoItem(@org.jetbrains.annotations.NotNull
    com.msbshamim60.todoapp.feature_todo.domain.model.TodoItem todoItem, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}