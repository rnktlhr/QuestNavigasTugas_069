package com.example.tugas4

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp

@Composable
fun FormulirPendaftaran(modifier: Modifier){
    val nama by remember { mutableStateOf(TextFieldValue("")) }
    val alamat by remember { mutableStateOf(TextFieldValue("")) }
    val jenisKelamin by remember { mutableStateOf("") }
    val statusPerkawinan by remember { mutableStateOf("") }

    val paddingSmall = dimensionResource(id = R.dimen.padding_small)
    val paddingMedium = dimensionResource(id = R.dimen.padding_medium)
    val paddingLarge = dimensionResource(id = R.dimen.padding_large)
    val buttonHeight = dimensionResource(id = R.dimen.button_height)

    Surface(
        color = Color(0xFFF6ECFF),
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 10.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .statusBarsPadding()
                    .background(Color(0xFFB56BFF))
                    .padding(vertical = paddingLarge)
            ) {

            }
        }
    }
}