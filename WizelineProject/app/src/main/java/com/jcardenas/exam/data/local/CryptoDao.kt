package com.jcardenas.exam.data.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.jcardenas.exam.data.entity.CryptoDataEntity

@Dao
interface CryptoDao {
    /*@Query("SELECT * FROM cryptoDataEntity")
    suspend fun getData(): CryptoDataEntity

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCryptoData(cryptoData: CryptoDataEntity)

    @Delete
    suspend fun deleteCryptoData(cryptoData: CryptoDataEntity)*/

}