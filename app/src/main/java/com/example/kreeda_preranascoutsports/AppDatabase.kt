package com.example.kreeda_preranascoutsports

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [Athlete::class],
    version = 1,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {

    abstract fun athleteDao(): AthleteDao
}