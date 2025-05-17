package com.example.core_domain.usecase.call

import com.example.core_domain.model.CallInfo

interface SaveCallInfoUseCase {
    suspend operator fun invoke(callInfo: CallInfo)
}