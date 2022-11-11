package com.jcardenas.exam.data.repository

import com.jcardenas.exam.domain.model.AvailableBooks

interface CryptoRepository {
    suspend fun getAvailableBooksRemote(): List<AvailableBooks>
    suspend fun getAvailableBooksLocal(): List<AvailableBooks>
}