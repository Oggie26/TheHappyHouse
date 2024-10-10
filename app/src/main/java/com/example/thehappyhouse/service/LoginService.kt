package com.example.testlogin.service

import com.example.thehappyhouse.request.UserRequest
import com.example.thehappyhouse.response.UserResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.PATCH
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path

interface LoginService {

    @GET("user")
    suspend fun getUser(): Response<List<UserResponse>>

    @POST("user")
    suspend fun addUser(@Body userRequest : UserRequest): Response<UserResponse>

    @PUT("user/{id}")
    suspend fun updateUser(
        @Path("id") id : String,
        @Body userRequest : UserRequest
    ): Response<UserResponse>

    @PATCH("user/{id}")
    suspend fun disableUser(
        @Path("id") id : String,
    ): Response<UserResponse>

}