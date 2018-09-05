package optick.elisoft.com.newconoptik.data.database

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.mindorks.framework.mvp.data.database.repository.questions.Question
import com.mindorks.framework.mvp.data.database.repository.questions.QuestionsDao

@Database(entities = [
    (Question::class)
], version = 1)
abstract class AppDatabase: RoomDatabase(){
    abstract fun questionsDao(): QuestionsDao
}