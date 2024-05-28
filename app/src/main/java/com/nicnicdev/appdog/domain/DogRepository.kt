package com.nicnicdev.appdog.domain

import com.nicnicdev.appdog.domain.model.Dog

interface DogRepository {
    suspend fun getRandomDog(): Dog
}