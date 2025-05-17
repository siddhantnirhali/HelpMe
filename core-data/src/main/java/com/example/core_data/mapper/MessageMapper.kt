package com.example.core_data.mapper

import com.example.core_data.local.entity.MessageEntity
import com.example.core_domain.model.Message


fun MessageEntity.toDomain() = Message(
    id = id,
    content = content,
    timestamp = timestamp,
    isSentByUser = isSentByUser
)

fun Message.toEntity() = MessageEntity(
    id = id,
    content = content,
    timestamp = timestamp,
    isSentByUser = isSentByUser
)