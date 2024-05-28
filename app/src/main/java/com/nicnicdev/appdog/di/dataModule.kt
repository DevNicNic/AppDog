package com.nicnicdev.appdog.di

import com.nicnicdev.appdog.data.DogRepositoryImpl
import com.nicnicdev.appdog.domain.DogRepository
import org.koin.dsl.module

val dataModule = module {
    single<DogRepository> { DogRepositoryImpl(api = get()) }
}
