package com.github.uemoo.haru.core.domain.usecase

import com.github.uemoo.haru.core.domain.repository.SampleRepository
import javax.inject.Inject

class SampleUseCase @Inject constructor(
    private val repository: SampleRepository,
) {
    operator fun invoke() = repository.greeting()
}
