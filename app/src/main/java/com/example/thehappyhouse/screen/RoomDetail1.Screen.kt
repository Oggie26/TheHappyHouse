package com.example.thehappyhouse.screen
import Navbar
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material.icons.filled.AttachMoney
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.StarRate
import androidx.compose.material.icons.materialIcon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.thehappyhouse.R
import com.example.thehappyhouse.component.ButtonBasic
import com.example.thehappyhouse.component.NavButton
import com.example.thehappyhouse.component.SmallTitle
import com.example.thehappyhouse.controller.ROUTE_NAME

@Composable
fun RoomDetail1Screen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.LightGray)
    ) {
        Row {
            Column {
                Image(
                    painter = painterResource(R.drawable.dalat3),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                )
            }
            Column{
                SmallTitle(icon = Icons.Filled.LocationOn, name = "Sai Gon")
            }
        }
        Column(
            modifier = Modifier.background(color = Color.White).fillMaxWidth()
        ) {
            SmallTitle(icon = Icons.Filled.Home, name = "HappyHomeStay")
            SmallTitle(icon = Icons.Filled.LocationOn, name = "Ha Noi, District Ba Dinh")
            SmallTitle(icon = Icons.Filled.AttachMoney, name = "50$/day")
            SmallTitle(icon = Icons.Filled.StarRate, name = "4.5/5")
        }
        Row(
            modifier = Modifier
                .fillMaxWidth().padding(5.dp)
        ) {
            ButtonBasic(navController,address = ROUTE_NAME.room_detail1.toString(), content = "4443 views", modifier = Modifier )
            Spacer(modifier = Modifier.width(160.dp))
            ButtonBasic(navController, address = ROUTE_NAME.book.toString(), content = "Book", modifier = Modifier.width(160.dp))
        }
        Row(
            modifier = Modifier.fillMaxSize().background(color = Color.LightGray)
        )
        {
            Column {
                Row{
                    Navbar(navController)
                }
            }


        }
    }
}

