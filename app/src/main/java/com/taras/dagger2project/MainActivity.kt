package com.taras.dagger2project

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    @field:DatabaseProd
    lateinit var mDataBaseUtils: DataBaseUtils

    @Inject
    @field:DatabaseTest
    lateinit var mDataBaseUtilsTest: DataBaseUtils

    @Inject
    lateinit var mNetworkUtils: NetworkUtils

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        App.appComponent.inject(this)
    }
}
