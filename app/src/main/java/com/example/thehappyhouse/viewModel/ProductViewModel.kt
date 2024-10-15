package com.example.thehappyhouse.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.thehappyhouse.response.ProductResponse
import com.example.thehappyhouse.service.ProductService
import com.google.android.engage.common.datamodel.Price
import kotlinx.coroutines.launch

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

    private val _products = MutableLiveData<List<ProductResponse>?>()
    val products: LiveData<List<ProductResponse>?> get() = _products

    fun fetchAllProducts() {
        viewModelScope.launch {
            try {
                val response = productService.getProduct()
                if (response.isSuccessful) {
                    val productResponse = response.body()
                    _products.value = productResponse
                }
            } catch (e: Exception) {
                e.printStackTrace()
                _products.value = null
            }
        }
    }
}
