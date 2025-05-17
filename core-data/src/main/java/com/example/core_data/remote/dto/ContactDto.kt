package com.example.core_data.remote.dto

import com.google.gson.annotations.SerializedName

data class ContactDto(
    val name: String,
    val phoneNumber: String,
    val imageUrl: String
)