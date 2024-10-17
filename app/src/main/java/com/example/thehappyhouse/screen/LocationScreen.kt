package com.example.thehappyhouse.screen

import Navbar
import android.media.Image
import android.view.MotionEvent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInteropFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.thehappyhouse.R
import com.example.thehappyhouse.component.SearchScreen
import com.example.thehappyhouse.component.SmallTitle
import com.example.thehappyhouse.controller.ROUTE_NAME

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun LocationScreen(navController: NavController) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.LightGray)
        ){
            Row(modifier = Modifier.padding(16.dp)) {
                SmallTitle(
                    icon = Icons.Filled.LocationOn,
                    name = "Location"
                )
            }
            Row{
                SearchScreen()
            }
            Spacer(modifier = Modifier.height(25.dp))

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = Color.White)
                    .padding(16.dp)
                    .border(width = 1.dp, color = Color.Black, shape = RoundedCornerShape(8.dp))
                    .size(200.dp,150.dp)
                    // dung de movePage ko bi vang
                    .pointerInteropFilter {
                        when (it.action) {
                            MotionEvent.ACTION_UP -> {
                                navController.navigate(ROUTE_NAME.history.name)
                            }
                        }
                        true
                    }
            )
            {
                Column{
                    Image(
                        painter = painterResource(R.drawable.dalat4),
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .fillMaxSize()
                    )
                }
                Column{
                    SmallTitle(icon = Icons.Filled.LocationOn, name = "Sai Gon")
                }
            }
            Spacer(modifier = Modifier.height(20.dp))

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = Color.White)
                    .padding(16.dp)
                    .border(width = 1.dp, color = Color.Black, shape = RoundedCornerShape(8.dp))
                    .size(200.dp,150.dp)
                    // dung de movePage ko bi vang
                    .pointerInteropFilter {
                        when (it.action) {
                            MotionEvent.ACTION_UP -> {
                                navController.navigate(ROUTE_NAME.room_detail1.name)
                            }
                        }
                        true
                    }
            )
            {
                Column{
                    Image(
                        painter = painterResource(R.drawable.dalat3),
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .fillMaxSize()
                    )
                }
                Column{
                    SmallTitle(icon = Icons.Filled.LocationOn, name = "Ha Noi")
                }
            }
            Spacer(modifier = Modifier.height(20.dp))

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = Color.White)
                    .padding(16.dp)
                    .border(width = 1.dp, color = Color.Black, shape = RoundedCornerShape(8.dp))
                    .size(200.dp,150.dp)
                    //dùng để movePage ko bị văng
                    .pointerInteropFilter {
                        when (it.action) {
                            MotionEvent.ACTION_UP -> {
                                navController.navigate(ROUTE_NAME.history.name)
                            }
                        }
                        true
                    }
            )
            {
                    Column{
                        Image(
                            painter = painterResource(R.drawable.dalat1),
                            contentDescription = null,
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .fillMaxSize()
                        )
                    }
                    Column{
                        SmallTitle(icon = Icons.Filled.LocationOn, name = "Da Lat")
                    }
            }
            Spacer(modifier = Modifier.height(25.dp))

            Row{
                Navbar(navController)
            }
        }


    }

