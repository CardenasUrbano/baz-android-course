package com.jcardenas.exam.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.jcardenas.exam.data.entity.AvailableBooksEntityTypeConverter
import com.jcardenas.exam.data.entity.CryptoData

@Database(entities = [CryptoData::class], version = 1, exportSchema = false)
@TypeConverters(AvailableBooksEntityTypeConverter::class)
abstract class CryptoDatabase : RoomDatabase() {
    abstract fun cryptoDao(): CryptoDao
}