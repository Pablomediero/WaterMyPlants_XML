package com.example.watermyplants_xml

import android.app.Application
import com.example.watermyplants_xml.di.mainModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class WaterApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@WaterApplication)
            modules(mainModule)
        }
    }
}