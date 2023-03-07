package com.example.nelmovies.domainLayer.use_case

import com.example.nelmovies.domainLayer.item.GameItem
import com.example.nelmovies.repo.GameRepo
import javax.inject.Inject

class GetGamesUseCases @Inject constructor(
    private val gameRepo: GameRepo
){

    suspend operator fun invoke():List<GameItem> {
        return gameRepo.getGames().shuffled()
    }
}