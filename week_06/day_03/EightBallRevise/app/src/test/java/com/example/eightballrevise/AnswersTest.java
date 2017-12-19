package com.example.eightballrevise;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

/**
 * Created by allysonwilson on 9/14/17.
 */

public class AnswersTest {
//
//    Answers answers;
//
////    this gives the @Before data type
//
//    @Before
//    public void before(){
//        answers = new Answers();
//    }
//    this runs before all tests

    @Test
    public void startsWithNoAnswers(){
        Answers answers = new Answers();
//        if using the class declaration and @Before don't need above line
        assertEquals(0, answers.numberOfAnswers() );
    }

    @Test
    public void can_add_answers(){
//        Arrange
        Answers answers = new Answers();
//        Act
        answers.addAnswer("Yes!");
//        Assert
        assertEquals(1 , answers.numberOfAnswers() );
    }

    @Test
    public void can_get_first_answers(){
        Answers answers = new Answers();
        answers.addAnswer("Yes!");
        String answer = answers.getFirstAnswer();
        assertEquals("Yes!", answer);
    }
    @Test
    public void get_random_answer(){
        Answers answers = new Answers();
        answers.addAnswer("Yes!");
        answers.addAnswer("No!");
        String answer = answers.getRandomAnswer();
        assertNotNull(answer);
        assertEquals("Yes!", answer);
    }
}
