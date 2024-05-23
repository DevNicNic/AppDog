package com.nicnicdev.appdog.di

import com.nicnicdev.appdog.data.DogRepository
import org.koin.dsl.module

val dataModule = module {
    single { DogRepository(api = get()) }
}