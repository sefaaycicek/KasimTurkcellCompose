package com.sirketismi.kasimturkcellcompose

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview()
@Composable
fun PasswordTextField() {
    var password by remember { mutableStateOf("") }
    var passwordVisibility by remember { mutableStateOf(false) }

    Column {
        Box {
            TextField(
                value = password,
                onValueChange = { password = it },
                label = { DefaultHintFormat() },
                visualTransformation = if(passwordVisibility) VisualTransformation.None else PasswordVisualTransformation(),
                modifier = Modifier.fillMaxWidth(),
                isError = password.length < 10
            )

            Row(modifier = Modifier.align(Alignment.CenterEnd)) {
                Icon(
                    imageVector = Icons.Default.Close,
                    contentDescription = null,
                    modifier = Modifier
                        .clickable {
                            password = ""
                        }

                )

                Icon(
                    imageVector = Icons.Filled.Star,
                    contentDescription = null,
                    modifier = Modifier
                        .clickable {
                            passwordVisibility = !passwordVisibility
                        }

                )
            }
        }

        if(passwordVisibility)
            Text("Şifre Görünüyor Dikkat Et")

        if(password.length < 10)
            Text("Şifre Yeterli Uzunlukta Değil")
    }

}

@Composable
fun DefaultHintFormat() {
    Row {
        //Icon(imageVector = Icons.Default.Close, contentDescription = null)
        Text("Şifre Giriniz")
    }
}