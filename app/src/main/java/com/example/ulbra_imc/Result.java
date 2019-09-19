package com.example.ulbra_imc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

import java.util.Locale;

public class Result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Bundle b = getIntent().getExtras();
        Double height = b.getDouble("height", 0);
        Double weight = b.getDouble("weight", 0);
        Double r = (weight / (height * height) * 10000);

        String result = "";
        result = result.format(Locale.getDefault(), "Your BMI is: %.2f", r);

        EditText result_view = findViewById(R.id.editTextResult);
        result_view.setText(result);
    }
}