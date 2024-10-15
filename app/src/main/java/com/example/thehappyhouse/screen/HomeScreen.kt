package com.example.testlogin.screen
import Navbar
import android.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.thehappyhouse.component.BoxHomeComponent
import com.example.thehappyhouse.component.ProductListScreen
import com.example.thehappyhouse.component.SmallTitle

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
            }
        // Hot Search
           SmallTitle(icon = Icons.Filled.LocationOn, name = "Hot Search")
//           Row() {
//               Column(modifier = Modifier.fillMaxWidth()) {
//                   ProductListScreen()
//               }
//           }
        // Top Favorite
           SmallTitle(icon = Icons.Filled.Favorite, name = "Top Favorite")

        //News
           SmallTitle(icon = Icons.Filled.Share, name = "News")
        //Navbar
           Navbar(navController)

        }
    }
}