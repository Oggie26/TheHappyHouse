package com.example.thehappyhouse.request

import com.google.gson.annotations.SerializedName

data class UserRequest(
    @SerializedName("id") var userId: String? = null,
    @SerializedName("username") val username: String,
    @SerializedName("password") val password: String,
    @SerializedName("phone") val phone: String,
)
