package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button =findViewById(R.id.button1);
        textView =findViewById(R.id.textView3);
        textView=findViewById(R.id.textView);
        editText=findViewById(R.id.editTextNumber);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "wel come", Toast.LENGTH_SHORT).show();
               String s= editText.getText().toString();
               int cel=Integer.parseInt(s);
               double far=(cel*1.8)+32;
               textView.setText("the corresponding value in Fahrenheit"+ far);

            }
        });

    }
}