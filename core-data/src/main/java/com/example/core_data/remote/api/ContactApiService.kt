package com.example.core_data.remote.api
import com.example.core_data.remote.dto.ContactDto
import retrofit2.http.GET


interface ContactApiService {
    @GET("contacts")
    suspend fun getContacts(): List<ContactDto>
}