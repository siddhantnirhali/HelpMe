package com.example.core_domain.usecase.contact

import com.example.core_domain.model.PhoneContact

interface GetPhoneContactsUseCase {
    suspend operator fun invoke(): List<PhoneContact>
}