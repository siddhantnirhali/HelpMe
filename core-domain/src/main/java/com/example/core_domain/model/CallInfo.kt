package com.example.core_domain.model

data class CallInfo(
    val phoneNumber: String,
    val timestamp: Long,
    val type: CallType
)