package com.example.utilityapp;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setTheme(R.style.Theme_UtilityApp);
        setContentView(R.layout.activity_main);

        Page1();
        Page2();
    }

    private void Page1(){
        Button cupsToGramsButton = (Button) findViewById(R.id.cupsToGrams);
        cupsToGramsButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, MainActivity2.class));


            }
        });
    }

    private void Page2(){
        Button cupsToMilliliter = (Button) findViewById(R.id.cupsToMilliliter);
        cupsToMilliliter.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, MainActivity3.class));


            }
        });
    }
}