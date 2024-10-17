package com.example.thehappyhouse.component

import android.view.MotionEvent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.input.pointer.pointerInteropFilter
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

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun SmallBox(navController: NavController, icon: ImageVector, name: String, route: String) {
    OutlinedCard(
        border = BorderStroke(1.dp, Color.Black),
        modifier = Modifier.size(width = 190.dp, height = 100.dp)
            .padding(10.dp)
            .clickable {
                navController.navigate(route)
            },
        shape = RoundedCornerShape(8.dp)
    ) {
        Column(modifier = Modifier.fillMaxSize()) {
            Row(
                modifier = Modifier.fillMaxSize(),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {
                SmallTitle(icon, name)
            }
        }
    }
}

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun LargeBox(navController: NavController, icon: ImageVector, name: String, route: String) {
    OutlinedCard(
        border = BorderStroke(1.5.dp, Color.Black),
        modifier = Modifier.size(width = 420.dp, height = 120.dp)
            .padding(10.dp)
            .clickable {
                navController.navigate(route)
            }
            .pointerInteropFilter {
                when (it.action) {
                    MotionEvent.ACTION_UP -> {
                        navController.navigate(route)
                    }
                }
                true
            },
        shape = RoundedCornerShape(8.dp)
    ) {
        Column(modifier = Modifier.fillMaxSize()) {
            Row(
                modifier = Modifier.fillMaxSize(),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {
                SmallTitle(icon, name)
            }
        }
    }
}