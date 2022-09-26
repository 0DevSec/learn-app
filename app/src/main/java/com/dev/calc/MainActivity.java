package com.dev.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    TextView result;
    EditText number1 , number2;
    Button sum , devide ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1 = findViewById(R.id.Number1);
        number2 = findViewById(R.id.Number2);
        result = findViewById(R.id.myresult);
        sum = findViewById(R.id.buttonsum);
        devide = findViewById(R.id.buttondevide);
        }




    public void onClicksum (View view){

        double num1 = Double.valueOf(String.valueOf(number1.getText().toString()));
        double num2 = Double.valueOf(String.valueOf(number2.getText().toString()));


        result.setText( "Result:"+ "   " +(num1 + num2) );

    }



    public void onClicksd (View view){

        double num1 = Double.valueOf(String.valueOf(number1.getText().toString()));
        double num2 = Double.valueOf(String.valueOf(number2.getText().toString()));


        result.setText( "Result:"+ "   " +(num1 * num2) );

    }

}