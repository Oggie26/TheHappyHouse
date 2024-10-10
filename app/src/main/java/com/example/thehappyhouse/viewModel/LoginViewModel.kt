package com.example.thehappyhouse.viewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import com.example.testlogin.service.LoginService
import com.example.thehappyhouse.controller.ROUTE_NAME
import com.example.thehappyhouse.response.UserResponse
import kotlinx.coroutines.CoroutineScope

class LoginViewModel(private val loginService: LoginService) : ViewModel() {
    private val _username = MutableLiveData<String>()
    val username: LiveData<String> get() = _username

    private val _password = MutableLiveData<String>()
    val password: LiveData<String> get() = _password

    private val _status = MutableLiveData<Boolean>()
    val status: LiveData<Boolean> get() = _status

    private val _toastMessage = MutableLiveData<String>()
    val toastMessage: LiveData<String> get() = _toastMessage

    private suspend fun checkLogin(
        username: String,
        password: String,
        navController: NavController? = null,
        viewModelScope: CoroutineScope
    ): UserResponse? {
        try {
            val response = loginService.getUser()
            if (response.isSuccessful) {
                val userResponseList = response.body()
                val validUser =
                    userResponseList?.firstOrNull { it.username == username && it.password == password }
                _status.value = validUser != null
                if (validUser != null) {
                    navController?.navigate(ROUTE_NAME.home.name)
                }
                return validUser
            }
        } catch (e: Exception) {
            e.printStackTrace()
            _toastMessage.value = "Error occurred: ${e.message}"
        }
        return null
    }

//    companion object {
//        fun Login(viewModelScope: CoroutineScope, username: String, password: String, navController: NavController? = null) {
//            viewModelScope.launch {
//               LoginViewModel.checkLogin(viewModelScope,username, password, navController)
//            }
//        }
//    }
}



