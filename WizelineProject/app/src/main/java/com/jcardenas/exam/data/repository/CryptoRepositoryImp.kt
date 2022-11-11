package com.jcardenas.exam.data.repository

import com.jcardenas.exam.data.model.AvailableBooksResponse
import com.jcardenas.exam.data.entity.CryptoDataProvider
import com.jcardenas.exam.data.local.CryptoDatabase
import com.jcardenas.exam.data.remote.CryptoService
import com.jcardenas.exam.domain.model.AvailableBooks
import com.jcardenas.exam.domain.model.toDomain
import javax.inject.Inject

class CryptoRepositoryImp @Inject constructor(
    private val api: CryptoService,
    private val db: CryptoDatabase
) : CryptoRepository {

    override suspend fun getAvailableBooksRemote(): List<AvailableBooks> =
        api.getAvailableBooks().availableBooksPayload.map { it.toDomain() }

    override suspend fun getAvailableBooksLocal(): List<AvailableBooks> =
        db.cryptoDao().getData().availableBook.map { it.toDomain() }
}