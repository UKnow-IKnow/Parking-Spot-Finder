package com.example.parkingspotfinder.data

import com.example.parkingspotfinder.domain.model.ParkingSpot
import com.example.parkingspotfinder.domain.model.repository.ParkingSpotRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class ParkingSpotRepositoryImplementation(
    private val dao: ParkingSpotDao
): ParkingSpotRepository {
    override suspend fun insertParkingSpot(spot: ParkingSpot) {
        dao.insertParkingSpot(spot.toParkingSpotTable())
    }

    override suspend fun deleteParkingSpot(spot: ParkingSpot){
        dao.deleteParkingSpot(spot.toParkingSpotTable())
    }

    override fun getParkingSpot(): Flow<List<ParkingSpot>> {
        return dao.getParkingSpot().map { spots ->
            spots.map { it.toParkingSpot() }
        }
    }
}