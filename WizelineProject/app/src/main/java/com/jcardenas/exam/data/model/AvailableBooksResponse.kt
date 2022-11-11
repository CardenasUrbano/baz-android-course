package com.jcardenas.exam.data.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class AvailableBooksResponse (
    @Expose
    @SerializedName("payload")
    val availableBooksPayload: List<AvailableBooksPayload>
)

data class AvailableBooksPayload (
    val book: String,
    val minimum_amount: Double,
    val maximum_amount: Double,
    val minimum_price: Double,
    val maximum_price: Double,
    val minimum_value: Double,
    val maximum_value: Double
)