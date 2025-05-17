package com.example.core_data.mapper

import com.example.core_data.remote.dto.ContactDto
import com.example.core_domain.model.PhoneContact

fun ContactDto.toDomain(): PhoneContact = PhoneContact(
    name = this.name,
    phoneNumber = this.phoneNumber,
    imageUrl = this.imageUrl
)