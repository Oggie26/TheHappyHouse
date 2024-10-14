package com.example.thehappyhouse.controller

enum class Screen {
    HOME,
    LOGIN,
    REGISTER,
    BOOK,
    VIEW_ROOM,
    POINT,
    FEEDBACK

}
sealed class NavigationItem(val route: String) {
    object Login : NavigationItem(Screen.LOGIN.name)
    object Home : NavigationItem(Screen.HOME.name)
    object Register : NavigationItem(Screen.REGISTER.name)
    object Book : NavigationItem(Screen.BOOK.name)
    object ViewRoom : NavigationItem(Screen.VIEW_ROOM.name)
    object Point : NavigationItem(Screen.POINT.name)
    object FeedBack : NavigationItem(Screen.FEEDBACK.name)



}