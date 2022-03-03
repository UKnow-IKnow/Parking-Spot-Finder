package com.example.parkingspotfinder.data

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.parkingspotfinder.util.Constants.DATABASE_TABLE

@Entity(tableName = DATABASE_TABLE)
data class ParkingSpotTable(
    @PrimaryKey(autoGenerate = true)
    val id:Int? = null,
    val lat:Double,
    val lng:Double,
)
