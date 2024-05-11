package com.msbshamim60.todoapp.feature_todo.presentation.todo_new_update;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.android.components.ViewModelComponent;
import dagger.hilt.android.internal.lifecycle.HiltViewModelMap;
import dagger.hilt.codegen.OriginatingElement;
import dagger.multibindings.IntoMap;
import dagger.multibindings.IntoSet;
import dagger.multibindings.StringKey;
import java.lang.String;

@OriginatingElement(
    topLevelClass = NewUpdateTodoViewmodel.class
)
public final class NewUpdateTodoViewmodel_HiltModules {
  private NewUpdateTodoViewmodel_HiltModules() {
  }

  @Module
  @InstallIn(ViewModelComponent.class)
  public abstract static class BindsModule {
    private BindsModule() {
    }

    @Binds
    @IntoMap
    @StringKey("com.msbshamim60.todoapp.feature_todo.presentation.todo_new_update.NewUpdateTodoViewmodel")
    @HiltViewModelMap
    public abstract ViewModel binds(NewUpdateTodoViewmodel vm);
  }

  @Module
  @InstallIn(ActivityRetainedComponent.class)
  public static final class KeyModule {
    private KeyModule() {
    }

    @Provides
    @IntoSet
    @HiltViewModelMap.KeySet
    public static String provide() {
      return "com.msbshamim60.todoapp.feature_todo.presentation.todo_new_update.NewUpdateTodoViewmodel";
    }
  }
}
