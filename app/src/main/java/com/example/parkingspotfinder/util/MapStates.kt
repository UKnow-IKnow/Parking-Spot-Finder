package com.example.parkingspotfinder.util

import com.google.maps.android.compose.MapProperties


data class MapStates(
    val properties: MapProperties = MapProperties(),
    val isFalloutMap: Boolean = false
)