package com.example.tugas4

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue

@Composable
fun FormulirPendaftaran(modifier: Modifier){
    val nama by remember { mutableStateOf(TextFieldValue("")) }
    val alamat by remember { mutableStateOf(TextFieldValue("")) }
    val jenisKelamin by remember { mutableStateOf("") }
    val statusPerkawinan by remember { mutableStateOf("") }
}