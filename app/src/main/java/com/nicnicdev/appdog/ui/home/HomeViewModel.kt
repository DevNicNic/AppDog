package com.nicnicdev.appdog.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.nicnicdev.appdog.domain.DogRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch


data class HomeState(
    val dogImageUrl: String = "",
    val isLoading: Boolean = false
)

class HomeViewModel(
    private val repository: DogRepository,
) : ViewModel() {
    private val _homeState = MutableStateFlow(HomeState())
    val homeState: StateFlow<HomeState> = _homeState

    fun getDogImage() {
        viewModelScope.launch (Dispatchers.IO) {
            _homeState.emit(HomeState(isLoading = true))
            val dog = repository.getRandomDog()

            _homeState.value = _homeState.value.copy(
                dogImageUrl = dog.message,
                isLoading = false,
            )

        }
    }
}