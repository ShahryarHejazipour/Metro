package com.tispunshahryar960103.metro.webService.di

import com.tispunshahryar960103.metro.repository.Repository
import com.tispunshahryar960103.metro.utils.Constants
import com.tispunshahryar960103.metro.webService.IService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.scopes.FragmentScoped
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class IServiceModule {


    init {
        System.loadLibrary(Constants.NDK_LIB_NAME.str)
    }


    @Provides
    @Singleton
    fun getRetrofit(): IService {

        return Retrofit.Builder()
            .baseUrl(getBaseUrl())
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(IService::class.java)
    }



    @Provides
    @Singleton
    fun provideRepository(): Repository {

        return Repository(getRetrofit())
    }





    private external fun getBaseUrl(): String
}