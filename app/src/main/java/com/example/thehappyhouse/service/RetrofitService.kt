package com.example.testlogin.service

import com.example.thehappyhouse.service.ProductService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

open class RetrofitService(baseURL: String) {
    private val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl(baseURL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun <T> createService(serviceClass1: String, serviceClass: Class<T>): T {
        return retrofit.create(serviceClass)
    }

    val loginService
        get() = createService("https://66938cfbc6be000fa07bf575.mockapi.io/user",LoginService::class.java)
    val productService
        get() = createService("https://66938cfbc6be000fa07bf575.mockapi.io/product",ProductService::class.java)

}

