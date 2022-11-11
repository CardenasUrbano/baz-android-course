package com.jcardenas.exam.data.entity

import androidx.room.ColumnInfo
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.jcardenas.exam.data.local.AvailableBooksEntity

@Entity
data class CryptoData(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "uid") val uid: Int = 0,
    @ColumnInfo(name = "available_books") val availableBook: List<AvailableBooksEntity>
)

class AvailableBooksEntityTypeConverter{
    @TypeConverter
    fun listToJson(value: List<AvailableBooksEntity>): String = Gson().toJson(value)

    @TypeConverter
    fun jsonToList(value: String) = Gson().fromJson(value, Array<AvailableBooksEntity>::class.java).toList()
}