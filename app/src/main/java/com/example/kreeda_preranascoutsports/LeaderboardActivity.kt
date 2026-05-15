package com.example.kreeda_preranascoutsports

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LeaderboardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_leaderboard)

        val rank1 = findViewById<TextView>(R.id.tvRank1)
        val rank2 = findViewById<TextView>(R.id.tvRank2)
        val rank3 = findViewById<TextView>(R.id.tvRank3)

        // Sample sorted leaderboard data
        rank1.text = "🥇 1. Guru - 10.21 sec"
        rank2.text = "🥈 2. Seena - 10.54 sec"
        rank3.text = "🥉 3. Manju - 10.80 sec"
    }
}