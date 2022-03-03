package com.example.parkingspotfinder.di

import android.app.Application
import android.content.Context
import androidx.room.Room
import com.example.parkingspotfinder.data.Database
import com.example.parkingspotfinder.data.ParkingSpotRepositoryImplementation
import com.example.parkingspotfinder.domain.model.repository.ParkingSpotRepository
import com.example.parkingspotfinder.util.Constants.DATABASE_NAME
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideParkingSpotDatabase(app: Application): Database {
        return Room.databaseBuilder(
            app,
            Database::class.java,
            DATABASE_NAME
        ).build()
    }

    @Singleton
    @Provides
    fun provideParkingSpotRepository(db: Database): ParkingSpotRepository{
        return ParkingSpotRepositoryImplementation(db.parkingSpotDao)
    }
}