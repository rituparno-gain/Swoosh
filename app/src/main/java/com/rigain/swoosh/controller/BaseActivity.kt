package com.rigain.swoosh.controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.rigain.swoosh.utility.LOG_ID

open class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(LOG_ID,"${javaClass.simpleName} onCreate")
        super.onCreate(savedInstanceState)
    }

    override fun onStart() {
        Log.d(LOG_ID,"${javaClass.simpleName} onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.d(LOG_ID,"${javaClass.simpleName} onResume")
        super.onResume()
    }

    override fun onRestart() {
        Log.d(LOG_ID,"${javaClass.simpleName} onRestart")
        super.onRestart()
    }

    override fun onPause() {
        Log.d(LOG_ID,"${javaClass.simpleName} onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d(LOG_ID,"${javaClass.simpleName} onStop")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d(LOG_ID,"${javaClass.simpleName} onDestroy")
        super.onDestroy()
    }


}
