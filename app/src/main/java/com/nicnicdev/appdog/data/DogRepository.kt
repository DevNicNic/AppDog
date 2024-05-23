package com.nicnicdev.appdog.data

class DogRepository(
    private val api: DogGateway,
) {
    suspend fun getRandomDogImage() = api.getRandomDogImage()

}