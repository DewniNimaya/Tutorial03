package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    private Button buttonOk;
    private EditText editText1;
    private EditText editText2;
    private String num1;
    private String num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);


        buttonOk = (Button) findViewById(R.id.btnOk);
        editText1 = (EditText) findViewById(R.id.editTextNo1);
        editText2 = (EditText) findViewById(R.id.editTextNum2);

        buttonOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

              num1=editText1.getText().toString();
                num2=editText2.getText().toString();

              Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
               intent.putExtra("number1",num1);
               intent.putExtra("number2",num2);

                startActivity(intent);
              Toast.makeText(getApplicationContext(), "Sending message", Toast.LENGTH_SHORT).show();

            }
        });


    }
}