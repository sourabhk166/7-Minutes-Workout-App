package com.example.a7minutesworkout

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

//Todo 4 create a dao interface with insert method
@Dao
interface HistoryDao {

    @Insert
    suspend fun insert(historyEntity: HistoryEntity)

    //Todo 1: create a query to fetch the entries
    @Query("Select * from `history-table`")
    fun fetchALlDates(): Flow<List<HistoryEntity>>
}