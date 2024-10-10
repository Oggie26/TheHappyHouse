package com.example.thehappyhouse.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.thehappyhouse.response.ProductResponse
import com.example.thehappyhouse.service.ProductService
import com.google.android.engage.common.datamodel.Price

class ProductViewModel(private val productService: ProductService) : ViewModel() {
    private val _productName = MutableLiveData<String>()
    val productName: LiveData<String> get() = _productName

    private val _price = MutableLiveData<Price>()
    val price: LiveData<Price> get() = _price

    private val _image = MutableLiveData<String>()
    val image: LiveData<String> get() = _image

    private val _description = MutableLiveData<String>()
    val description: LiveData<String> get() = _description

    private val _productId = MutableLiveData<String>()
    val productId: LiveData<String> get() = _productId

    suspend fun getAllProducts(): List<ProductResponse>? {
        try {
            val response = productService.getProduct()
            if (response.isSuccessful) {
                val productResponse = response.body()
                return productResponse
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return null
    }

}