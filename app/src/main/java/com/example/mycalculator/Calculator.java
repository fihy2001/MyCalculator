package com.example.mycalculator;

import android.app.Activity;
import android.app.VoiceInteractor;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;

public class Calculator extends Activity implements View.OnClickListener {

    TextView txtCalculations, txtResults;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        txtCalculations = findViewById(R.id.txtCalculations);
        txtResults = findViewById(R.id.txtResults);

        findViewById(R.id.btnEqual).setOnClickListener(Calculator.this);
        findViewById(R.id.btn0).setOnClickListener(Calculator.this);
        findViewById(R.id.btn1).setOnClickListener(Calculator.this);
        findViewById(R.id.btn2).setOnClickListener(Calculator.this);
        findViewById(R.id.btn3).setOnClickListener(Calculator.this);
        findViewById(R.id.btn4).setOnClickListener(Calculator.this);
        findViewById(R.id.btn5).setOnClickListener(Calculator.this);
        findViewById(R.id.btn6).setOnClickListener(Calculator.this);
        findViewById(R.id.btn7).setOnClickListener(Calculator.this);
        findViewById(R.id.btn8).setOnClickListener(Calculator.this);
        findViewById(R.id.btn9).setOnClickListener(Calculator.this);
        findViewById(R.id.btnClear).setOnClickListener(Calculator.this);
        findViewById(R.id.btnSubtract).setOnClickListener(Calculator.this);
        findViewById(R.id.btnMultiply).setOnClickListener(Calculator.this);
        findViewById(R.id.btnDivide).setOnClickListener(Calculator.this);
        findViewById(R.id.btnPlus).setOnClickListener(Calculator.this);


    }

    @Override
    public void onClick(View view) {

        switch(view.getId()){
            case R.id.btnEqual:
                break;

            case R.id.btn0:
                break;

            case R.id.btn1:
                break;

            case R.id.btn2:
                break;

            case R.id.btn3:
                break;

            case R.id.btn4:
                break;

            case R.id.btn5:
                break;

            case R.id.btn6:
                break;

            case R.id.btn7:
                break;

            case R.id.btn8:
                break;

            case R.id.btn9:
                break;

            case R.id.btnClear:
                break;

            case R.id.btnPlus:
                break;

            case R.id.btnSubtract:
                break;

            case R.id.btnMultiply:
                break;

            case R.id.btnDivide:
                break;

        }

    }
}