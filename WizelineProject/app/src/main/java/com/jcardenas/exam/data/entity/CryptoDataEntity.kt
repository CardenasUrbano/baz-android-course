package com.jcardenas.exam.data.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverter
import com.google.gson.Gson

@Entity
data class CryptoDataEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "uid") val uid: Int = 0,
    @ColumnInfo(name = "available_books") val availableBook: List<AvailableBooksEntity>
)

class DatabaseTypeConverter {
    @TypeConverter
    fun availableBooksToJson(value: List<AvailableBooksEntity>): String = Gson().toJson(value)

    @TypeConverter
    fun jsonToList(value: String) =
        Gson().fromJson(value, Array<AvailableBooksEntity>::class.java).toList()
}