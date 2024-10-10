import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NavController
import com.example.thehappyhouse.component.LineStarLogo
import com.example.thehappyhouse.controller.ROUTE_NAME

@Composable
fun Navbar(navController: NavController, ) {
        BottomAppBar(
        ) {
            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier.fillMaxWidth().background(color = Color.LightGray)

            ) {
                NavIconButton(navController = navController, icon = Icons.Filled.Home) {
                    navController.navigate(ROUTE_NAME.home.name)
                }
                NavIconButton(navController = navController, icon = Icons.Filled.ShoppingCart) {
                    navController.navigate(ROUTE_NAME.order.name)
                }
                NavIconButton(navController = navController, icon = Icons.Filled.LocationOn) {
                    navController.navigate(ROUTE_NAME.location.name)
                }
                NavIconButton(navController = navController, icon = Icons.Filled.Menu) {
                    navController.navigate(ROUTE_NAME.menu.name)
                }
            }
        }
    }


@Composable
fun NavIconButton(navController: NavController, icon: ImageVector, onClick: () -> Unit) {
    IconButton(onClick = onClick) {
        Icon(
            imageVector = icon,
            contentDescription = null
        )
    }
}
@Composable
fun ElevatedButtonExample(onClick: () -> Unit) {
    ElevatedButton(onClick = { onClick() }) {
        Text("Elevated")
    }
}

@Composable
fun Example(onClick: () -> Unit) {
    FloatingActionButton(
        onClick = { onClick() },
    ) {
        Icon(Icons.Filled.Add, "Floating action button.")
    }
}