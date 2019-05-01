package com.taras.dagger2project

import dagger.Component

@Component(modules = [
    StorageModule::class,
    NetworkModule::class
])
interface AppComponent {

    fun inject(activity: MainActivity)
}