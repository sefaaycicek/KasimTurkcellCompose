package com.sirketismi.kasimturkcellcompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.max


@Preview
@Composable
fun CenteredBox() {
    Box(contentAlignment = Alignment.Center,
        modifier = Modifier
        .fillMaxSize()
        .background(Brush.linearGradient(colors = listOf(Color.Red, Color.Yellow)))) {

        Card(modifier = Modifier.padding(horizontal = 16.dp)) {
            LazyColumn(modifier = Modifier
                .fillMaxWidth()
                .heightIn(max = LocalConfiguration.current.screenHeightDp.dp * 0.5f)
            ) {
                items(getUsers()) { user ->
                    CustomCellItem(user)
                }
            }
        }
    }
}

@Composable
fun CustomCellItem(user : User) {
    Card(elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
        colors = CardDefaults.cardColors(Color.White),
        modifier = Modifier.padding(horizontal =  8.dp, vertical = 4.dp).fillMaxWidth()) {

        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(painter = painterResource(id = user.imgId),
                contentDescription = null,
                modifier = Modifier.size(30.dp).weight(0.2f))

            Column(modifier = Modifier.padding(horizontal = 10.dp).weight(0.8f)) {
                Text(text = user.name,
                    fontWeight = FontWeight.Bold,
                    style = MaterialTheme.typography.titleLarge)
                Text(text = user.surname,
                    fontWeight = FontWeight.Thin,
                    style = MaterialTheme.typography.titleSmall)

            }
        }
    }

}

data class User(val name : String, var surname : String, val imgId : Int)

fun getUsers(): List<User> {
    var list = mutableListOf<User>()
    list.add(User("Sefa", "Ayçicek", R.drawable.ic_back))
    list.add(User("Sefa", "Ayçicek", R.drawable.ic_home))
    list.add(User("Sefa", "Ayçicek", R.drawable._835262_dislike_heart_like_love_icon))
    list.add(User("Sefa", "Ayçicek", R.drawable._203510_favorite_favourite_heart_love_icon))
    list.add(User("Sefa", "Ayçicek", R.drawable._835262_dislike_heart_like_love_icon))
    list.add(User("Sefa", "Ayçicek", R.drawable._203510_favorite_favourite_heart_love_icon))
    list.add(User("Sefa", "Ayçicek", R.drawable._203510_favorite_favourite_heart_love_icon))
    list.add(User("Sefa", "Ayçicek", R.drawable._835262_dislike_heart_like_love_icon))
    list.add(User("Sefa", "Ayçicek", R.drawable._835262_dislike_heart_like_love_icon))
    list.add(User("Sefa", "Ayçicek", R.drawable._203510_favorite_favourite_heart_love_icon))
    list.add(User("Sefa", "Ayçicek", R.drawable._203510_favorite_favourite_heart_love_icon))

    list.add(User("Sefa", "Ayçicek", R.drawable._835262_dislike_heart_like_love_icon))
    list.add(User("Sefa", "Ayçicek", R.drawable._203510_favorite_favourite_heart_love_icon))
    list.add(User("Sefa", "Ayçicek", R.drawable._203510_favorite_favourite_heart_love_icon))
    list.add(User("Sefa", "Ayçicek", R.drawable._835262_dislike_heart_like_love_icon))
    list.add(User("Sefa", "Ayçicek", R.drawable._835262_dislike_heart_like_love_icon))
    list.add(User("Sefa", "Ayçicek", R.drawable._203510_favorite_favourite_heart_love_icon))
    list.add(User("Sefa", "Ayçicek", R.drawable._203510_favorite_favourite_heart_love_icon))
    list.add(User("Sefa", "Ayçicek", R.drawable._835262_dislike_heart_like_love_icon))
    list.add(User("Sefa", "Ayçicek", R.drawable._203510_favorite_favourite_heart_love_icon))
    list.add(User("Sefa", "Ayçicek", R.drawable._203510_favorite_favourite_heart_love_icon))
    list.add(User("Sefa", "Ayçicek", R.drawable._835262_dislike_heart_like_love_icon))
    list.add(User("Sefa", "Ayçicek", R.drawable._835262_dislike_heart_like_love_icon))
    list.add(User("Sefa", "Ayçicek", R.drawable._203510_favorite_favourite_heart_love_icon))
    list.add(User("Sefa", "Ayçicek", R.drawable._203510_favorite_favourite_heart_love_icon))
    /*
    list.add(User("Sefa", "Ayçicek", R.drawable._835262_dislike_heart_like_love_icon))
    list.add(User("Sefa", "Ayçicek", R.drawable._203510_favorite_favourite_heart_love_icon))
    list.add(User("Sefa", "Ayçicek", R.drawable._203510_favorite_favourite_heart_love_icon))
    list.add(User("Sefa", "Ayçicek", R.drawable._835262_dislike_heart_like_love_icon))
    list.add(User("Sefa", "Ayçicek", R.drawable._835262_dislike_heart_like_love_icon))
    list.add(User("Sefa", "Ayçicek", R.drawable.ic_back))
    list.add(User("Sefa", "Ayçicek", R.drawable.ic_home))
    list.add(User("Sefa", "Ayçicek", R.drawable._835262_dislike_heart_like_love_icon))
    list.add(User("Sefa", "Ayçicek", R.drawable._203510_favorite_favourite_heart_love_icon))
    list.add(User("Sefa", "Ayçicek", R.drawable._835262_dislike_heart_like_love_icon))
    list.add(User("Sefa", "Ayçicek", R.drawable._203510_favorite_favourite_heart_love_icon))
    list.add(User("Sefa", "Ayçicek", R.drawable._203510_favorite_favourite_heart_love_icon))
    list.add(User("Sefa", "Ayçicek", R.drawable._835262_dislike_heart_like_love_icon))
    list.add(User("Sefa", "Ayçicek", R.drawable._835262_dislike_heart_like_love_icon))
    list.add(User("Sefa", "Ayçicek", R.drawable._835262_dislike_heart_like_love_icon))
    list.add(User("Sefa", "Ayçicek", R.drawable.ic_back))
    list.add(User("Sefa", "Ayçicek", R.drawable.ic_home))
    list.add(User("Sefa", "Ayçicek", R.drawable._835262_dislike_heart_like_love_icon))
    list.add(User("Sefa", "Ayçicek", R.drawable._203510_favorite_favourite_heart_love_icon))
    list.add(User("Sefa", "Ayçicek", R.drawable._835262_dislike_heart_like_love_icon))
    list.add(User("Sefa", "Ayçicek", R.drawable._203510_favorite_favourite_heart_love_icon))
    list.add(User("Sefa", "Ayçicek", R.drawable._203510_favorite_favourite_heart_love_icon))
    list.add(User("Sefa", "Ayçicek", R.drawable._835262_dislike_heart_like_love_icon))
    list.add(User("Sefa", "Ayçicek", R.drawable._835262_dislike_heart_like_love_icon))*/
    return list
}