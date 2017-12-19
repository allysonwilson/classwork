package com.example.user.magiceightball;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class AnswerActivity extends AppCompatActivity {

    TextView questionText;
    TextView answerText;
    NumberGenerating randomNumberGenerator;
    Answering answers;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);

        questionText = (TextView) findViewById(R.id.question_text);
        answerText = (TextView) findViewById(R.id.answer_text);

    }

    public void onShakeButtonClicked(View button) {
        NumberGenerating randomNumberGenerator
                = new RandomNumberGenerator();

        ArrayList<String> customAnswers = new ArrayList<>();
        customAnswers.add("Classic Harrison.");
        customAnswers.add("You've been Robb'd!");
        customAnswers.add("puts(gets.chomp())");
        customAnswers.add("No more salmon.");


        answers = new Answers(customAnswers);
        randomNumberGenerator = new RandomNumberGenerator();

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        String question = extras.getString("question");
        String answer = answers.getRandomAnswer(randomNumberGenerator);

        questionText.setText(question);
        answerText.setText(answer);
    }
}
