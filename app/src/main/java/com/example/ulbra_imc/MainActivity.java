package com.example.ulbra_imc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText pt_height = (EditText) findViewById(R.id.editTextHeight);
        final EditText pt_weight = (EditText) findViewById(R.id.editTextWeight);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(pt_height.getText().length()==0){
                    pt_height.setError("Enter a value");
                } else if(pt_weight.getText().length() == 0){
                    pt_weight.setError("Enter a value");
                } else {
                    Double height = Double.valueOf(pt_height.getText().toString());
                    Double weight = Double.valueOf(pt_weight.getText().toString());
                    Intent intent = new Intent(getBaseContext(), Result.class);
                    Bundle b = new Bundle();

                    b.putDouble("height", height);
                    b.putDouble("weight", weight);
                    intent.putExtras(b);
                    startActivity(intent);
                }
            }
        });
    }

}
