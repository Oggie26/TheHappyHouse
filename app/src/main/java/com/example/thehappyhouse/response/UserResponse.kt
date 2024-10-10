package com.example.thehappyhouse.response
import com.example.testlogin.ui.theme.enity.User
import com.google.gson.annotations.SerializedName

data class UserResponse(
    @SerializedName("id") val userId: String,
    @SerializedName("username") val username: String,
    @SerializedName("password") val password: String,
    @SerializedName("phone")    val  phone : String,
    @SerializedName("status")   val status : Boolean
){
    fun toInformationUser() : User {
        return User(
            id = this.userId,
            username = this.username,
            password = this.password,
            phone = this.phone,
            status = this.status
        )
    }
}
