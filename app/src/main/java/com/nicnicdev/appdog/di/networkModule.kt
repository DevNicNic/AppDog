package com.nicnicdev.appdog.di

import com.nicnicdev.appdog.network.BuildRetrofit
import org.koin.dsl.module

val networkModule = module {
    single { BuildRetrofit.build() }
}