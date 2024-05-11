package com.msbshamim60.todoapp.feature_todo.domain.usecase;

import com.msbshamim60.todoapp.feature_todo.domain.model.TodoItem;
import com.msbshamim60.todoapp.feature_todo.domain.repo.TodoRepository;
import com.msbshamim60.todoapp.feature_todo.domain.util.GetAllTodoItemResult;
import com.msbshamim60.todoapp.feature_todo.domain.util.SortDirection;
import com.msbshamim60.todoapp.feature_todo.domain.util.TodoItemOrder;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001b\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0086B\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/msbshamim60/todoapp/feature_todo/domain/usecase/GetAllTodoUseCase;", "", "repo", "Lcom/msbshamim60/todoapp/feature_todo/domain/repo/TodoRepository;", "(Lcom/msbshamim60/todoapp/feature_todo/domain/repo/TodoRepository;)V", "invoke", "Lcom/msbshamim60/todoapp/feature_todo/domain/util/GetAllTodoItemResult;", "order", "Lcom/msbshamim60/todoapp/feature_todo/domain/util/TodoItemOrder;", "(Lcom/msbshamim60/todoapp/feature_todo/domain/util/TodoItemOrder;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class GetAllTodoUseCase {
    @org.jetbrains.annotations.NotNull
    private final com.msbshamim60.todoapp.feature_todo.domain.repo.TodoRepository repo = null;
    
    @javax.inject.Inject
    public GetAllTodoUseCase(@org.jetbrains.annotations.NotNull
    com.msbshamim60.todoapp.feature_todo.domain.repo.TodoRepository repo) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull
    com.msbshamim60.todoapp.feature_todo.domain.util.TodoItemOrder order, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.msbshamim60.todoapp.feature_todo.domain.util.GetAllTodoItemResult> $completion) {
        return null;
    }
}