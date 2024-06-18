package com.nicnicdev.appdog.data

import retrofit2.http.GET

interface DogsGateway {
    @GET("breeds/image/random")
    suspend fun getRandomDog(): DogsResponse
}