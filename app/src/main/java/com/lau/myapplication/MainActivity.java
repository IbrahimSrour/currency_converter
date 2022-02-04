package com.lau.myapplication;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText usd;
    private EditText lbp;
    private Button convert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usd = findViewById(R.id.etUsd);
        lbp = findViewById(R.id.etLbp);
        convert = findViewById(R.id.btnConvert);
        convert.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (usd.getText().toString().equalsIgnoreCase("")){
                    int lbp1 = Integer.parseInt(lbp.getText().toString());
                    int answer = (lbp1 / 25000);
                    usd.setText(String.valueOf(answer));
                }
                if (lbp.getText().toString().equalsIgnoreCase("")){

                    int usd1 = Integer.parseInt(usd.getText().toString());
                    int answer = (usd1 * 25000);
                    lbp.setText(String.valueOf(answer));
            }
        }
    })
    ;}
}