package com.nicnicdev.appdog.data

import retrofit2.http.GET

interface DogGateway {
    @GET("/breeds/image/random")
    suspend fun getRandomDogImage(): DogResponse
}