package com.example.parkingspotfinder.screen

import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ToggleOff
import androidx.compose.material.icons.filled.ToggleOn
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import com.example.parkingspotfinder.R
import com.example.parkingspotfinder.ui.theme.viewModels.MapsViewModel
import com.google.maps.android.compose.GoogleMap

@Composable
fun MapScreen(
    viewModel: MapsViewModel = androidx.lifecycle.viewmodel.compose.viewModel()
) {
    val scaffoldState = rememberScaffoldState()
    Scaffold(
        scaffoldState = scaffoldState,
        floatingActionButton = {
            FloatingActionButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = if (viewModel.state.isFalloutMap) {
                        Icons.Default.ToggleOff
                    } else {
                        Icons.Default.ToggleOn
                    }, contentDescription = stringResource(id = R.string.toggle_fallout_Map)
                )
            }
        }
    ) {
        GoogleMap(

        )
    }
}