package com.example.myapplication

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("api/CarImages/getimageurl")
    suspend fun getImageUrl(@Query("carId") carId: Int): Response<ImageUrlResponse>
}