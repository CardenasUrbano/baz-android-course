package com.jcardenas.exam.data.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.Gson
import com.jcardenas.exam.domain.model.AvailableBooks

@Entity(tableName = "available_books")
data class AvailableBooksEntity(
    @PrimaryKey
    @ColumnInfo(name = "book") val book: String = "",
    @ColumnInfo(name = "minimum_amount") val minimum_amount: Double = 0.0,
    @ColumnInfo(name = "maximum_amount") val maximum_amount: Double = 0.0,
    @ColumnInfo(name = "minimum_price") val minimum_price: Double = 0.0,
    @ColumnInfo(name = "maximum_price") val maximum_price: Double = 0.0,
    @ColumnInfo(name = "minimum_value") val minimum_value: Double = 0.0,
    @ColumnInfo(name = "maximum_value") val maximum_value: Double = 0.0
)
