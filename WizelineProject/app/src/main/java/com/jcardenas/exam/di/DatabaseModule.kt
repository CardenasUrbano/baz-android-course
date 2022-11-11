package com.jcardenas.exam.di

import android.content.Context
import androidx.room.Room
import com.jcardenas.exam.data.local.CryptoDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    private const val CRYPTO_DATABASE_NAME = "crypto_database"

    @Singleton
    @Provides
    fun provideDatabase(@ApplicationContext context: Context) =
        Room.databaseBuilder(context, CryptoDatabase::class.java, CRYPTO_DATABASE_NAME).build()

    @Singleton
    @Provides
    fun provideDatabaseDao(db: CryptoDatabase) = db.cryptoDao()

}