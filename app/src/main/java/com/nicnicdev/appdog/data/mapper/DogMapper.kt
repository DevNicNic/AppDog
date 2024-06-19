package com.nicnicdev.appdog.data.mapper

import com.nicnicdev.appdog.data.DogsResponse
import com.nicnicdev.appdog.domain.model.Dog

object DogMapper {
    fun toDomain(response: DogsResponse) = Dog(message = response.message)
}