package com.example.kreeda_preranascoutsports

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.room.Room
import kotlinx.coroutines.launch

class AthleteActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_athlete)

        val name = findViewById<EditText>(R.id.etName)
        val age = findViewById<EditText>(R.id.etAge)
        val sport = findViewById<EditText>(R.id.etSport)
        val save = findViewById<Button>(R.id.btnSave)

        val db = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java,
            "athlete_database"
        ).build()

        save.setOnClickListener {

            val athleteName = name.text.toString().trim()
            val athleteAge = age.text.toString().trim()
            val athleteSport = sport.text.toString().trim()

            if (athleteName.isEmpty() || athleteAge.isEmpty() || athleteSport.isEmpty()) {

                Toast.makeText(
                    this,
                    "Please Fill All Fields",
                    Toast.LENGTH_SHORT
                ).show()

            } else {

                lifecycleScope.launch {

                    db.athleteDao().insertAthlete(
                        Athlete(
                            name = athleteName,
                            age = athleteAge,
                            sport = athleteSport
                        )
                    )

                    runOnUiThread {

                        val ageValue = athleteAge.toIntOrNull() ?: 0

                        val badge = when (ageValue) {
                            in 1..10 -> "🏅 Rising Star"
                            in 11..14 -> "🥇 District Level Ready"
                            in 15..18 -> "🏆 State Level Potential"
                            else -> "⭐ National Star"
                        }

                        AlertDialog.Builder(this@AthleteActivity)
                            .setTitle("Athlete Saved Successfully")
                            .setMessage("Badge Earned:\n\n$badge")
                            .setCancelable(false)
                            .setPositiveButton("OK") { _, _ ->

                                val intent = Intent(
                                    this@AthleteActivity,
                                    MainActivity::class.java
                                )
                                startActivity(intent)
                                finish()
                            }
                            .show()
                    }
                }
            }
        }
    }
}