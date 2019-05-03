package com.example.nikhi.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class secAct extends AppCompatActivity {

    ArrayList<String> ops = new ArrayList<String>();


    TextView txt;
    Button but7,but8,but9,but4,but5,but6,but1,but2,but3,AC, but0 , butplus , buteq , butmin ;
    Button butmul , butdiv, butpnt;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec);


        txt = (TextView) findViewById(R.id.txt1);
        txt.setText(String.valueOf(0));

        but7 = (Button) findViewById(R.id.button2);
        but7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int b = Integer.parseInt(String.valueOf(txt.getText()));
                b = b * 10 + 7;
                txt.setText(String.valueOf(b));
            }
        });

        but8 = (Button) findViewById(R.id.button3);
        but8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int b = Integer.parseInt(String.valueOf(txt.getText()));
                b = b * 10 + 8;
                txt.setText(String.valueOf(b));
            }
        });

        but9 = (Button) findViewById(R.id.button4);
        but9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int b = Integer.parseInt(String.valueOf(txt.getText()));
                b = b * 10 + 9;
                txt.setText(String.valueOf(b));
            }
        });

        but4 = (Button) findViewById(R.id.button5);
        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int b = Integer.parseInt(String.valueOf(txt.getText()));
                b = b * 10 + 4;
                txt.setText(String.valueOf(b));
            }
        });

        but5 = (Button) findViewById(R.id.button6);
        but5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int b = Integer.parseInt(String.valueOf(txt.getText()));
                b = b * 10 + 5;
                txt.setText(String.valueOf(b));
            }
        });

        but6 = (Button) findViewById(R.id.button7);
        but6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int b = Integer.parseInt(String.valueOf(txt.getText()));
                b = b * 10 + 6;
                txt.setText(String.valueOf(b));
            }
        });

        but1 = (Button) findViewById(R.id.button8);
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int b = Integer.parseInt(String.valueOf(txt.getText()));
                b = b * 10 + 1;
                txt.setText(String.valueOf(b));
            }
        });

        but2 = (Button) findViewById(R.id.button9);
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int b = Integer.parseInt(String.valueOf(txt.getText()));
                b = b * 10 + 2;
                txt.setText(String.valueOf(b));
            }
        });

        but3 = (Button) findViewById(R.id.button10);
        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int b = Integer.parseInt(String.valueOf(txt.getText()));
                b = b * 10 + 3;
                txt.setText(String.valueOf(b));
            }
        });

        AC = (Button) findViewById(R.id.button13);
        AC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText(String.valueOf(0));
                ops.clear();
            }
        });

        but0 = (Button) findViewById(R.id.button11);
        but0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int b = Integer.parseInt(String.valueOf(txt.getText()));
                b = b * 10 + 0;
                txt.setText(String.valueOf(b));
            }
        });


        butplus = (Button) findViewById(R.id.button14);
        butplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ops.add(String.valueOf(txt.getText()));
                ops.add("+");
                txt.setText(String.valueOf(0));
            }
        });

        butmin = (Button) findViewById(R.id.button15);
        butmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ops.add(String.valueOf(txt.getText()));
                ops.add("-");
                txt.setText(String.valueOf(0));
            }
        });

        butmul = (Button) findViewById(R.id.button16);
        butmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ops.add(String.valueOf(txt.getText()));
                ops.add("*");
                txt.setText(String.valueOf(0));
            }
        });

        butdiv = (Button) findViewById(R.id.button17);
        butdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ops.add(String.valueOf(txt.getText()));
                ops.add("/");
                txt.setText(String.valueOf(0));
            }
        });

        buteq = (Button) findViewById(R.id.button12);
        buteq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ops.add(String.valueOf(txt.getText()));


                while(ops.size() != 1)
                {
                    for(int i = 0 ; i<ops.size() ; i++){
                        if(ops.get(i) == "/"){
                            double local;
                            local = Double.parseDouble(ops.get(i-1)) / Double.parseDouble(ops.get(i+1));
                            ops.set(i+1 , String.valueOf(local));
                            ops.remove(i-1);
                            ops.remove(i-1);


                        }
                        else if(ops.get(i) == "*"){
                            try {
                                int local;
                                local = Integer.parseInt(ops.get(i-1)) * Integer.parseInt(ops.get(i+1));
                                ops.set(i+1 , String.valueOf(local));
                            }
                            catch (Throwable t) {
                                double local;
                                local = Double.parseDouble(ops.get(i-1)) * Double.parseDouble(ops.get(i+1));
                                ops.set(i+1 , String.valueOf(local));
                            }
                            ops.remove(i-1);
                            ops.remove(i-1);
                        }
                        else if(ops.get(i) == "-"){
                            try {
                                int local;
                                local = Integer.parseInt(ops.get(i-1)) - Integer.parseInt(ops.get(i+1));
                                ops.set(i+1 , String.valueOf(local));
                            }
                            catch (Throwable t) {
                                double local;
                                local = Double.parseDouble(ops.get(i-1)) - Double.parseDouble(ops.get(i+1));
                                ops.set(i+1 , String.valueOf(local));
                            }
                            ops.remove(i-1);
                            ops.remove(i-1);
                        }
                        else if(ops.get(i) == "+"){
                            try {
                                int local;
                                local = Integer.parseInt(ops.get(i-1)) + Integer.parseInt(ops.get(i+1));
                                ops.set(i+1 , String.valueOf(local));
                            }
                            catch (Throwable t) {
                                double local;
                                local = Double.parseDouble(ops.get(i-1)) + Double.parseDouble(ops.get(i+1));
                                ops.set(i+1 , String.valueOf(local));
                            }

                            ops.remove(i-1);
                            ops.remove(i-1);
                        }

                    }
                }
                    txt.setText(ops.get(0));
                    ops.clear();
            }
        });

    }
}
