package com.fighter.cinematicket.screens.tickets

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import javax.inject.Inject

@HiltViewModel
class TicketViewModel @Inject constructor() : ViewModel() {
    private val _state = MutableStateFlow(TicketUiState())
    val state = _state.asStateFlow()

    init {
        getDates()
        getTimes()
    }

    private fun getDates() {
        _state.update {
            it.copy(
                dates = listOf(
                    DateUiSate(14, "Thu"),
                    DateUiSate(15, "Fri"),
                    DateUiSate(16, "Sat"),
                    DateUiSate(17, "Sun"),
                    DateUiSate(17, "Mon"),
                    DateUiSate(18, "Tue"),
                    DateUiSate(19, "Wed"),
                    DateUiSate(20, "Thu"),
                    DateUiSate(21, "Fri"),
                    DateUiSate(22, "Sat"),
                    DateUiSate(23, "Sun"),
                )
            )
        }
    }

    private fun getTimes() {
        _state.update {
            it.copy(
                times = listOf(
                    "10:00",
                    "12:30",
                    "1:30",
                    "2:30",
                    "3:30",
                    "4:30",
                    "6:00",
                    "7:00",
                    "9:30",
                    "11:00",
                    "12:00"
                )
            )
        }
    }

}