package com.example.thehappyhouse.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.thehappyhouse.controller.ROUTE_NAME
import com.example.thehappyhouse.R


@Composable
fun BoxHomeComponent(navController: NavController, content: @Composable () -> Unit) {
    OutlinedCard(
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surface,
        ),
        border = BorderStroke(1.dp, Color.Black),
        modifier = Modifier.size(width = 400.dp, height = 150.dp)

    ) {
        Row(
            modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.clickable {
                    navController.navigate(ROUTE_NAME.viewroom.name)
                }
            ) {
                Image(
                    painter = painterResource(id = R.drawable.dalat3),
                    contentDescription = null,
                    modifier = Modifier.size(90.dp)
                )
                Text(text = "View Room", fontWeight = FontWeight.Bold)
            }

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.clickable {
                    navController.navigate(ROUTE_NAME.point.name)
                }
            ) {
                Image(
                    painter = painterResource(id = R.drawable.dalat4),
                    contentDescription = null,
                    modifier = Modifier.size(90.dp)
                )
                Text(text = "Point", fontWeight = FontWeight.Bold)
            }

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.clickable {
                    navController.navigate(ROUTE_NAME.book.name)
                }
            ) {
                Image(
                    painter = painterResource(id = R.drawable.dalat2),
                    contentDescription = null,
                    modifier = Modifier.size(90.dp)
                )
                Text(text = "Book Room", fontWeight = FontWeight.Bold)
            }

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.clickable {
                    navController.navigate(ROUTE_NAME.feedback.name)
                }
            ) {
                Image(
                    painter = painterResource(id = R.drawable.dalat1),
                    contentDescription = null,
                    modifier = Modifier.size(90.dp)
                )
                Text(text = "Feedback", fontWeight = FontWeight.Bold)
            }
        }
    }
}
