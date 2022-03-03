package com.example.parkingspotfinder.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [ParkingSpot::class],
    version = 1
)
abstract class Database: RoomDatabase() {
    abstract val parkingSpotDao: ParkingSpotDao
}