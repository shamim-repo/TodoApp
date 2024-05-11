package com.msbshamim60.todoapp.feature_todo.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.msbshamim60.todoapp.feature_todo.data.local.dto.LocalTodoItem

@Database(
    entities = [LocalTodoItem::class],
    version = 1,
    exportSchema = false
)
abstract class TodoDatabase: RoomDatabase(){
    abstract val todoDao: TodoDao
}


val todoList = listOf(
    LocalTodoItem(1, "Complete homework assignment", "Finish the math and science assignments due tomorrow.", false, 1661232000, false),
    LocalTodoItem(2, "Call the dentist", "Schedule an appointment for a dental checkup.", false, 1661318400, false),
    LocalTodoItem(3, "Write weekly report", "Compile and submit the weekly progress report to the supervisor.", false, 1661404800, false),
    LocalTodoItem(4, "Buy birthday gift for friend", "Select and purchase a gift for Sarah's birthday next week.", false, 1661491200, false),
    LocalTodoItem(5, "Grocery shopping", "Buy groceries including fruits, vegetables, and dairy products.", false, 1661577600, false),
    LocalTodoItem(6, "Prepare presentation slides", "Create slides for the upcoming client presentation.", false, 1661664000, false),
    LocalTodoItem(7, "Schedule car service", "Book an appointment for routine maintenance of the car.", false, 1661750400, false),
    LocalTodoItem(8, "Read a chapter from novel", "Read Chapter 5 from 'The Great Gatsby'.", false, 1661836800, false),
    LocalTodoItem(9, "Update resume", "Add recent accomplishments and experiences to the resume.", false, 1661923200, false)
)