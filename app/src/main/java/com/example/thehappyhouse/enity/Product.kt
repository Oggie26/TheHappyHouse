package com.example.thehappyhouse.enity

import com.google.gson.annotations.SerializedName

data class Product(
    @SerializedName("id")
    var productId: String? = null,

    @SerializedName("productName")
    val productName: String,

    @SerializedName("price")
    val price: Float,

    @SerializedName("image")
    val image: String,

    @SerializedName("description")
    val description : String,

    @SerializedName("status")
    val status : Boolean
)
