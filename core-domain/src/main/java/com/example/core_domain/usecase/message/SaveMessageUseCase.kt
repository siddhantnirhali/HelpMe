package com.example.core_domain.usecase.message

import com.example.core_domain.model.Message

interface SaveMessageUseCase {
    suspend operator fun invoke(message: Message)
}