package com.jcardenas.exam.data.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class OrderBooksResponse (
    @Expose
    @SerializedName("payload/ask")
    val orderBooksPayload: List<OrderBooksPayload>
)

data class OrderBooksPayload (
    val book: String,
    val price: Double,
    val amount: Double
)