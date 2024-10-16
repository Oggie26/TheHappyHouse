package com.example.thehappyhouse.screen

import Navbar
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController


@Composable
fun LocationScreen(navController: NavController){
    Column(modifier = Modifier.fillMaxWidth()) {
        Scaffold(
            topBar = {
                TopBarNavigationExample(navigateBack = {
                    navController.navigateUp()
                })
            }
        )

        { innerPadding ->
            Text(
                "",
                modifier = Modifier.padding(innerPadding)
            )
        }


    }
}