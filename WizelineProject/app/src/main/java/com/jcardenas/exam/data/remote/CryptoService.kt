package com.jcardenas.exam.data.remote

import com.jcardenas.exam.data.model.AvailableBooksResponse
import com.jcardenas.exam.data.model.OrderBooksResponse
import com.jcardenas.exam.data.model.TickerResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class CryptoService @Inject constructor(private val apis: CryptoApis) {

    suspend fun getAvailableBooks(): AvailableBooksResponse{
        return withContext(Dispatchers.IO){
            apis.getAvailableBooks()
        }
    }

    suspend fun getTicker(book:String): TickerResponse{
        return withContext(Dispatchers.IO){
            apis.getTicker(book)
        }
    }

    suspend fun getOrderBook(book:String): OrderBooksResponse{
        return withContext(Dispatchers.IO){
            apis.getOrderBooks(book)
        }
    }
}