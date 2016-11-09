package com.lesson_three.eiko.lesson3_quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String q1, q2, q3, q4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void question1(String one){
        EditText answerForQ1 = (EditText)findViewById(R.id.q1_answer);
        String answerq1 = answerForQ1.getText().toString();
        if (answerq1.matches("Anaheim|anaheim")){
            q1 = "Corrent";
        }else {
            q1 = "Wrong";
        }
    }
        public void RadioButtonClicked(View v){
        boolean checked = ((RadioButton) v).isChecked();
        switch (v.getId()){
                case R.id.fiftyfive:
                    if(checked){
                        q2 = "Correct";
                    }
                    break;
            case R.id.sixty:
                if(checked){
                    q2 = "Wrong";
                }
                break;
            case R.id.sixtyfive:
                if(checked){
                    q2 = "Wrong";
                }
                break;
        }
    }
    public void q3checkbox(String three){
        CheckBox box1 = (CheckBox)findViewById(R.id.box1);
        CheckBox box2 = (CheckBox)findViewById(R.id.box2);
        CheckBox box3 = (CheckBox)findViewById(R.id.box3);
        if(box1.isChecked() && box2.isChecked() != box3.isChecked()){
            q3 = "Corect";
        }
        else{
            q3 = "Wrong";
        }
    }
    public void q4editText(String four){
        EditText q4edittext = (EditText)findViewById(R.id.q4answer);
        String q4string = q4edittext.getText().toString();
        int number = Integer.parseInt(q4string);
        if(number == 6){
            q4 = "Correct";
        }else {
            q4 = "Wrong";
        }
    }
    public void displayAnswer(){
        question1(q1);
        q4editText(q4);
        q3checkbox(q3);
        TextView allAnswer = (TextView)findViewById(R.id.allAnswers);
        allAnswer.setText("Q1 is "+ q1 +". Q2 is " + q2 +
                ". Q3 is "+ q3 + ". Q4 is " + q4);
    }
    public void submit(View v){
        displayAnswer();
    }
}
