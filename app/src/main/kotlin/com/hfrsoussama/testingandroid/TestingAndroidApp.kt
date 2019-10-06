package com.hfrsoussama.testingandroid

import android.app.Application
import com.hfrsoussama.testingandroid.dependencies.appModules
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class TestingAndroidApp : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@TestingAndroidApp)
            modules(appModules)
        }
    }
}