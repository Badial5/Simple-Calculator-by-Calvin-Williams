package com.codecademy.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    // These are my buttons on the interface
        final EditText firstNumber = findViewById(R.id.number1);
        final EditText secondtNumber = findViewById(R.id.number2);

        final RadioGroup operators = findViewById(R.id.operators);
        final RadioButton add = findViewById(R.id.add);
        final RadioButton subtract = findViewById(R.id.subtract);
        final RadioButton multiplication = findViewById(R.id.multiplication);
        final RadioButton division = findViewById(R.id.division);
        final Button equals = findViewById(R.id.equal);

        final TextView results = findViewById(R.id.results);

        //Now I am going to add some functionality to them.

        equals.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v){
                final double firstNumberValue = Double.parseDouble(firstNumber.getText().toString());
                final double secondNumberValue = Double.parseDouble(secondtNumber.getText().toString());

                //Checking which radio button is checked
                final int operatorButtonId = operators.getCheckedRadioButtonId();

                Double answer = 0.0;

                if (operatorButtonId == add.getId()){
                    answer = firstNumberValue + secondNumberValue;

                } else if (operatorButtonId == subtract.getId()) {
                    answer = firstNumberValue - secondNumberValue;

                } else if (operatorButtonId == division.getId()) {

                    answer = (firstNumberValue / secondNumberValue);

                } else if (operatorButtonId == multiplication.getId()) {

                    answer = firstNumberValue * secondNumberValue;
                }

                results.setText(answer.toString());
            }
        } );




    }
}