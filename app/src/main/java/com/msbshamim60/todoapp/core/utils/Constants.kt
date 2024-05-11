package com.msbshamim60.todoapp.core.utils

object TodoUseCaseString{
    const val EMPTY_TITLE_OR_DESCRIPTION="Title and description cannot be empty."
}

object TodoListString{
    const val CANT_GET_TODOS="Error: Could not retrieve todo items."
    const val TODO_LIST="Todo List"
    const val TIME="Time"
    const val TITLE="Title"
    const val COMPLETED="Completed"
    const val SORT_UP="Sort Up"
    const val SORT_DOWN="Sort Down"
    const val SHOW_ARCHIVED="Show Archived"
    const val SORT_BY="Sort By"
    const val TODO_ITEM_DELETED = "Todo item has been deleted"
    const val UNDO = "Undo"
}

object NewUpdateString {
    const val SAVE_ERROR = "Unable to save todo. Ensure tile and description are not blank"
    const val NEW_UPDATE_TODO = "New Update Todo"
    const val CONFIRM_DELETE = "Are you sure? You want to delete this todo item."
    const val YES = "Yes"
    const val TITLE_HINT = "Title..."
    const val DESCRIPTION_HINT = "Description...."
}
object ContentDescription{
    const val DELETE_ICON_BUTTON="Delete button."
    const val ARCHIVE_ICON_BUTTON="Archive button."
    const val COMPLETE_ICON_BUTTON="Complete button."
    const val SELECTED = "Selected"
    const val ADD_FLOATING_ACTION_BUTTON = "Add floating action button"
    const val DRAWER_SHEET = "Drawer sheet"
    const val CIRCULAR_PROGRESS_INDICATION = "Circular progress indicator"
    const val SAVE_TODO = "Save Todo Item"
    const val BACK = "BACK"

}

const val DATABASE_NAME="todo_database"