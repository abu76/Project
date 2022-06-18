package com.a.digitaltajbi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView countDigit;
    Button addButton, subButton, resetButton;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countDigit = findViewById(R.id.countDigit);
        addButton = findViewById(R.id.addButton);
        subButton = findViewById(R.id.subButton);
        resetButton = findViewById(R.id.resetButton);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            count++;
            countDigit.setText(""+count);
            }
        });
        subButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             count--;
             countDigit.setText(""+count);

            }
        });
        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            count =0;
            countDigit.setText(""+count);
            }
        });
    }
}