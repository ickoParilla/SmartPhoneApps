package com.example.utilityapp;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Button;
import android.widget.TextView;

import android.os.Bundle;

public class MainActivity3 extends AppCompatActivity {


    EditText Cups2;
    TextView Milliliters1;
    Button Convert1;

    double MillilitersInput;
    double MillilitersOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.Theme_UtilityApp);
        setContentView(R.layout.activity_main3);

        Milliliters1 = (TextView) findViewById(R.id.Milliliters);
        Cups2 = (EditText) findViewById(R.id.Cups1);

        Convert1 =(Button)findViewById(R.id.Convert1);

        Convert1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                MillilitersInput = Double.parseDouble(Cups2.getText().toString());
                MillilitersOutput = MillilitersInput * 237   ;
                Milliliters1.setText(String.valueOf(MillilitersOutput));

            }
        });
        GoBack1();
    }

    private void GoBack1(){
        ImageButton BackButton1 = (ImageButton) findViewById(R.id.BackButton1);
        BackButton1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                finish();
            }
        });



    }


}
