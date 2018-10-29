package com.example.hp.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class
MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17;
    EditText e;
    float m1,m2;
    boolean add,sub,mul,div;
   // String s="0";
   // int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.button2);
        b2=findViewById(R.id.button3);
        b3=findViewById(R.id.button4);
        b4=findViewById(R.id.button5);
        b5=findViewById(R.id.button6);
        b6=findViewById(R.id.button7);
        b7=findViewById(R.id.button8);
        b8=findViewById(R.id.button9);
        b9=findViewById(R.id.button10);
        b10=findViewById(R.id.button11);
        b11=findViewById(R.id.button12);
        b12=findViewById(R.id.button13);
        b13=findViewById(R.id.button14);
        b14=findViewById(R.id.button15);
        b15=findViewById(R.id.button16);
        b16=findViewById(R.id.button17);
        b17=findViewById(R.id.button18);
        e=findViewById(R.id.editText);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e.setText(e.getText()+ "9");
                e.setText(" 9");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e.setText(e.getText()+ "8");
                e.setText("8");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e.setText(e.getText()+ "7");
                e.setText("7");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (e==null){
                    e.setText("");
                }
                else {
                    m1=Float.parseFloat(e.getText() + " ");
                    add= true;
                    e.setText(" + ");
                }
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e.setText(e.getText()+ "6");
                e.setText("6");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e.setText(e.getText()+ "5");
                e.setText("5");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e.setText(e.getText()+ "4");
                e.setText("4");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m1=Float.parseFloat(e.getText() + " ");
                sub= true;
                e.setText(" - ");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e.setText(e.getText()+ "3");
                e.setText(" 3 ");
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e.setText(e.getText()+ "2");
                e.setText(" 2 ");
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e.setText(e.getText()+ "1");
                e.setText(" 1 ");
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m1=Float.parseFloat(e.getText() + " ");
                mul= true;
                e.setText(" * ");
            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e.setText(e.getText()+ ".");
                e.setText(" . ");
            }
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e.setText(e.getText()+ "0");
                e.setText(" 0 ");
            }
        });
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m2=Float.parseFloat(e.getText() + "");
                if (add==true){
                    e.setText(m1+m2+ " ");
                    add=false;
                }
                if (sub==true){
                    e.setText(m1-m2+ " ");
                    sub=false;
                }
                if (mul==true){
                    e.setText(m1*m2+ " ");
                    mul=false;
                }
                if (div==true){
                    e.setText(m1/m2+ " ");
                    div=false;
                }
            }
        });
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m1=Float.parseFloat(e.getText() + " ");
                div= true;
                e.setText(" /  ");
            }
        });
        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e.setText(" ");
            }
        });


    }
}
