package com.example.core_data.repository

import com.example.core_data.local.dao.CallInfoDao
import com.example.core_data.mapper.toDomain
import com.example.core_data.mapper.toEntity
import com.example.core_domain.model.CallInfo
import com.example.core_domain.usecase.call.GetCallLogsUseCase
import com.example.core_domain.usecase.call.SaveCallInfoUseCase
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class CallInfoRepositoryImpl @Inject constructor(
    private val dao: CallInfoDao
) : SaveCallInfoUseCase, GetCallLogsUseCase {

    override suspend fun invoke(callInfo: CallInfo) {
        dao.insert(callInfo.toEntity())
    }

    override fun invoke(): Flow<List<CallInfo>> =
        dao.getAllCallLogs().map { list -> list.map { it.toDomain() } }
}