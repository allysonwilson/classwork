package com.example.mymagiceightball;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by allysonwilson on 9/14/17.
 */

public class AnswerTest {

    Answer answer;


    @Test
    public void testAnswersArrayListHasLength(){
//        arrange
       this.answerArrayList = new AnswerArrayList(String magicAnswers);
//        act


//        assert
        assertEquals( 0 , answer.answerArrayList() );
    }
}

//
//@Before
//public void before() {
//    person = new Person("Allyson", 21);
//}
//
//@Test
//public void findName(){
//    person = new Person("Allyson", 21);
//    assertEquals( "Allyson", person.getName);
//}