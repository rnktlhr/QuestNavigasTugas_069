package com.example.tugas4

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.tugas4.view.HomePage
import com.example.tugas4.view.TampilData
import com.example.tugaspam.FormPendaftaran

enum class Navigasi {
    Home,
    FormPendaftaran,
    Detail
}

@Composable
fun DataApp(
    navController: NavHostController = rememberNavController(),
    modifier: Modifier
) {
    Scaffold { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = Navigasi.Home.name,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(route = Navigasi.Home.name) {
                HomePage(
                    onSubmitClick = {
                        navController.navigate(Navigasi.FormPendaftaran.name)
                    }
                )
            }
            composable(route = Navigasi.FormPendaftaran.name) {
                FormPendaftaran(
                    onSubmitData = {
                        navController.navigate(Navigasi.Detail.name)
                    }
                )
            }
            composable(route = Navigasi.Detail.name) {
                TampilData(
                    onBackBtnClick = {
                        navController.popBackStack()
                    },
                    onBackBtnClick1 = {
                        navController.navigate(Navigasi.Home.name) {
                            popUpTo(Navigasi.Home.name) {
                                inclusive = true
                            }
                            launchSingleTop = true
                        }
                    }
                )
            }
        }
    }
}

