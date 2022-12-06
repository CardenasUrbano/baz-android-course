package com.jcardenas.exam.data.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class TickerResponse (
    @Expose
    @SerializedName("payload")
    val tickerPayload: TickerPayload
)

data class TickerPayload (
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