package com.uc3m.discography.model

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface UserDAO {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addUser(user: User)
    @Query("SELECT * FROM user_table ORDER BY id ASC")
    fun readAll(): LiveData<List<User>>
}