package com.jcardenas.exam.domain.model

import com.jcardenas.exam.data.entity.AvailableBooksEntity
import com.jcardenas.exam.data.model.AvailableBooksPayload

data class AvailableBooks(
    val book: String,
    val minimum_amount: Double,
    val maximum_amount: Double,
    val minimum_price: Double,
    val maximum_price: Double,
    val minimum_value: Double,
    val maximum_value: Double
)

fun AvailableBooksPayload.toDomain() = AvailableBooks(
    book,
    minimum_amount,
    maximum_amount,
    minimum_price,
    maximum_price,
    minimum_value,
    maximum_value
)

fun AvailableBooksEntity.toDomain() = AvailableBooks(
    book,
    minimum_amount,
    maximum_amount,
    minimum_price,
    maximum_price,
    minimum_value,
    maximum_value
)