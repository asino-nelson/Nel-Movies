package com.example.nelmovies.presentationLayer.home

import com.example.nelmovies.domainLayer.item.GameItem
import com.example.nelmovies.domainLayer.use_case.GetGamesUseCases
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

class HomeViewModel @Inject constructor(private val gamesUseCases: GetGamesUseCases) {

    private val _games = MutableStateFlow(emptyList<GameItem>())
    val games: StateFlow<List<GameItem>> get() = _games

    init {
        getGames()
    }

    private fun getGames(){

        viewModelScope.launch{

            try {
                val games = gamesUseCases
                _games.value = games
            }catch (e:Exception)
        }
    }
}