package com.example.assessment_1_nan_calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.OutcomeReceiver;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {



    TextView CelsiusOutput, FahrenheitOutput;
    EditText FahrenheitInput, CelsiusInput;
    Button Output;

    double CelsiusOutputNum, FahrenheitOutputNum;
    double FahrenheitInputNum, CelsiusInputNum;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.Theme_Assessment_1NaN_Calculator);
        setContentView(R.layout.activity_main);


        CelsiusOutput = (TextView) findViewById(R.id.CelsiusResult);
        FahrenheitOutput = (TextView) findViewById(R.id.FahrenheitResult);

        FahrenheitInput = (EditText) findViewById(R.id.FahrenheitInput);
        CelsiusInput = (EditText) findViewById(R.id.CelsiusInput);

        Output = (Button) findViewById(R.id.button);

        Output.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    FahrenheitInputNum = Double.parseDouble(FahrenheitInput.getText().toString());
                    CelsiusOutputNum = (FahrenheitInputNum - 32) * 5/9;
                    CelsiusOutput.setText(String.valueOf(CelsiusOutputNum));

                    CelsiusInputNum = Double.parseDouble(CelsiusInput.getText().toString());
                    FahrenheitOutputNum = (CelsiusInputNum * 9/5) + 32;
                    FahrenheitOutput.setText(String.valueOf(FahrenheitOutputNum));

            }
        });

    }



}