package com.example.core_data.di

import android.content.Context
import androidx.room.Room
import com.example.core_data.local.AppDatabase
import com.example.core_data.local.dao.CallInfoDao
import com.example.core_data.local.dao.MessageDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideAppDatabase(
        context: Context // make sure the type is Context!
    ): AppDatabase = Room.databaseBuilder(
        context,
        AppDatabase::class.java,
        "helpme.db"
    ).build()

    @Provides
    @Singleton
    fun provideCallInfoDao(db: AppDatabase): CallInfoDao = db.callInfoDao()

    @Provides
    @Singleton
    fun provideMessageDao(db: AppDatabase): MessageDao = db.messageDao()
}
