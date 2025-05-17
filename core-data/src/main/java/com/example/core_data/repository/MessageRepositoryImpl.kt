package com.example.core_data.repository

import com.example.core_data.local.dao.MessageDao
import com.example.core_data.mapper.toDomain
import com.example.core_data.mapper.toEntity
import com.example.core_domain.model.Message
import com.example.core_domain.usecase.message.GetMessagesUseCase
import com.example.core_domain.usecase.message.SaveMessageUseCase
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject


class MessageRepositoryImpl @Inject constructor(
    private val dao: MessageDao
) : GetMessagesUseCase, SaveMessageUseCase {

    override suspend fun invoke(message: Message) {
        dao.insert(message.toEntity())
    }

    override fun invoke(contactNumber: String): Flow<List<Message>> =
        dao.getAllMessages()
            .map { list -> list.map { it.toDomain() } }

}