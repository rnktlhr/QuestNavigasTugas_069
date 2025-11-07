package com.example.tugas4.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tugas4.R

@Composable
fun WelcomeScreen(
    nama: String = "Rinakit Luhur",
    nim: String = "20230140069",
    onSubmitClick: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 24.dp, vertical = 48.dp),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Selamat Datang",
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF3A3A9E),
            textAlign = TextAlign.Center
        )
        Image(
            painter = painterResource(id = R.drawable.ugm),
            contentDescription = "",
            modifier = Modifier
                .size(200.dp)
                .padding(vertical = 16.dp)
        )
    }

}