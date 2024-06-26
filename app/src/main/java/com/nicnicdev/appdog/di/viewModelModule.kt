package com.nicnicdev.appdog.di

import com.nicnicdev.appdog.ui.home.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { HomeViewModel(repository = get ()) }
}