package com.example.nelmovies.presentationLayer.home

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.nelmovies.domainLayer.item.GameItem

@Composable
fun HomeScreen(){
    val homeViewModel = viewModel(modelClass = HomeViewModel::class.java)
    val games by homeViewModel.games.collectAsState()

    LazyColumn{

        items(games) {

        }
    }
}

@Composable
fun GameCard(gameItem: GameItem){

    val image = rememberImagePainter(data= game.thumbnail)

    Card(
        elevation = 3.dp,
        shape = RoundedCornerShape(10.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(15.dp)
    ) {

    }

}