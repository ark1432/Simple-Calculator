package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button1, button2, button3, button4;
    EditText editText1, editText2;

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1=findViewById(R.id.etinput1);
        editText2=findViewById(R.id.etinput2);
        textView=findViewById(R.id.tvresult);
        button1=findViewById(R.id.add);
        button2=findViewById(R.id.sub);
        button3=findViewById(R.id.mul);
        button4=findViewById(R.id.div);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n1 = Double.parseDouble(editText1.getText().toString());
                double n2 = Double.parseDouble(editText2.getText().toString());
                double result = n1 + n2;
                textView.setText(String.valueOf(result));
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n1 = Double.parseDouble(editText1.getText().toString());
                double n2 = Double.parseDouble(editText2.getText().toString());
                double result = n1 - n2;
                textView.setText(String.valueOf(result));
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n1 = Double.parseDouble(editText1.getText().toString());
                double n2 = Double.parseDouble(editText2.getText().toString());
                double result = n1 * n2;
                textView.setText(String.valueOf(result));
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n1 = Double.parseDouble(editText1.getText().toString());
                double n2 = Double.parseDouble(editText2.getText().toString());
                double result = n1 / n2;
                textView.setText(String.valueOf(result));
            }
        });



    }
}