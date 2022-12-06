package com.jcardenas.exam.domain

import com.jcardenas.exam.data.repository.CryptoRepositoryImp
import com.jcardenas.exam.domain.model.BookDetail
import javax.inject.Inject

class GetSelectedBookUseCase @Inject constructor(
    private val repositoryImp: CryptoRepositoryImp
) {

    // TODO: me falta ver que venga de remote o db
    suspend operator fun invoke(book: String): BookDetail = repositoryImp.getBookDetail(book)
}