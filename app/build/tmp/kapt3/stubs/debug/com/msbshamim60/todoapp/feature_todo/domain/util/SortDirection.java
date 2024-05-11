package com.msbshamim60.todoapp.feature_todo.domain.util;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/msbshamim60/todoapp/feature_todo/domain/util/SortDirection;", "", "()V", "Down", "Up", "Lcom/msbshamim60/todoapp/feature_todo/domain/util/SortDirection$Down;", "Lcom/msbshamim60/todoapp/feature_todo/domain/util/SortDirection$Up;", "app_debug"})
public abstract class SortDirection {
    
    private SortDirection() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/msbshamim60/todoapp/feature_todo/domain/util/SortDirection$Down;", "Lcom/msbshamim60/todoapp/feature_todo/domain/util/SortDirection;", "()V", "app_debug"})
    public static final class Down extends com.msbshamim60.todoapp.feature_todo.domain.util.SortDirection {
        @org.jetbrains.annotations.NotNull
        public static final com.msbshamim60.todoapp.feature_todo.domain.util.SortDirection.Down INSTANCE = null;
        
        private Down() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/msbshamim60/todoapp/feature_todo/domain/util/SortDirection$Up;", "Lcom/msbshamim60/todoapp/feature_todo/domain/util/SortDirection;", "()V", "app_debug"})
    public static final class Up extends com.msbshamim60.todoapp.feature_todo.domain.util.SortDirection {
        @org.jetbrains.annotations.NotNull
        public static final com.msbshamim60.todoapp.feature_todo.domain.util.SortDirection.Up INSTANCE = null;
        
        private Up() {
        }
    }
}