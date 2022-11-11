package com.jcardenas.exam.data.remote

import com.jcardenas.exam.data.model.AvailableBooksResponse
import com.jcardenas.exam.data.model.OrderBooksResponse
import com.jcardenas.exam.data.model.TickerResponse
import retrofit2.http.GET

interface CryptoApis {

    @GET("ticker/")
    suspend fun getTicker() : TickerResponse

    @GET("order_book/")
    suspend fun getOrderBooks() : OrderBooksResponse

    @GET("available_books/")
    suspend fun getAvailableBooks() : AvailableBooksResponse

}