package com.example.nelmovies.repo

import com.example.nelmovies.dataLayer.remote.GameApi
import com.example.nelmovies.domainLayer.item.GameItem
import javax.inject.Inject

class GameRepo @Inject constructor(private val gameApi: GameApi) {

    suspend fun getGames(): List<GameItem>{
        return gameApi.getGames().map{
            it.toGameItem()
        }
    }
}