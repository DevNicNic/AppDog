package com.nicnicdev.appdog.di

import com.nicnicdev.appdog.ui.home.HomeViewModel
import org.koin.dsl.module

val viewModelModule = module {
    single { HomeViewModel(repository = get ()) }
}