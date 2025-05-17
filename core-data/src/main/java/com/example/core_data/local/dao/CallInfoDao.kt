package com.example.core_data.local.dao

import androidx.room.*
import com.example.core_data.local.entity.CallInfoEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface CallInfoDao {
    @Query("SELECT * FROM call_logs ORDER BY timestamp DESC")
    fun getAllCallLogs(): Flow<List<CallInfoEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(callInfo: CallInfoEntity)
}
