package com.jcardenas.exam.presentation.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jcardenas.exam.data.model.AvailableBooksResponse
import com.jcardenas.exam.data.entity.CryptoData
import com.jcardenas.exam.domain.GetAvailableBooksUseCase
import com.jcardenas.exam.domain.model.AvailableBooks
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CryptoViewModel @Inject constructor(
    private val getAvailableBooksUseCase: GetAvailableBooksUseCase
) : ViewModel() {

    val availableBooks = MutableLiveData<List<AvailableBooks>>()
    val isLoading = MutableLiveData<Boolean>()

    fun onCreate() {
        viewModelScope.launch {
            isLoading.postValue(true)
            val response = getAvailableBooksUseCase()

            availableBooks.postValue(response)
            isLoading.postValue(false)
        }
    }
}