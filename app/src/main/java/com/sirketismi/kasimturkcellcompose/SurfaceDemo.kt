package com.sirketismi.kasimturkcellcompose

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun SurfaceDemo() {
    Surface {
        Surface(
            modifier = Modifier
                .fillMaxSize()
                .padding(30.dp),
            border = BorderStroke(2.dp, Color.Red),
            color = Color.Yellow,
            contentColor = Color.Black,
            shadowElevation = 4.dp,
        ) {
            Column(modifier = Modifier.padding(20.dp)) {
                Text("dassadasd")
                Text("dassadasd")
                Text("dassadasd")
                Text("dassadasd")
                Text("dassadasd")
                Text("dassadasd")
            }
        }
    }
}