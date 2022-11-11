package com.jcardenas.exam.data.remote

import com.jcardenas.exam.data.model.AvailableBooksResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class CryptoService @Inject constructor(private val apis: CryptoApis) {

    suspend fun getAvailableBooks(): AvailableBooksResponse{
        return withContext(Dispatchers.IO){
            apis.getAvailableBooks()
        }
    }
}