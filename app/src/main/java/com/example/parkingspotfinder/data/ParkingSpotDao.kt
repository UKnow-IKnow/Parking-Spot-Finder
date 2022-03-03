package com.example.parkingspotfinder.data

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface ParkingSpotDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertParkingSpot(spot: ParkingSpot)

    @Delete
    suspend fun deleteParkingSpot(spot: ParkingSpot)

    @Query("SELECT * FROM ParkingSpot_table")
    fun getParkingSpot(): Flow<List<ParkingSpot>>
}