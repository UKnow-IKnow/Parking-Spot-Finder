package com.example.parkingspotfinder.data

import com.example.parkingspotfinder.domain.model.ParkingSpot

fun ParkingSpotTable.toParkingSpot(): ParkingSpot{
    return ParkingSpot(
        lat = lat,
        lng = lng,
        id = id
    )
}

fun ParkingSpot.toParkingSpotTable(): ParkingSpotTable{
    return ParkingSpotTable(
        lat = lat,
        lng = lng,
        id = id
    )
}