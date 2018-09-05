package com.mindorks.framework.mvp.data.database.repository.questions

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy
import android.arch.persistence.room.Query

@Dao
interface QuestionsDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(question: List<Question>)

    @Query("SELECT * FROM questions")
    fun loadAll(): List<Question>
}