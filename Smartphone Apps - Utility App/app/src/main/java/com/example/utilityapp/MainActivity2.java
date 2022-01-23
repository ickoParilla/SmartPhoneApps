package com.example.utilityapp;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    EditText Cups1;
    TextView Grams1;
    Button Convert;

    double GramInput;
    double GramOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.Theme_UtilityApp);
        setContentView(R.layout.activity_main2);

        Grams1 = (TextView) findViewById(R.id.Grams);
        Cups1 = (EditText) findViewById(R.id.Cups);

        Convert =(Button)findViewById(R.id.Convert);

        Convert.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                GramInput = Double.parseDouble(Cups1.getText().toString());
                GramOutput = GramInput * 128 ;
                Grams1.setText(String.valueOf(GramOutput));

            }
        });
        GoBack();
    }


    private void GoBack(){
        ImageButton backButton = (ImageButton) findViewById(R.id.BackButton);
        backButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                finish();
            }
        });



    }

}