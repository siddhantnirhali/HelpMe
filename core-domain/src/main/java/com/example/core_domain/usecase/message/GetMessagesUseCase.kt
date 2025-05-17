package com.example.core_domain.usecase.message

import com.example.core_domain.model.Message
import kotlinx.coroutines.flow.Flow

interface GetMessagesUseCase {
    operator fun invoke(contactNumber: String): Flow<List<Message>>
}