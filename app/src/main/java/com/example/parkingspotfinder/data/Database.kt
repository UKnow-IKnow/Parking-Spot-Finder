package com.example.parkingspotfinder.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [ParkingSpotTable::class],
    version = 1
)
abstract class Database: RoomDatabase() {
    abstract val parkingSpotDao: ParkingSpotDao
}