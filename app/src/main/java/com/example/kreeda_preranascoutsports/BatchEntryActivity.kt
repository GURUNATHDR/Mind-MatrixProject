package com.example.kreeda_preranascoutsports

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.room.Room
import kotlinx.coroutines.launch

class BatchEntryActivity : AppCompatActivity() {

    private var count = 0
    private val maxCount = 30

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_batch_entry)

        val name = findViewById<EditText>(R.id.etName)
        val age = findViewById<EditText>(R.id.etAge)
        val sport = findViewById<EditText>(R.id.etSport)
        val save = findViewById<Button>(R.id.btnSave)
        val status = findViewById<TextView>(R.id.tvStatus)

        val db = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java,
            "athlete_database"
        ).build()

        status.text = "Added: $count / $maxCount"

        save.setOnClickListener {

            if (count >= maxCount) {
                Toast.makeText(this, "Batch Full (30 Students)", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }

            val athleteName = name.text.toString().trim()
            val athleteAge = age.text.toString().trim()
            val athleteSport = sport.text.toString().trim()

            if (athleteName.isEmpty() || athleteAge.isEmpty() || athleteSport.isEmpty()) {
                Toast.makeText(this, "Fill All Fields", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            lifecycleScope.launch {

                db.athleteDao().insertAthlete(
                    Athlete(
                        name = athleteName,
                        age = athleteAge,
                        sport = athleteSport
                    )
                )

                count++

                runOnUiThread {

                    status.text = "Added: $count / $maxCount"

                    Toast.makeText(
                        this@BatchEntryActivity,
                        "Student Saved",
                        Toast.LENGTH_SHORT
                    ).show()

                    name.setText("")
                    age.setText("")
                    sport.setText("")
                }
            }
        }
    }
}