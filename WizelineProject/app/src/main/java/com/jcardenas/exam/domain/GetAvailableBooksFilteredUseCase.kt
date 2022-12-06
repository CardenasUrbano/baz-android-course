package com.jcardenas.exam.domain

import com.jcardenas.exam.core.Constants.CRYPTO_FILTER
import com.jcardenas.exam.data.repository.CryptoRepositoryImp
import com.jcardenas.exam.domain.model.AvailableBooks
import javax.inject.Inject

class GetAvailableBooksFilteredUseCase @Inject constructor(
    private val repositoryImp: CryptoRepositoryImp
) {

    // TODO: me falta ver que venga de remote o db
    suspend operator fun invoke(): List<AvailableBooks> =
        repositoryImp.getAvailableBooks().filter {
            it.book.contains(CRYPTO_FILTER)
        }
}