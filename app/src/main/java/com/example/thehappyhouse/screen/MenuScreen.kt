import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBalanceWallet
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.AddCard
import androidx.compose.material.icons.filled.Atm
import androidx.compose.material.icons.filled.AttachMoney
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material3.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.thehappyhouse.component.LargeBox
import com.example.thehappyhouse.component.SmallBox
import com.example.thehappyhouse.component.SmallTitle
import com.example.thehappyhouse.controller.ROUTE_NAME

@Composable
fun MenuScreen(navController: NavController){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray)
    ) {
        Column(modifier = Modifier.fillMaxWidth().padding(16.dp)) {
            Row {
                SmallTitle(
                    icon = Icons.Filled.MoreVert,
                    name = "Extension",
                )
            }
            Row {
                SmallBox(navController, icon = Icons.Filled.DateRange, name = "History") {
                    navController.navigate(ROUTE_NAME.history)
                }
                SmallBox(navController, icon = Icons.Filled.Warning, name = "Rule"){
                    navController.navigate(ROUTE_NAME.rule)
                }
            }
            Row {
                LargeBox(navController, icon = Icons.Filled.Favorite, name = "Favourite Home"){
                    navController.navigate(ROUTE_NAME.favourite)
                }
            }

            Spacer(modifier = Modifier.height(20.dp))
            Row {
                SmallTitle(
                    icon = Icons.Filled.Atm,
                    name = "Wallet",
                )
            }
            Row{
                Box(
                    modifier = Modifier.fillMaxWidth()
                        .background(color = Color.White)
                        .border(width = 1.dp, color = Color.Black, shape = RoundedCornerShape(8.dp))
                ) {
                    Column {
                        SmallTitle(icon = Icons.Filled.AccountBalanceWallet , name = "Wallet")
                        Divider(color = Color.Gray, thickness = 1.dp)
                        SmallTitle(icon = Icons.Filled.AddCard , name = "Card")
                        Divider(color = Color.Gray, thickness = 1.dp)
                        SmallTitle(icon = Icons.Filled.AttachMoney , name = "Refund Money")

                    }
                }
            }

            Spacer(modifier = Modifier.height(20.dp))
            Row {
                SmallTitle(
                    icon = Icons.Filled.Face,
                    name = "Account",
                )
            }

            Row{
                Box(
                    modifier = Modifier.fillMaxWidth()
                        .background(color = Color.White)
                        .border(width = 1.dp, color = Color.Black, shape = RoundedCornerShape(8.dp))
                ) {
                    Column {
                        SmallTitle(icon = Icons.Filled.AccountCircle, name = "Profile")
                        Divider(color = Color.Gray, thickness = 1.dp)
                        SmallTitle(icon = Icons.Filled.Settings, name = "Setting")
                        Divider(color = Color.Gray, thickness = 1.dp)
                        SmallTitle(icon = Icons.Filled.Info, name = "Help Support")
                        Divider(color = Color.Gray, thickness = 1.dp)
                        SmallTitle(icon = Icons.Filled.ExitToApp, name = "Log Out")
                    }
                }
            }
            Spacer(modifier = Modifier.height(20.dp))
        }
        Row{
            Navbar(navController)
        }

    }
}