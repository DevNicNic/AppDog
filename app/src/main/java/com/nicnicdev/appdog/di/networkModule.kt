package com.nicnicdev.appdog.di

import com.nicnicdev.appdog.data.DogGateway
import com.nicnicdev.appdog.network.BuildRetrofit
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.create

val networkModule = module {
    single { BuildRetrofit.build() }

    single<DogGateway> {
        val retrofit = get<Retrofit>()
        retrofit.create<DogGateway>()

    }
}