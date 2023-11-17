package com.example.exercise1.ui.Layout

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

enum class PengelolaHalaman{
    Home,
    Formulir,
    Summary
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SkripsiApp(
    viewModel: OrderViewModel = viewModel(),
    navHostController: NavHostController = rememberNavController()
){
    Scaffold {innerpadding ->
        val uiState by viewModel.stateUI.collectAsState()

        NavHost(
            navController = navHostController,
            startDestination = PengelolaHalaman.Home.name,
            modifier = androidx.compose.ui.Modifier.padding(innerpadding)
        ){
            composable(route = PengelolaHalaman.Home.name){
                HalamanHome(oneNextButtonClicked = {navHostController.navigate(PengelolaHalaman.Formulir.name)})
            }

            composable(route = PengelolaHalaman.Formulir.name){
                HalamanSatu(
                    onSubmitButtonClicked = {
                        viewModel.setFormulir(it)
                        navHostController.navigate(PengelolaHalaman.Summary.name) } )
            }
            composable(route = PengelolaHalaman.Summary.name){
                HalamanDua(orderUiState = uiState,
                    onBackButtonClicked = {navHostController.navigate(PengelolaHalaman.Formulir.name)})
            }
        }

    }
}

