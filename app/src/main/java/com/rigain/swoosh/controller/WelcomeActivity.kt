package com.rigain.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import com.rigain.swoosh.R

class WelcomeActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
    }

    fun wcGetStartedClick(view : View){
        val leagueActivityIntent = Intent(this, LeagueActivity::class.java)
        startActivity(leagueActivityIntent)
    }
}
