package com.sirketismi.kasimturkcellcompose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview
@Composable
fun CustomButton() {
    Column (Modifier.fillMaxSize().background(Color.White).padding(30.dp)) {

        ExtendedFloatingActionButton(onClick =  {

        },
            containerColor = Color.Blue,
            contentColor = Color.Red,
            elevation = FloatingActionButtonDefaults.elevation(20.dp)) {
            Text("Button")
        }
        OutlinedButton(onClick = {

        }) {
            Text("Button")
        }
        
        Button(onClick = {

        }) {
            Text("Button")
        }

        Spacer(Modifier.size(10.dp))

        Button(onClick = {

        }) {
            Text("Button")
        }
    }
}

