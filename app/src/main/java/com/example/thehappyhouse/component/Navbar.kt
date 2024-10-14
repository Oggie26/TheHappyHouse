import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Create
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.thehappyhouse.component.NavButton
import com.example.thehappyhouse.controller.ROUTE_NAME

@Composable
fun Navbar(navController: NavController ) {
        BottomAppBar(
        ) {
            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier.fillMaxWidth()

            ) {
                //Button Home
                NavButton(navController, route = ROUTE_NAME.home.toString()){
                    Icon(Icons.Filled.Home, contentDescription = "Home")
                }
                //Button Order
                NavButton(navController, route = ROUTE_NAME.book.toString()){
                    Icon(Icons.Filled.Create, contentDescription = "Order")
                }
                //Button Location
                NavButton(navController, route = ROUTE_NAME.location.toString()){
                    Icon(Icons.Filled.LocationOn, contentDescription = "Location")
                }
                //Button Menu
                NavButton(navController, route = ROUTE_NAME.menu.toString()){
                    Icon(Icons.Filled.Menu, contentDescription = "Menu")
                }
            }
        }
    }

