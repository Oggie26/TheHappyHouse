package com.example.thehappyhouse.controller

    import MenuScreen
    import android.os.Build
    import androidx.annotation.RequiresApi
    import androidx.compose.runtime.Composable
    import androidx.navigation.compose.NavHost
    import androidx.navigation.compose.composable
    import androidx.navigation.NavHostController
    import com.example.testlogin.screen.HomeScreen
    import com.example.thehappyhouse.screen.LocationScreen
    import com.example.testlogin.screen.LoginScreen
    import com.example.testlogin.screen.WelComeScreen
    import com.example.thehappyhouse.screen.BookScreen
    import com.example.thehappyhouse.screen.FavouriteScreen
    import com.example.thehappyhouse.screen.FeedBackScreen
    import com.example.thehappyhouse.screen.HistoryBookingScreen
    import com.example.thehappyhouse.screen.PointScreen
    import com.example.thehappyhouse.screen.ViewRoomScreen

enum class ROUTE_NAME {
    welcome,
    login,
    home,
    location,
    menu,
    viewroom,
    point,
    book,
    feedback,
    history,
    rule,
    favourite

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
        composable(ROUTE_NAME.location.name) { LocationScreen(navController) }
        composable(ROUTE_NAME.menu.name) { MenuScreen(navController) }
        composable(ROUTE_NAME.viewroom.name) { ViewRoomScreen(navController) }
        composable(ROUTE_NAME.point.name) { PointScreen(navController) }
        composable(ROUTE_NAME.book.name) { BookScreen(navController) }
        composable(ROUTE_NAME.feedback.name) { FeedBackScreen(navController) }
        composable(ROUTE_NAME.history.name) { HistoryBookingScreen(navController) }
        composable(ROUTE_NAME.rule.name) { HistoryBookingScreen(navController) }
        composable(ROUTE_NAME.favourite.name) { FavouriteScreen(navController) }






    }
}

