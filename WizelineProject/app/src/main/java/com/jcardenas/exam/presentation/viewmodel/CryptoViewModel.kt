package com.jcardenas.exam.presentation.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jcardenas.exam.domain.GetAvailableBooksFilteredUseCase
import com.jcardenas.exam.domain.GetSelectedBookUseCase
import com.jcardenas.exam.domain.model.AvailableBooks
import com.jcardenas.exam.domain.model.BookDetail
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CryptoViewModel @Inject constructor(
    private val getAvailableBooksFilteredUseCase: GetAvailableBooksFilteredUseCase,
    private val getSelectedBookUseCase: GetSelectedBookUseCase
) : ViewModel() {

    val availableBooks = MutableLiveData<List<AvailableBooks>>()
    private var bookSelected = MutableLiveData<AvailableBooks>()
    var bookSelectedDetail = MutableLiveData<BookDetail>()
    val isLoading = MutableLiveData<Boolean>()

    fun getAvailableBooks() {
        viewModelScope.launch {
            isLoading.postValue(true)
            val response = getAvailableBooksFilteredUseCase()

            availableBooks.postValue(response)
            isLoading.postValue(false)
        }
    }

    fun getBookDetail() {
        viewModelScope.launch {
            isLoading.postValue(true)
            val response = getSelectedBookUseCase(bookSelected.value!!.book)

            bookSelectedDetail.postValue(response)
            isLoading.postValue(false)
        }
    }

    fun saveBook(bookSelected: AvailableBooks) {
        this.bookSelected.value = bookSelected
    }
}