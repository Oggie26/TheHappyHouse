package com.example.thehappyhouse.service

import com.example.testlogin.service.RetrofitService
import com.example.thehappyhouse.request.ProductRequest
import com.example.thehappyhouse.response.ProductResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.PATCH
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path

interface ProductService {
    @GET("product")
    suspend fun getProduct(): Response<List<ProductResponse>>

    @POST("product")
    suspend fun addUser(@Body productRequest: ProductRequest): Response<ProductResponse>

    @PUT("product/{id}")
    suspend fun updateProduct(
        @Path("id") id: String,
        @Body productRequest: ProductRequest
    ): Response<ProductResponse>

    @PATCH("product/{id}")
    suspend fun disableProduct(
        @Path("id") id: String,
    ): Response<ProductResponse>

    companion object {
        private val retrofitService: RetrofitService by lazy {
            RetrofitService("https://66938cfbc6be000fa07bf575.mockapi.io/product")
        }

        val productService: ProductService by lazy {
            retrofitService.productService
        }
    }
}