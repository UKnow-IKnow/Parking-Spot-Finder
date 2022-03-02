package com.example.parkingspotfinder.ui.theme.viewModels

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.parkingspotfinder.screen.MapStates

class MapsViewModel : ViewModel(){
    var state by mutableStateOf(MapStates())
}