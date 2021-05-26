package com.submission2.capstoneproject2.ui

import android.app.Application
import com.capstoneproject2.core.di.DaggerCoreComponent
import com.submission2.capstoneproject2.di.AppComponent
import com.submission2.capstoneproject2.di.DaggerAppComponent

open class BaseApplication: Application() {
    val appComponent: AppComponent by lazy {
        DaggerAppComponent.builder().coreComponent(coreComponent).build()
    }

    private val coreComponent by lazy {
        DaggerCoreComponent.builder().context(this).build()
    }


}