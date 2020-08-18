package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    private EditText showText1;
    private EditText showText2;
    private Button plusButton;
    private Button substractButton;
    private Button multiplyButton;
    private Button divisionButton;
    private TextView answer;

    private String no1;
    private String no2;

    private double num1;
    private double num2;
    private double result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        plusButton = (Button) findViewById(R.id.btnPlus);
        substractButton = (Button) findViewById(R.id.btnSubstract);
        multiplyButton = (Button) findViewById(R.id.btnMultiply);
        divisionButton = (Button) findViewById(R.id.btnDivision);
        showText1 = (EditText) findViewById(R.id.editTextNo1);
        showText2 = (EditText) findViewById(R.id.editTextNo2);
        answer=(TextView) findViewById(R.id.textViewAns);

        no1 = getIntent().getExtras().get("number1").toString();
        no2 = getIntent().getExtras().get("number2").toString();


        showText1.setText(no1);
        showText2.setText(no2);

        num1 = Double.parseDouble(no1);
        num2 = Double.parseDouble(no2);



        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                result=num1+num2;

               answer.setText(num1+"+"+num2+"="+result);



            }

         });
        substractButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                result=num1-num2;

                answer.setText(num1+"-"+num2+"="+result);



            }

        });
        multiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                result=num1*num2;

                answer.setText(num1+"*"+num2+"="+result);



            }

        });
        divisionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                result=num1/num2;

                answer.setText(num1+"/"+num2+"="+result);



            }

        });

     }

}

