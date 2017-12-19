package com.example.mymagiceightball;

import java.util.ArrayList;

/**
 * Created by allysonwilson on 9/14/17.
 */

public class Answer {
    public ArrayList<Answer> answersArrayList;
    public String magicAnswers;

public void Answer(String magicAnswers){
    this.answersArrayList = new ArrayList<>();
    this.magicAnswers = magicAnswers;

}

    public ArrayList<Answer> getAnswersArrayList() {
        return answersArrayList;
    }

    public String getMagicAnswers() {
        return magicAnswers;
    }
}
