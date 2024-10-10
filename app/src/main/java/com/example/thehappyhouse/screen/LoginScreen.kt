    package com.example.testlogin.screen

    import android.os.Build
    import androidx.annotation.RequiresApi
    import androidx.compose.foundation.layout.Column
    import androidx.compose.foundation.layout.Spacer
    import androidx.compose.foundation.layout.fillMaxSize
    import androidx.compose.foundation.layout.fillMaxWidth
    import androidx.compose.foundation.layout.height
    import androidx.compose.foundation.layout.padding
    import androidx.compose.material3.Surface
    import androidx.compose.material3.Text
    import androidx.compose.runtime.Composable
    import androidx.compose.runtime.getValue
    import androidx.compose.runtime.mutableStateOf
    import androidx.compose.runtime.remember
    import androidx.compose.runtime.setValue
    import androidx.compose.ui.Modifier
    import androidx.compose.ui.text.style.TextAlign
    import androidx.compose.ui.unit.dp
    import androidx.compose.ui.unit.sp
    import androidx.navigation.NavController
    import com.example.thehappyhouse.component.LineStarLogo
    import com.example.thehappyhouse.component.LoginButton
    import com.example.thehappyhouse.component.PasswordField
    import com.example.thehappyhouse.component.UsernameField
    import com.example.thehappyhouse.controller.ROUTE_NAME


    @RequiresApi(Build.VERSION_CODES.O)
    @Composable
    fun LoginScreen(navController: NavController) {
        var username by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }

        Surface(
            modifier = Modifier
                .fillMaxSize()
                .padding(12.dp),
        ) {
            Column(modifier = Modifier.fillMaxWidth()) {
                LineStarLogo()
                Spacer(modifier = Modifier.height(10.dp))
                UsernameField(username, onUsernameChange = { username = it }) {
                }
                Spacer(modifier = Modifier.height(20.dp))
                PasswordField(password, onPasswordChange = { password = it })
                Spacer(modifier = Modifier.height(20.dp))
                LoginButton {
                    navController.navigate(ROUTE_NAME.home.name)
                }
                Spacer(modifier = Modifier.height(10.dp))
                Text("Do you have a account?",
                    style = androidx.compose.ui.text.TextStyle(textAlign = TextAlign.Center,
                        fontSize = 18.sp),
                    modifier = Modifier.fillMaxSize(),
                )
            }



            }
        }









