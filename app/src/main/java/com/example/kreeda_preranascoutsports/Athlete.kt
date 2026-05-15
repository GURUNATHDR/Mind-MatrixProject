package com.example.kreeda_preranascoutsports

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "athletes")
data class Athlete(

    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,

    val name: String,
    val age: String,
    val sport: String,
    val score: Float = 0.0f
)