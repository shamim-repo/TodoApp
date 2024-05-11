// Generated by Dagger (https://dagger.dev).
package com.msbshamim60.todoapp.feature_todo.presentation.todo_new_update;

import androidx.lifecycle.SavedStateHandle;
import com.msbshamim60.todoapp.feature_todo.domain.usecase.AddTodoUseCase;
import com.msbshamim60.todoapp.feature_todo.domain.usecase.DeleteTodoUseCase;
import com.msbshamim60.todoapp.feature_todo.domain.usecase.GetTodoItemByIDUseCase;
import com.msbshamim60.todoapp.feature_todo.domain.usecase.UpdateTodoUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class NewUpdateTodoViewmodel_Factory implements Factory<NewUpdateTodoViewmodel> {
  private final Provider<AddTodoUseCase> addTodoUseCaseProvider;

  private final Provider<GetTodoItemByIDUseCase> getTodoItemByIDUseCaseProvider;

  private final Provider<DeleteTodoUseCase> deleteTodoUseCaseProvider;

  private final Provider<UpdateTodoUseCase> updateTodoUseCaseProvider;

  private final Provider<SavedStateHandle> savedStateHandleProvider;

  public NewUpdateTodoViewmodel_Factory(Provider<AddTodoUseCase> addTodoUseCaseProvider,
      Provider<GetTodoItemByIDUseCase> getTodoItemByIDUseCaseProvider,
      Provider<DeleteTodoUseCase> deleteTodoUseCaseProvider,
      Provider<UpdateTodoUseCase> updateTodoUseCaseProvider,
      Provider<SavedStateHandle> savedStateHandleProvider) {
    this.addTodoUseCaseProvider = addTodoUseCaseProvider;
    this.getTodoItemByIDUseCaseProvider = getTodoItemByIDUseCaseProvider;
    this.deleteTodoUseCaseProvider = deleteTodoUseCaseProvider;
    this.updateTodoUseCaseProvider = updateTodoUseCaseProvider;
    this.savedStateHandleProvider = savedStateHandleProvider;
  }

  @Override
  public NewUpdateTodoViewmodel get() {
    return newInstance(addTodoUseCaseProvider.get(), getTodoItemByIDUseCaseProvider.get(), deleteTodoUseCaseProvider.get(), updateTodoUseCaseProvider.get(), savedStateHandleProvider.get());
  }

  public static NewUpdateTodoViewmodel_Factory create(
      Provider<AddTodoUseCase> addTodoUseCaseProvider,
      Provider<GetTodoItemByIDUseCase> getTodoItemByIDUseCaseProvider,
      Provider<DeleteTodoUseCase> deleteTodoUseCaseProvider,
      Provider<UpdateTodoUseCase> updateTodoUseCaseProvider,
      Provider<SavedStateHandle> savedStateHandleProvider) {
    return new NewUpdateTodoViewmodel_Factory(addTodoUseCaseProvider, getTodoItemByIDUseCaseProvider, deleteTodoUseCaseProvider, updateTodoUseCaseProvider, savedStateHandleProvider);
  }

  public static NewUpdateTodoViewmodel newInstance(AddTodoUseCase addTodoUseCase,
      GetTodoItemByIDUseCase getTodoItemByIDUseCase, DeleteTodoUseCase deleteTodoUseCase,
      UpdateTodoUseCase updateTodoUseCase, SavedStateHandle savedStateHandle) {
    return new NewUpdateTodoViewmodel(addTodoUseCase, getTodoItemByIDUseCase, deleteTodoUseCase, updateTodoUseCase, savedStateHandle);
  }
}
