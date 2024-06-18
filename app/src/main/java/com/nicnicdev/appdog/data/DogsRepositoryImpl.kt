package com.nicnicdev.appdog.data

import com.nicnicdev.appdog.data.mapper.DogMapper
import com.nicnicdev.appdog.domain.DogRepository
import com.nicnicdev.appdog.domain.model.Dog

class DogsRepositoryImpl(
    private val api: DogsGateway,
): DogRepository {
    override suspend fun getRandomDog(): Dog {
        val response = api.getRandomDog()
        return DogMapper.toDomain(response)
    }

}