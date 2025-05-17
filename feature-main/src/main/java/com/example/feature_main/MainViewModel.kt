package com.example.feature_main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.core_domain.model.CallInfo
import com.example.core_domain.model.CallType
import com.example.core_domain.usecase.call.SaveCallInfoUseCase
import com.example.core_domain.usecase.contact.GetPhoneContactsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val saveCallInfoUseCase: SaveCallInfoUseCase
) : ViewModel() {
    fun log() {
        viewModelScope.launch {
            saveCallInfoUseCase.invoke(
                callInfo = CallInfo(
                    phoneNumber = "String",
                timestamp = 34321,
            type = CallType.INCOMING
            )
            )
        }

    }


}
