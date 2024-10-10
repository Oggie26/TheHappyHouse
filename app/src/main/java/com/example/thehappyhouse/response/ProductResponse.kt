package com.example.thehappyhouse.response

import com.example.testlogin.ui.theme.enity.User
import com.example.thehappyhouse.enity.Product
import com.google.gson.annotations.SerializedName

data class ProductResponse(
    @SerializedName("id") var productId: String,
    @SerializedName("productName") val productName: String,
    @SerializedName("price") val price: Float,
    @SerializedName("image") val image: String,
    @SerializedName("description") val description : String,
    @SerializedName("status") val status : Boolean
){
    fun toInformationProduct() : Product {
        return Product(
            productId = this.productId,
            productName = this.productName,
            price = this.price,
            image = this.image,
            description = this.description,
            status = this.status
        )
    }
}
