package com.example.thehappyhouse.controller

    import android.os.Build
    import androidx.annotation.RequiresApi
    import androidx.compose.runtime.Composable
    import androidx.navigation.compose.NavHost
    import androidx.navigation.compose.composable
    import androidx.navigation.NavHostController
    import com.example.testlogin.screen.HomeScreen
    import com.example.testlogin.screen.LocationScreen
    import com.example.testlogin.screen.LoginScreen
    import com.example.testlogin.screen.MenuScreen
    import com.example.testlogin.screen.OrderScreen
    import com.example.testlogin.screen.WelComeScreen

enum class ROUTE_NAME {
    welcome,
    login,
    home,
    location,
    order,
    menu,
}


@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun AppNavHost(
    navController: NavHostController
) {
    NavHost(navController = navController, startDestination = ROUTE_NAME.welcome.name) {
        composable(ROUTE_NAME.welcome.name) { WelComeScreen(navController) }
        composable(ROUTE_NAME.login.name) { LoginScreen(navController) }
        composable(ROUTE_NAME.home.name) { HomeScreen(navController) }
        composable(ROUTE_NAME.order.name) { OrderScreen(navController) }
        composable(ROUTE_NAME.order.name) { LocationScreen(navController) }
        composable(ROUTE_NAME.menu.name) { MenuScreen(navController) }


    }
}

