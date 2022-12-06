package com.jcardenas.exam.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.jcardenas.exam.data.entity.AvailableBooksEntity
import com.jcardenas.exam.data.entity.DatabaseTypeConverter
import com.jcardenas.exam.data.entity.CryptoDataEntity

@Database(entities = [AvailableBooksEntity::class], version = 1, exportSchema = false)
@TypeConverters(DatabaseTypeConverter::class)
abstract class CryptoDatabase : RoomDatabase() {
    abstract fun cryptoDao(): CryptoDao
}