package com.example.kreeda_preranascoutsports

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface AthleteDao {

    @Insert
    suspend fun insertAthlete(athlete: Athlete)

    @Query("SELECT * FROM athletes")
    suspend fun getAllAthletes(): List<Athlete>

    @Query("DELETE FROM athletes")
    suspend fun deleteAllAthletes()
}