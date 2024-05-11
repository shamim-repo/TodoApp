package com.msbshamim60.todoapp.feature_todo.presentation.todo_new_update

import androidx.compose.ui.focus.FocusState

sealed class NewUpdateTodoEvent {
    data class EnteredTitle(val value: String) : NewUpdateTodoEvent()
    data class ChangedTitleFocus(val  state : FocusState) : NewUpdateTodoEvent()

    data class EnteredDescription(val value: String) : NewUpdateTodoEvent()
    data class ChangedDescriptionFocus(val  state : FocusState) : NewUpdateTodoEvent()

    object Save: NewUpdateTodoEvent()
    object Delete: NewUpdateTodoEvent()
    object ToggleCompleted: NewUpdateTodoEvent()
    object ToggleArchived: NewUpdateTodoEvent()
    object Back : NewUpdateTodoEvent()
}