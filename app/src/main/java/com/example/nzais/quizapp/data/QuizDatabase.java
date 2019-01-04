package com.example.nzais.quizapp.data;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import com.example.nzais.quizapp.Constant;
import com.example.nzais.quizapp.data.Account.User;
import com.example.nzais.quizapp.data.Account.UserDao;
import com.example.nzais.quizapp.data.Quiz.Quiz;
import com.example.nzais.quizapp.data.Quiz.QuizDao;

@Database(entities = {User.class, Quiz.class}, exportSchema = false, version = 1)
public abstract class QuizDatabase extends RoomDatabase {

    public abstract UserDao userDao();
    public abstract QuizDao quizDao();

    private static volatile QuizDatabase INSTANCE;

    public static QuizDatabase getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (QuizDatabase.class) {
                if (INSTANCE == null) {
                    // Create database here
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            QuizDatabase.class, Constant.DATABASE_NAME)
                            .build();
                }
            }
        }
        return INSTANCE;
    }




}
