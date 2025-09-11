package com.github.uemoo.haru.core.ui

import androidx.lifecycle.ViewModel
import com.github.uemoo.haru.core.domain.usecase.SampleUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SampleViewModel @Inject constructor(
    private val greetingUseCase: SampleUseCase,
) : ViewModel() {

    fun greeting() = greetingUseCase()
}
