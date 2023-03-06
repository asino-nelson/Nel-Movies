package com.example.nelmovies.domainLayer.item

import com.example.nelmovies.dataLayer.remote.model.GameModel

data class GameItem(

    val id: Int,
    val title: String,
    val genre: String,
    val short_description: String,
    val thumbnail: String
    
)

fun GameModel.toGameItem() = GameItem(id,title,genre,short_description, thumbnail)
