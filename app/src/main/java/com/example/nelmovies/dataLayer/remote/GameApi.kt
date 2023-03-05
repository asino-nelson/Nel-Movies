package com.example.nelmovies.dataLayer.remote

import com.example.nelmovies.dataLayer.remote.model.Games
import com.example.nelmovies.dataLayer.remote.model.GamesItem
import com.example.nelmovies.utils.Constants.END_POINT
import retrofit2.Response
import retrofit2.http.GET


interface GameApi {

    @GET (END_POINT)
    suspend fun getGames(): Response<List<GamesItem>>

}