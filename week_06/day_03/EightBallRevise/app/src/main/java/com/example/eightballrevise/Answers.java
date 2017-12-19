package com.example.eightballrevise;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by allysonwilson on 9/14/17.
 */

public class Answers {

    private ArrayList<String> answers;
//  in constructor above its equal to null
//    to make it equal to something must use = to assign value

    public Answers(){
        this.answers = new ArrayList<String>();
//        any parameter/characteristic of object passed into parenthesis will need to be specified for each object
    }

//    Above is constructor where it is instantiated must be told again type

    public int numberOfAnswers(){
        return answers.size();
    }

    public void addAnswer( String answer){
        answers.add( answer );
    }

    public String getFirstAnswer(){
        return this.answers.get(0);
    }

    public String getRandomAnswer(){
        Random random = new Random();
        int randomIndex = random.nextInt(answers.size());
        return this.answers.get(randomIndex);
    }
}
