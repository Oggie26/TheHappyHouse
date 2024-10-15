package com.example.testlogin.service

import com.example.thehappyhouse.service.ProductService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitService(baseURL: String) {
    private val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl(baseURL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    private inline fun <reified T> createService(serviceClass: Class<T>): T {
        return retrofit.create(T::class.java)
    }

    val loginService: LoginService
        get() = createService(LoginService::class.java)

    val productService: ProductService
        get() = createService(ProductService::class.java)
}