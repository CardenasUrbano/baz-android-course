package com.jcardenas.exam.domain

import com.jcardenas.exam.data.repository.CryptoRepositoryImp
import com.jcardenas.exam.domain.model.AvailableBooks
import javax.inject.Inject

class GetAvailableBooksUseCase @Inject constructor(
    private val repositoryImp: CryptoRepositoryImp
) {
    suspend operator fun invoke(): List<AvailableBooks> = repositoryImp.getAvailableBooksRemote()
}