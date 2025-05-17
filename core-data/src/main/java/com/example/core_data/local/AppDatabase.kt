package com.example.core_data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.core_data.local.dao.CallInfoDao
import com.example.core_data.local.dao.MessageDao
import com.example.core_data.local.entity.CallInfoEntity
import com.example.core_data.local.entity.MessageEntity

@Database(
    entities = [MessageEntity::class, CallInfoEntity::class],
    version = 1
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun callInfoDao(): CallInfoDao
    abstract fun messageDao(): MessageDao
}
