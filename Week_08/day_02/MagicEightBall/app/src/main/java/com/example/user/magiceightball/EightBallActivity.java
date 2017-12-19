package com.example.user.magiceightball;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class EightBallActivity extends AppCompatActivity {

    EditText questionEditText;
    TextView answerText;
    Button shakeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eight_ball);

        questionEditText = (EditText) findViewById(R.id.question_text) ;
        answerText = (TextView) findViewById (R.id.answer_text);
        shakeButton = (Button) findViewById(R.id.shake_button);
    }

    public void onShakeButtonClicked(View button) {
        NumberGenerating randomNumberGenerator
                = new RandomNumberGenerator();

        ArrayList<String> customAnswers = new ArrayList<>();
        customAnswers.add("Classic Harrison.");
        customAnswers.add("You've been Robb'd!");
        customAnswers.add("puts(gets.chomp())");
        customAnswers.add("No more salmon.");

        Answering answerProvider
                = new Answers(customAnswers);

        String randomAnswer = answerProvider
                .getRandomAnswer(randomNumberGenerator);

        answerText.setText(randomAnswer);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater menuInflater =  getMenuInflater();
        menuInflater.inflate(R.menu.activity_eight_ball, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int selectedItemId = item.getItemId();
        switch (selectedItemId) {
            case R.id.action_toast:
                makeToast("I am a toast", Toast.LENGTH_SHORT);
                return true;

            case R.id.action_secret:
                goToSecretActivity();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void goToSecretActivity() {
        Intent intent = new Intent(this, SecretActivity.class);
        startActivity(intent);
    }
    
    public void makeToast(String message, int length){
        Toast.makeText(this, message, length).show();
    }

}
