package com.example.core_data.repository

import android.util.Log
import com.example.core_data.mapper.toDomain
import com.example.core_data.remote.api.ContactApiService
import com.example.core_domain.model.PhoneContact
import com.example.core_domain.usecase.contact.GetPhoneContactsUseCase
import javax.inject.Inject


class ContactRepositoryImpl @Inject constructor(
    private val api: ContactApiService
) : GetPhoneContactsUseCase {
    override suspend fun invoke(): List<PhoneContact> =
        api.getContacts().map { it.toDomain() }
}