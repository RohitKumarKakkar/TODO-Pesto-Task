package com.pesto.todolist.data.db

import androidx.room.*
import com.pesto.todolist.data.model.CategoryInfo
import com.pesto.todolist.data.model.TaskInfo

@Database(entities = [TaskInfo::class, CategoryInfo::class], version = 1)
@TypeConverters(DateConverter::class)
abstract class TaskDatabase : RoomDatabase() {
    abstract fun getTaskCategoryDao() : TaskCategoryDao
}