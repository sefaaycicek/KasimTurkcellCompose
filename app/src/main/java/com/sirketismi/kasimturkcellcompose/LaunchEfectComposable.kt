package com.sirketismi.kasimturkcellcompose

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.delay


@Preview
@Composable
fun ShapeText() {
    Box {
        Text("",
            color = Color.White,
            modifier = Modifier.size(200.dp)
                .background(Color.Blue)
                .border(1.dp, Color.Red)
                .padding(20.dp)
                .clip(RoundedCornerShape(8.dp))
                .background(Color.Yellow)
                .clip(CircleShape)
                .border(1.dp, Color.Red, CircleShape)
                .background(Color.Green))

    }
}

@Preview
@Composable
fun ShapeText2() {
    Text("",
        color = Color.White,
        modifier = Modifier.size(50.dp)
            .background(Color.Blue)
            .border(1.dp, Color.Red)
            .padding(20.dp)
            .clip(RoundedCornerShape(8.dp))
            .background(Color.Yellow)
            .clip(CircleShape)
            .background(Color.Green))
}




@Preview
@Composable
fun LaunchEfectComposable() {
    // recomposition
    var counter by remember { mutableIntStateOf(0) }
    var scope = rememberCoroutineScope()

    LaunchedEffect(key1 = Unit) {
        try {
            for(i in 1..10) {
                counter++
                delay(1000)
            }
        } catch (ex : Exception) {
            Log.d("TAG", "LaunchedEffect ${ex.message}")
        }
    }

    var text  = "Counter is running $counter"
    Text(text = text)

}
