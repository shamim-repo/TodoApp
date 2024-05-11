package com.msbshamim60.todoapp.feature_todo.domain.repo;

import com.msbshamim60.todoapp.feature_todo.domain.model.TodoItem;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u001b\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\fH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u001f\u0010\u000e\u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u0019\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Lcom/msbshamim60/todoapp/feature_todo/domain/repo/TodoRepository;", "", "deleteTodoItem", "", "todoItem", "Lcom/msbshamim60/todoapp/feature_todo/domain/model/TodoItem;", "(Lcom/msbshamim60/todoapp/feature_todo/domain/model/TodoItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllTodoItems", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTodoItemById", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertAllTodoItems", "todoItems", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertTodoItem", "updateTodoItem", "app_debug"})
public abstract interface TodoRepository {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getAllTodoItems(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.msbshamim60.todoapp.feature_todo.domain.model.TodoItem>> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getTodoItemById(int id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.msbshamim60.todoapp.feature_todo.domain.model.TodoItem> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object insertTodoItem(@org.jetbrains.annotations.NotNull
    com.msbshamim60.todoapp.feature_todo.domain.model.TodoItem todoItem, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object insertAllTodoItems(@org.jetbrains.annotations.NotNull
    java.util.List<com.msbshamim60.todoapp.feature_todo.domain.model.TodoItem> todoItems, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object updateTodoItem(@org.jetbrains.annotations.NotNull
    com.msbshamim60.todoapp.feature_todo.domain.model.TodoItem todoItem, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteTodoItem(@org.jetbrains.annotations.NotNull
    com.msbshamim60.todoapp.feature_todo.domain.model.TodoItem todoItem, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}