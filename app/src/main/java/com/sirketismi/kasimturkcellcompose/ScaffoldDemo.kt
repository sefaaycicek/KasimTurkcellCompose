package com.sirketismi.kasimturkcellcompose

import android.widget.CheckBox
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.selection.selectable
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Checkbox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun ScaffoldDemo() {
    Scaffold(
        topBar = {
            TopAppBar(title = { Text("Scaffold Demo") },
                navigationIcon = {
                    IconButton(onClick = { }) {
                        Icon(imageVector = Icons.Filled.ArrowBack,
                            contentDescription = null)
                    }
                },
                actions = {
                    IconButton(onClick = { }) {
                        Icon(imageVector = Icons.Filled.Star,
                            contentDescription = null)
                    }
                    IconButton(onClick = { }) {
                        Icon(imageVector = Icons.Filled.Settings,
                            contentDescription = null)
                    }
                    IconButton(onClick = { }) {
                        Icon(imageVector = Icons.Filled.Search,
                            contentDescription = null)
                    }
                }
            )
        }
    ) { innerPadding ->
        Box(modifier = Modifier.padding(innerPadding)) {
            Column {
                RadioButtonSample()
                HorizontalDivider(thickness = 1.dp, color = Color.Black)

                Row {
                    SwitchDemo()
                    VerticalDivider(thickness = 1.dp, color = Color.Black, modifier = Modifier.height(50.dp).padding(horizontal = 10.dp))
                    SwitchDemo()
                    VerticalDivider(thickness = 1.dp, color = Color.Black, modifier = Modifier.height(50.dp).padding(horizontal = 10.dp))
                    SwitchDemo()
                }

                HorizontalDivider(thickness = 1.dp, color = Color.Black)
                CheckBoxDemo()
                HorizontalDivider(thickness = 1.dp, color = Color.Black)
                CenteredBox()
            }

        }
    }
}

// MVI

@Composable
fun SwitchDemo() {
    var checkState by remember { mutableStateOf(true) }
    Switch(checked = checkState, onCheckedChange = { checkState = it })
}

@Composable
fun CheckBoxDemo() {
    var checkState by remember { mutableStateOf(true) }
    Checkbox(checked = checkState, onCheckedChange = { checkState = it })
}

@Composable
fun RadioButtonSample() {
//    val (name, surname) = Person("", "",0 )

    val radioOptions = listOf(1, 2, 3)
    val (selectedOption, onOptionSelected) = remember { mutableIntStateOf(radioOptions[1]) }

    Column {
        radioOptions.forEach {
            Row(verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.selectable(
                    selected = (it == selectedOption),
                    onClick = { onOptionSelected(it) }
                )) {
                RadioButton(
                    selected = (it == selectedOption),
                    onClick = { onOptionSelected(it) })
                Text(text = "Option $it")
            }
        }
    }
}


data class Person(val name : String, val surname : String, val age : Int)



























