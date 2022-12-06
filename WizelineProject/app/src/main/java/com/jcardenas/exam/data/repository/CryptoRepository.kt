package com.jcardenas.exam.data.repository

import com.jcardenas.exam.domain.model.AvailableBooks
import com.jcardenas.exam.domain.model.BookDetail

interface CryptoRepository {
    suspend fun getAvailableBooks(): List<AvailableBooks>

    suspend fun getBookDetail(book: String): BookDetail

    suspend fun getOderBook(): List<AvailableBooks>

    //suspend fun getAvailableBooksLocal(): List<AvailableBooks>
}