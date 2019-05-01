package com.taras.dagger2project

import dagger.Module
import dagger.Provides

@Module
class StorageModule {

    @DatabaseProd
    @Provides
    fun provideDatabaseHelper() = DataBaseUtils("database.db")

    @DatabaseTest
    @Provides
    fun provideDatabaseHelperTest() = DataBaseUtils("test.db")
}