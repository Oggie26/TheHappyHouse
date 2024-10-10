package com.example.thehappyhouse.controller

enum class Screen {
    HOME,
    LOGIN,
    REGISTER,
}
sealed class NavigationItem(val route: String) {
    object Login : NavigationItem(Screen.LOGIN.name)
    object Home : NavigationItem(Screen.HOME.name)
    object Register : NavigationItem(Screen.REGISTER.name)
//    object Menu : NavigationItem(Screen.)

}