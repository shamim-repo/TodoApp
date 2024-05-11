package com.msbshamim60.todoapp.feature_todo.data.di

import android.content.Context
import androidx.room.Room
import com.msbshamim60.todoapp.core.utils.DATABASE_NAME
import com.msbshamim60.todoapp.feature_todo.data.local.TodoDao
import com.msbshamim60.todoapp.feature_todo.data.local.TodoDatabase
import com.msbshamim60.todoapp.feature_todo.data.local.todoList
import com.msbshamim60.todoapp.feature_todo.data.repo.TodoRepositoryImpl
import com.msbshamim60.todoapp.feature_todo.domain.repo.TodoRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object TodoModule {

    @Provides
    fun provideTodoDao(todoDatabase: TodoDatabase): TodoDao {
        return todoDatabase.todoDao
    }

    @Provides
    @Singleton
    fun provideTodoDatabase(
        @ApplicationContext context: Context
    ): TodoDatabase {
        val db= Room.databaseBuilder(
            context.applicationContext,
            TodoDatabase::class.java,
            DATABASE_NAME
        ).fallbackToDestructiveMigration().build()
        return db


    }

    @Provides
    @Singleton
    fun provideTodoRepo(todoDao: TodoDao): TodoRepository{
        return TodoRepositoryImpl(todoDao = todoDao)
    }
}