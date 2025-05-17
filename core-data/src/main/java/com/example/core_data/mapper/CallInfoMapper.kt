package com.example.core_data.mapper

import com.example.core_data.local.entity.CallInfoEntity
import com.example.core_domain.model.CallInfo


fun CallInfoEntity.toDomain() = CallInfo(
    phoneNumber = phoneNumber,
    timestamp = timestamp,
    type = type
)

fun CallInfo.toEntity() = CallInfoEntity(
    phoneNumber = phoneNumber,
    timestamp = timestamp,
    type = type
)