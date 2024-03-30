package com.pesto.todolist.presentation.di

import com.pesto.todolist.data.db.TaskCategoryDao
import com.pesto.todolist.domain.TaskCategoryRepository
import com.pesto.todolist.data.repository.TaskCategoryRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @Singleton
    fun provideTaskCategoryRepository(taskCategoryDao: TaskCategoryDao) : TaskCategoryRepository {
        return TaskCategoryRepositoryImpl(taskCategoryDao)
    }
}