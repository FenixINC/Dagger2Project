package com.taras.dagger2project

import dagger.Module
import dagger.Provides

@Module
class StorageModule {

    @Provides
    fun provideDatabaseHelper() = DataBaseUtils("database.db")

//    @Provides
//    fun provideDatabaseHelperTest() = DataBaseUtils("test.db")
}