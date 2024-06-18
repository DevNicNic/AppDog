package com.nicnicdev.appdog.di

import com.nicnicdev.appdog.data.DogsGateway
import com.nicnicdev.appdog.network.BuildRetrofit
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.create

val networkModule = module {
    single { BuildRetrofit.build() }

    single<DogsGateway> {
        val retrofit = get<Retrofit>()
        retrofit.create<DogsGateway>()

    }
}