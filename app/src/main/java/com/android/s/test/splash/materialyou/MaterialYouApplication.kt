package com.android.s.test.splash.materialyou

import android.app.Application
import androidx.appcompat.app.AppCompatDelegate
import com.google.android.material.color.DynamicColors

class MaterialYouApplication : Application() {
    companion object {
        lateinit var instance: MaterialYouApplication
            private set
    }

    override fun onCreate() {
        super.onCreate()
        instance = this

        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true)
        DynamicColors.applyToActivitiesIfAvailable(this)
    }
}