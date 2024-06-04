package com.nicnicdev.appdog.di

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class AppDogApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        initializeKoin()
    }

    private fun initializeKoin() {
        startKoin {
            androidLogger(Level.NONE)
            androidContext(this@AppDogApplication)

            modules(
                networkModule,
                dataModule,
                viewModelModule,
            )
        }
    }
}