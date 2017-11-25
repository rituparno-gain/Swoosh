package com.rigain.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.rigain.swoosh.R
import com.rigain.swoosh.model.Player
import com.rigain.swoosh.utility.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    lateinit var player : Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        player = intent.getParcelableExtra(EXTRA_PLAYER)
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(EXTRA_PLAYER,player)
    }

    fun skillBeginnerClick(view: View){
        skillProBtn.isChecked = false
        player.skillLevel = "beginner's"
    }

    fun skillProClick(view: View){
        skillBeginnerBtn.isChecked = false
        player.skillLevel = "professional's"
    }

    fun skillSearchLeagueClick(view: View){
        if(player.skillLevel != "") {
            val searchLeagueActivityIntent = Intent(this, SearchLeagueActivity::class.java)
            searchLeagueActivityIntent.putExtra(EXTRA_PLAYER,player)
            startActivity(searchLeagueActivityIntent)
        } else {
            Toast.makeText(this,"Please select Skill level.",Toast.LENGTH_SHORT).show()
        }
    }
}
