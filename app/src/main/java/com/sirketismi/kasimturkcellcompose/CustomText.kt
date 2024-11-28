package com.sirketismi.kasimturkcellcompose

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun CustomText() {

    Column {
        Text("Detayları görmek için tıklayınız")

        Text(
            buildAnnotatedString {
                append("Detayları görmek için")

                withStyle(style = SpanStyle(color = Color.Blue, fontWeight = FontWeight.Bold)) {
                    append(" tıklayınız")
                }

                append("veya isterseniz şuna")

                withStyle(style = SpanStyle(color = Color.Red, fontWeight = FontWeight.W200)) {
                    append(" tıklayınız")
                }
            }

        )
    }
}