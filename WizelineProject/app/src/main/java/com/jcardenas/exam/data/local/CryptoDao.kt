package com.jcardenas.exam.data.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.jcardenas.exam.data.entity.CryptoData
import com.jcardenas.exam.data.model.AvailableBooksResponse

@Dao
interface CryptoDao {
    @Query("SELECT * FROM cryptodata")
    suspend fun getData(): CryptoData

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCryptoData(cryptoData: CryptoData)

    @Delete
    suspend fun deleteCryptoData(cryptoData: CryptoData)

}