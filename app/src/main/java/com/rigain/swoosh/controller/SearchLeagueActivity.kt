package com.rigain.swoosh.controller

import android.os.Bundle
import com.rigain.swoosh.R
import com.rigain.swoosh.model.Player
import com.rigain.swoosh.utility.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_search_league.*

class SearchLeagueActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search_league)
        searchingLeagueTxt.text = "Searching for ${intent.getParcelableExtra<Player>(EXTRA_PLAYER).league} " +
                " ${intent.getParcelableExtra<Player>(EXTRA_PLAYER).skillLevel} league near you ..."
    }
}
