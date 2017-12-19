package com.example.magiceightball;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

/**
 * Created by allysonwilson on 9/14/17.
 */

public class AnswersTest {

    Answers answers;

    @Before
    public void before() {
        answers = new Answers();
    }

    @Test
    public void canGetAnswers() {
        assertNotNull(answers.getAnswers() );
    }

    @Test
    public void canSetUpAnswers() {
        answers.setUpAnswers();
        String indexedAnswer = answers.getAnswerByIndex(0);
        assertEquals( 2 , answers.getLength() );
    }

    @Test
    public void canGetAnswerByIndex(){

    }
    @Test
    public void canAcceptCustomAnswers(){
        ArrayList<String> customAnswers = new ArrayList<>();
        customAnswers.add("Maybeeeee?");
        customAnswers.add("Too Legit");
        customAnswers.add("Negatory");

        Answers answersWithCustomAnswers = new Answers(customAnswers);

        assertEquals(3, answersWithCustomAnswers.getLength() );
        assertEquals("Maybeeeee?" , answersWithCustomAnswers.getAnswers().get(0) ) ;
    }

    @Test
    public void canGetRandomAnswer(){
    NumberGenerating zeroGenerator;
        zeroGenerator = Mockito.mock(NumberGenerating.class);
        Mockito.when(zeroGenerator.generateNumber(Mockito.anyInt()) )
                .thenReturn(0);
        answers.setUpAnswers();

        String randomAnswer = answers.getRandomAnswer(zeroGenerator);

        assertEquals("Yes!", randomAnswer);

    }

}

