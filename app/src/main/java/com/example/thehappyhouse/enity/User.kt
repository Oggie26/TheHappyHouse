package com.example.testlogin.ui.theme.enity

import com.google.gson.annotations.SerializedName

data class User(
    @SerializedName("id")
    val id: String,

    @SerializedName("username")
    val username : String,

    @SerializedName("password")
    val password : String,

    @SerializedName("phone")
    val phone : String,

    @SerializedName("status")
    val status  : Boolean,

    )
