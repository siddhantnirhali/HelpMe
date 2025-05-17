package com.example.core_domain.model

data class Message(
    val id: Long,
    val content: String,
    val timestamp: Long,
    val isSentByUser: Boolean
)