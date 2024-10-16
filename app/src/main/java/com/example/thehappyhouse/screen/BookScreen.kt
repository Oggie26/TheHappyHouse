package com.example.thehappyhouse.screen
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBarNavigationExample(
    navigateBack: () -> Unit,
) {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text("The Happy House")
                },
                navigationIcon = {
                    IconButton(onClick = navigateBack) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = "Localized description"
                        )
                    }
                }
            )
        }
    ) { innerPadding ->
        Text(
            " ",
            modifier = Modifier.padding(innerPadding)
        )
    }
}

@Composable
fun BookScreen(navController: NavController){
    Scaffold(
        topBar = {
            TopBarNavigationExample(navigateBack = {
                navController.navigateUp()
            })
        }
    ) { innerPadding ->
        Text(
            " Placeholder",
            modifier = Modifier.padding(innerPadding)
        )
    }
}