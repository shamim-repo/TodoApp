// Generated by Dagger (https://dagger.dev).
package com.msbshamim60.todoapp.feature_todo.data.di;

import com.msbshamim60.todoapp.feature_todo.data.local.TodoDao;
import com.msbshamim60.todoapp.feature_todo.domain.repo.TodoRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class TodoModule_ProvideTodoRepoFactory implements Factory<TodoRepository> {
  private final Provider<TodoDao> todoDaoProvider;

  public TodoModule_ProvideTodoRepoFactory(Provider<TodoDao> todoDaoProvider) {
    this.todoDaoProvider = todoDaoProvider;
  }

  @Override
  public TodoRepository get() {
    return provideTodoRepo(todoDaoProvider.get());
  }

  public static TodoModule_ProvideTodoRepoFactory create(Provider<TodoDao> todoDaoProvider) {
    return new TodoModule_ProvideTodoRepoFactory(todoDaoProvider);
  }

  public static TodoRepository provideTodoRepo(TodoDao todoDao) {
    return Preconditions.checkNotNullFromProvides(TodoModule.INSTANCE.provideTodoRepo(todoDao));
  }
}