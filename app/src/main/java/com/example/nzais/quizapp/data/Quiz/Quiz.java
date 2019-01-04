package com.example.nzais.quizapp.data.Quiz;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "quiz_item")
public class Quiz {

    @PrimaryKey(autoGenerate = true)
    private int id;

    private String question;

    public Quiz(int id, String question) {
        this.id = id;
        this.question = question;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
}
