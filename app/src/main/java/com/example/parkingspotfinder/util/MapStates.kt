package com.example.parkingspotfinder.util

import com.example.parkingspotfinder.domain.model.ParkingSpot
import com.google.android.gms.maps.model.MapStyleOptions
import com.google.maps.android.compose.MapProperties


data class MapStates(
    val properties: MapProperties = MapProperties(),
    val parkingSpot: List<ParkingSpot> = emptyList(),
    val isFalloutMap: Boolean = false
)