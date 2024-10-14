package com.example.testlogin.screen
import Navbar
import android.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.thehappyhouse.component.BoxHomeComponent
import com.example.thehappyhouse.controller.ROUTE_NAME

@Composable
fun HomeScreen(navController: NavController) {

    Column(
        modifier = Modifier.fillMaxHeight()
    ) {
        // Logo
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White)
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Divider(
                    color = Color.Gray,
                    thickness = 5.dp,
                    modifier = Modifier.width(120.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.star_on),
                    contentDescription = null,
                    modifier = Modifier.size(75.dp)
                )
                Divider(
                    color = Color.Gray,
                    thickness = 5.dp,
                    modifier = Modifier.width(120.dp)
                )
            }
            // Body
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.White)
                    .padding(16.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(40.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(text = "The Happy House", fontSize = 28.sp)
                    Icon(
                        Icons.Filled.Notifications, contentDescription = null,
                        Modifier.size(40.dp),
                    )
                }
            }
        }
        //Body
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White)
                .padding(10.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            BoxHomeComponent(navController) {
//                Row(
//                    modifier = Modifier.fillMaxSize(),
//                    horizontalArrangement = Arrangement.SpaceEvenly,
//                    verticalAlignment = Alignment.CenterVertically
//                ) {
//                    Column(
//                        horizontalAlignment = Alignment.CenterHorizontally,
//                        modifier = Modifier.clickable {
//                            navController.navigate(ROUTE_NAME.viewroom.name)
//                        }
//                    ) {
//                        Image(
//                            painter = painterResource(id = R.drawable.ic_menu_gallery),
//                            contentDescription = null,
//                            modifier = Modifier.size(90.dp)
//                        )
//                        Text(text = "View Room", fontWeight = FontWeight.Bold)
//                    }
//
//                    Column(
//                        horizontalAlignment = Alignment.CenterHorizontally,
//                        modifier = Modifier.clickable {
//                            navController.navigate(ROUTE_NAME.point.name)
//                        }
//                    ) {
//                        Image(
//                            painter = painterResource(id = R.drawable.star_on),
//                            contentDescription = null,
//                            modifier = Modifier.size(90.dp)
//                        )
//                        Text(text = "Point", fontWeight = FontWeight.Bold)
//                    }
//
//                    Column(
//                        horizontalAlignment = Alignment.CenterHorizontally,
//                        modifier = Modifier.clickable {
//                            navController.navigate(ROUTE_NAME.book.name)
//                        }
//                    ) {
//                        Image(
//                            painter = painterResource(id = R.drawable.ic_menu_call),
//                            contentDescription = null,
//                            modifier = Modifier.size(90.dp)
//                        )
//                        Text(text = "Book Room", fontWeight = FontWeight.Bold)
//                    }
//
//                    Column(
//                        horizontalAlignment = Alignment.CenterHorizontally,
//                        modifier = Modifier.clickable {
//                            navController.navigate(ROUTE_NAME.feedback.name)
//                        }
//                    ) {
//                        Image(
//                            painter = painterResource(id = R.drawable.ic_menu_always_landscape_portrait),
//                            contentDescription = null,
//                            modifier = Modifier.size(90.dp)
//                        )
//                        Text(text = "Feedback", fontWeight = FontWeight.Bold)
//                    }
//                }
//            }
//        }
            }
            // Navbar
            Navbar(navController)
        }
    }
}