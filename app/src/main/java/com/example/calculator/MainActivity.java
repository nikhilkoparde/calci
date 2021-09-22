package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0;
    Button btnAdd,btnSub,btnMul,btnEqual,btnDot,btnDiv,btnClear;
    EditText display,display1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);
        btn3=(Button)findViewById(R.id.btn3);
        btn4=(Button)findViewById(R.id.btn4);
        btn5=(Button)findViewById(R.id.btn5);
        btn6=(Button)findViewById(R.id.btn6);
        btn7=(Button)findViewById(R.id.btn7);
        btn8=(Button)findViewById(R.id.btn8);
        btn9=(Button)findViewById(R.id.btn9);
        btn0=(Button)findViewById(R.id.btn0);

        btnAdd=(Button)findViewById(R.id.btnAdd);
        btnSub=(Button)findViewById(R.id.btnSub);
        btnMul=(Button)findViewById(R.id.btnMul);
        btnEqual=(Button)findViewById(R.id.btnEqual);
        btnDot=(Button)findViewById(R.id.btnDot);
        btnDiv=(Button)findViewById(R.id.btnDiv);
        btnClear=(Button)findViewById(R.id.btnClear);

        display=(EditText)findViewById(R.id.display);
        display1=(EditText)findViewById(R.id.display1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              display.append("1");
            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.append("2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.append("3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.append("4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.append("5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.append("6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.append("7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.append("8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.append("9");
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.append("0");
            }
        });

        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.append(".");
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.append("+");
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.append("-");
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.append("X");
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.append("/");
            }
        });

       btnClear.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               display.setText("");
           }
       });

       btnEqual.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               String data=display.getText().toString();

               if(data.contains("-")){
                   String operands[] = data.split("-");
                       Double op1=Double.parseDouble(operands[0]);  //to convert string to double
                       Double op2=Double.parseDouble(operands[1]);
                       Double res=op1-op2;
                       display1.setText(String.valueOf(res));

                   }


               if(data.contains("/")){
                   String operands[] = data.split("/");
                   Double op1=Double.parseDouble(operands[0]);  //to convert string to double
                   Double op2=Double.parseDouble(operands[1]);
                   Double res=op1/op2;
                   display1.setText(String.valueOf(res));

               }


               if(data.contains("X")){
                   String operands[] = data.split("X");
                   Double op1=Double.parseDouble(operands[0]);  //to convert string to double
                   Double op2=Double.parseDouble(operands[1]);
                   Double res=op1*op2;
                   display1.setText(String.valueOf(res));

               }


               if(data.contains("+")){
                   String operands[] = data.split(Pattern.quote("+"));
                   Double op1=Double.parseDouble(operands[0]);  //to convert string to double
                   Double op2=Double.parseDouble(operands[1]);
                   Double res=op1+op2;
                   display1.setText(String.valueOf(res));

               }

           }
       });
    }
}