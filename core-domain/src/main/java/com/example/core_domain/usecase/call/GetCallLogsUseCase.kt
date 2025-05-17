package com.example.core_domain.usecase.call

import com.example.core_domain.model.CallInfo
import kotlinx.coroutines.flow.Flow

interface GetCallLogsUseCase {
    operator fun invoke(): Flow<List<CallInfo>>
}