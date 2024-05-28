package com.nicnicdev.appdog.data.mapper

import com.nicnicdev.appdog.data.DogResponse
import com.nicnicdev.appdog.domain.model.Dog

object DogMapper {
    fun toDomain(response: DogResponse) = Dog(message = response.message)
}