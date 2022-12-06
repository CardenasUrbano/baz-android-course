package com.jcardenas.exam.data.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class OrderBooksResponse(
    @Expose
    @SerializedName("payload")
    val payload: PayloadResponse
)

data class PayloadResponse(
    @Expose
    @SerializedName("asks")
    val asks: List<AskBid>,
    @Expose
    @SerializedName("bids")
    val bids: List<AskBid>
)

data class AskBid(
    val book: String,
    val price: Double,
    val amount: Double
)