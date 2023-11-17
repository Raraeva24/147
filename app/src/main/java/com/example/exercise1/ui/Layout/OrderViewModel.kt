package com.example.exercise1.ui.Layout

import androidx.lifecycle.ViewModel
import com.example.exercise1.Data.OrderUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class OrderViewModel : ViewModel() {
    private val _stateUI = MutableStateFlow(OrderUiState())
    val stateUI: StateFlow<OrderUiState> = _stateUI.asStateFlow()

    fun setFormulir(list: MutableList<String>){
        _stateUI.update {
            stateSaatIni -> stateSaatIni.copy(
                nama = list [0],
                nim = list [1],
                konsentrasi = list [2],
                judulskripsi = list [3],
            )
        }
    }

    fun setDosen1(dosen1: String){
        _stateUI.update { stateSaatIni ->
            stateSaatIni.copy(dosen1 = dosen1)
        }
    }

    fun setDosen2(dosen2: String){
        _stateUI.update { stateSaatIni ->
            stateSaatIni.copy(dosen2 = dosen2)
        }
    }
}