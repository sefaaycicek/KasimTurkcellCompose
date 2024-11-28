package com.sirketismi.kasimturkcellcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.sharp.Settings
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sirketismi.kasimturkcellcompose.ui.theme.KasimTurkcellComposeTheme
import java.time.format.TextStyle

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            KasimTurkcellComposeTheme {

                ScaffoldDemo()

            }

        }
    }
}

//Column Row Box
@Composable
fun PhoneNumberView() {
    Column(modifier = Modifier.padding(16.dp)) {
        Text(text = "Hello World",
            modifier = Modifier.padding(bottom = 10.dp, top = 20.dp, start = 10.dp, end = 10.dp),
            fontWeight = FontWeight.Bold
        )

        MyButton {

        }

        Text(
            text = "qweqweqw"
        )

        Text(
            text = "Hell13123123"
        )
    }
}

@Preview
@Composable
fun CustomTextField() {
    // Recomposition

    // remember
    // mutableStateOf

    var textState by remember { mutableStateOf( "Hello Wold") }

    Column {
        BasicTextField(value = textState, onValueChange =  {
            textState = it
        })

        Text("Password Wrong")

        Button(onClick = {
            textState = "Selam"
        }) {
            Row {
                Icon(Icons.Sharp.Settings, contentDescription = null)
                Text("Bana Tıkla")
            }
        }
    }
}



@Composable
fun MyButton(customOnClick : ()->Unit) {
    Button(onClick = {
        customOnClick()
    }) {
        Row {
            Icon(Icons.Sharp.Settings, contentDescription = null)
            Text("Bana Tıkla")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    KasimTurkcellComposeTheme {
        PhoneNumberView()
    }
}