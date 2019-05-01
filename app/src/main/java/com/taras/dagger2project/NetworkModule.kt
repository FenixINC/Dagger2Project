package com.taras.dagger2project

import dagger.Module
import dagger.Provides


@Module
class NetworkModule {

    @Provides
    fun provideNetworkUtil() = NetworkUtils()

//    @Provides
//    fun provideHttpClient() = HttpClient()
}