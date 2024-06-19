package com.nicnicdev.appdog.di

import com.nicnicdev.appdog.data.DogsRepositoryImpl
import com.nicnicdev.appdog.domain.DogRepository
import org.koin.dsl.module

val dataModule = module {
    single<DogRepository> { DogsRepositoryImpl(api = get()) }
}
