package com.tispunshahryar960103.metro.di.modules

import com.tispunshahryar960103.metro.di.application.MyApplication
import com.tispunshahryar960103.metro.utils.AppConfig
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppConfigModule {

    @Provides
    @Singleton
    fun provideAppConfig():AppConfig{
        return AppConfig(MyApplication.appContext)
    }
}