package com.rigain.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.rigain.swoosh.R
import com.rigain.swoosh.model.Player
import com.rigain.swoosh.utility.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var player = Player(league = "",skillLevel = "")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(EXTRA_PLAYER,player)
    }

    fun mensLeagueClick(view: View){
        womensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false
        player.league = "mens"
    }

    fun womensLeagueClick(view: View){
        mensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false
        player.league = "womens"
    }

    fun coedLeagueClick(view: View){
        mensLeagueBtn.isChecked = false
        womensLeagueBtn.isChecked = false
        player.league = "co-ed"
    }

    fun leagueNextClick(view: View){
        if(player.league != ""){
            val skillActivityIntent = Intent (this,SkillActivity::class.java )
            skillActivityIntent.putExtra(EXTRA_PLAYER , player)
            startActivity(skillActivityIntent)
        } else {
            Toast.makeText(this,"Please select League.",Toast.LENGTH_SHORT).show()
        }
    }
}
