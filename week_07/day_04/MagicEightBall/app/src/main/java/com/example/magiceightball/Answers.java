package com.example.magiceightball;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by allysonwilson on 9/14/17.
 */

public class Answers implements Answering {
    private ArrayList<String> answers;

    public Answers(){
        answers = new ArrayList<>();
    }

    public Answers(ArrayList<String> customAnswers){
        answers = new ArrayList<>(customAnswers);
    }

    public ArrayList<String> getAnswers() {
        return new ArrayList<>(answers);
    }

    public int getLength() {
        return answers.size();
    }

    public void setUpAnswers(){
        String[] answersToAdd = {
                "Yes!",
                "Nope!"
        };

        for (String answer: answersToAdd) {
            this.answers.add(answer);
        }
    }


    public String getAnswerByIndex(int index) {
        return this.answers.get(index);
    }

    @Override
    public String getRandomAnswer(NumberGenerating numberGenerator) {
       int randomIndex = numberGenerator.generateNumber(getLength() );
        String randomAnswer = getAnswerByIndex(randomIndex);
        return randomAnswer;
    }
}
