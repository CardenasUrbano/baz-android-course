package com.jcardenas.exam.data.repository

import com.jcardenas.exam.core.NetworkStatus
import com.jcardenas.exam.data.local.CryptoDatabase
import com.jcardenas.exam.data.remote.CryptoService
import com.jcardenas.exam.domain.model.AvailableBooks
import com.jcardenas.exam.domain.model.BookDetail
import com.jcardenas.exam.domain.model.toDomain
import javax.inject.Inject

class CryptoRepositoryImp @Inject constructor(
    private val api: CryptoService,
    private val db: CryptoDatabase,
    private val networkStatus: NetworkStatus
) : CryptoRepository {

    override suspend fun getAvailableBooks(): List<AvailableBooks>{
        if (networkStatus.isOnline){

        } else {

        }
        return api.getAvailableBooks().availableBooksPayload.map { it.toDomain() }
    }

    override suspend fun getBookDetail(book: String): BookDetail {
        if (networkStatus.isOnline){

        } else {

        }
        return api.getTicker(book).tickerPayload.toDomain()
    }

    override suspend fun getOderBook(): List<AvailableBooks> {
        TODO("Not yet implemented")
    }

    /*override suspend fun getAvailableBooksLocal(): List<AvailableBooks> =
        db.cryptoDao().getData().availableBook.map { it.toDomain() }*/
}