package com.D121181507.taskmanagementapp

import android.app.Application

class TaskManagementApp : Application() {
    private val database by lazy { TaskItemDatabase.getDatabase(this) }
    val repository by lazy { TaskItemRepository(database.taskItemDao()) }
}