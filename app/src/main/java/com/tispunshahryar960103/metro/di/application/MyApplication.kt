package com.tispunshahryar960103.metro.di.application

import android.app.Application
import android.content.Context
import dagger.hilt.android.HiltAndroidApp
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

@HiltAndroidApp
class MyApplication : Application() {


    companion object {


        lateinit var appContext: Application

        fun getMyappContext(): Context {

            return appContext.applicationContext
        }


    }


    override fun onCreate() {
        super.onCreate()
        appContext = this


    }


}