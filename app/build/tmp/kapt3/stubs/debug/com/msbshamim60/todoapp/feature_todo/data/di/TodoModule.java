package com.msbshamim60.todoapp.feature_todo.data.di;

import android.content.Context;
import androidx.room.Room;
import com.msbshamim60.todoapp.feature_todo.data.local.TodoDao;
import com.msbshamim60.todoapp.feature_todo.data.local.TodoDatabase;
import com.msbshamim60.todoapp.feature_todo.data.repo.TodoRepositoryImpl;
import com.msbshamim60.todoapp.feature_todo.domain.repo.TodoRepository;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;
import kotlinx.coroutines.Dispatchers;
import javax.inject.Singleton;

@dagger.Module
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004H\u0007\u00a8\u0006\r"}, d2 = {"Lcom/msbshamim60/todoapp/feature_todo/data/di/TodoModule;", "", "()V", "provideTodoDao", "Lcom/msbshamim60/todoapp/feature_todo/data/local/TodoDao;", "todoDatabase", "Lcom/msbshamim60/todoapp/feature_todo/data/local/TodoDatabase;", "provideTodoDatabase", "context", "Landroid/content/Context;", "provideTodoRepo", "Lcom/msbshamim60/todoapp/feature_todo/domain/repo/TodoRepository;", "todoDao", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class TodoModule {
    @org.jetbrains.annotations.NotNull
    public static final com.msbshamim60.todoapp.feature_todo.data.di.TodoModule INSTANCE = null;
    
    private TodoModule() {
        super();
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.msbshamim60.todoapp.feature_todo.data.local.TodoDao provideTodoDao(@org.jetbrains.annotations.NotNull
    com.msbshamim60.todoapp.feature_todo.data.local.TodoDatabase todoDatabase) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.msbshamim60.todoapp.feature_todo.data.local.TodoDatabase provideTodoDatabase(@dagger.hilt.android.qualifiers.ApplicationContext
    @org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.msbshamim60.todoapp.feature_todo.domain.repo.TodoRepository provideTodoRepo(@org.jetbrains.annotations.NotNull
    com.msbshamim60.todoapp.feature_todo.data.local.TodoDao todoDao) {
        return null;
    }
}