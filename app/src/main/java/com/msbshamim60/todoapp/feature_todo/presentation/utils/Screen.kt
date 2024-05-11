package com.msbshamim60.todoapp.feature_todo.presentation.utils

sealed class Screen(val rout: String) {
    data object TodoListScreen: Screen("todoListScreen")
     data object TodoNewUpdateScreen: Screen("todoNewUpdateScreen")
}