package com.example.core_data.di

import com.example.core_data.repository.CallInfoRepositoryImpl
import com.example.core_data.repository.ContactRepositoryImpl
import com.example.core_data.repository.MessageRepositoryImpl
import com.example.core_domain.usecase.call.GetCallLogsUseCase
import com.example.core_domain.usecase.call.SaveCallInfoUseCase
import com.example.core_domain.usecase.contact.GetPhoneContactsUseCase
import com.example.core_domain.usecase.message.GetMessagesUseCase
import com.example.core_domain.usecase.message.SaveMessageUseCase
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindGetMessagesUseCase(
        impl: MessageRepositoryImpl
    ): GetMessagesUseCase

    @Binds
    @Singleton
    abstract fun bindSaveMessageUseCase(
        impl: MessageRepositoryImpl
    ): SaveMessageUseCase

    @Binds
    @Singleton
    abstract fun bindGetCallLogsUseCase(
        impl: CallInfoRepositoryImpl
    ): GetCallLogsUseCase

    @Binds
    @Singleton
    abstract fun bindSaveCallInfoUseCase(
        impl: CallInfoRepositoryImpl
    ): SaveCallInfoUseCase

    @Binds
    @Singleton
    abstract fun bindGetPhoneContactsUseCase(
        impl: ContactRepositoryImpl
    ): GetPhoneContactsUseCase
}
