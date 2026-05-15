package com.example.kreeda_preranascoutsports

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // ✅ STRICT binding (IMPORTANT FIX)
        val add = findViewById<Button>(R.id.btnAddAthlete)
        val trial = findViewById<Button>(R.id.btnTrial)
        val leader = findViewById<Button>(R.id.btnLeader)
        val graph = findViewById<Button>(R.id.btnGraph)
        val batch = findViewById<Button>(R.id.btnBatch)
        val genAI = findViewById<Button>(R.id.btnGenAI)

        add.setOnClickListener {
            startActivity(Intent(this, AthleteActivity::class.java))
        }

        trial.setOnClickListener {
            startActivity(Intent(this, TrialActivity::class.java))
        }

        leader.setOnClickListener {
            startActivity(Intent(this, LeaderboardActivity::class.java))
        }

        graph.setOnClickListener {
            startActivity(Intent(this, GraphActivity::class.java))
        }

        batch.setOnClickListener {
            startActivity(Intent(this, BatchEntryActivity::class.java))
        }

        genAI.setOnClickListener {
            startActivity(Intent(this, GenAIActivity::class.java))
        }
    }
}