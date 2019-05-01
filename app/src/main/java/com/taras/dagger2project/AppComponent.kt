package com.taras.dagger2project

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [
    StorageModule::class,
    NetworkModule::class
])
interface AppComponent {

    fun inject(activity: MainActivity)

    fun getNetworkUtils(): NetworkUtils

    @DatabaseProd
    fun getDatabaseUtils(): DataBaseUtils

    @DatabaseTest
    fun getDatabaseUtilsTest(): DataBaseUtils
}