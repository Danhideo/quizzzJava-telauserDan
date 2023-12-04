package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity7 extends AppCompatActivity implements View.OnClickListener{
    TextView questionTextView;

    button btnVoltar;

    button ansA;
    button ansB;

    button ansC;

    button ansD;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        questionTextView = findViewById(R.id.question);
        ansA = findViewById(R.id.ans_A);
        ansB = findViewById(R.id.ans_B);
        ansC = findViewById(R.id.ans_C);
        ansD = findViewById(R.id.ans_D);
        btnVoltar = findViewById(R.id.btnVoltar);

        int score = 0;



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
    }

    @Override
    public void onClick(View view) {
        ansA.setOnClickListener(this);
        ansB.setOnClickListener(this);
        ansC.setOnClickListener(this);
        ansD.setOnClickListener(this);
        btnVoltar.setOnClickListener(this);
    }
}