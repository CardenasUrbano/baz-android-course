package com.jcardenas.exam.data.remote

import com.jcardenas.exam.data.model.AvailableBooksResponse
import com.jcardenas.exam.data.model.OrderBooksResponse
import com.jcardenas.exam.data.model.TickerResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface CryptoApis {
    @GET("available_books/")
    suspend fun getAvailableBooks(): AvailableBooksResponse

    @GET("ticker/")
    suspend fun getTicker(@Query("book") book: String): TickerResponse

    @GET("order_book/")
    suspend fun getOrderBooks(@Query("book") book: String): OrderBooksResponse
}