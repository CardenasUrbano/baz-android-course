package com.jcardenas.exam.domain.model

import com.jcardenas.exam.data.entity.AvailableBooksEntity
import com.jcardenas.exam.data.model.AvailableBooksPayload
import com.jcardenas.exam.data.model.TickerPayload

data class BookDetail(
    val book: String,
    val volume: Double,
    val high: Double,
    val last: Double,
    val low: Double,
    val vwap: Double,
    val ask: Double,
    val bid: Double,
    val created_at: String
)

fun TickerPayload.toDomain() = BookDetail(
    book,
    volume,
    high,
    last,
    low,
    vwap,
    ask,
    bid,
    created_at
)

/*
fun AvailableBooksEntity.toDomain() = AvailableBooks(
    book,
    minimum_amount,
    maximum_amount,
    minimum_price,
    maximum_price,
    minimum_value,
    maximum_value
)*/
