package com.github.uemoo.haru.core.data.repository

import android.util.Log
import com.github.uemoo.haru.core.domain.repository.SampleRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject

@InstallIn(SingletonComponent::class)
@Module
internal interface DomainModule {
    @Binds
    fun bindSampleRepository(impl: SampleRepositoryImpl): SampleRepository
}

internal class SampleRepositoryImpl @Inject constructor() : SampleRepository {
    override fun greeting() {
        Log.d("XXX", "Hello world!")
    }
}
