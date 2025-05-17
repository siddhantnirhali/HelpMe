package com.example.core_data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.core_domain.model.CallType

@Entity(tableName = "call_logs")
data class CallInfoEntity(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val phoneNumber: String,
    val timestamp: Long,
    val type: CallType
)
