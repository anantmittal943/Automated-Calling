package com.anantmittal.automatedcalling.app

import android.app.Application
import com.anantmittal.automatedcalling.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class AutomatedCallingApp : Application() {
    override fun onCreate() {
        super.onCreate()
        
        startKoin {
            androidLogger()
            androidContext(this@AutomatedCallingApp)
            modules(appModule)
        }
    }
}
