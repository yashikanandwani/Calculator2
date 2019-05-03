package com.example.nikhi.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button bt;
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt = (Button) findViewById(R.id.button);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pagetwo = new Intent(MainActivity.this , secAct.class);
                startActivity(pagetwo);
            }
        });

        txt = (TextView) findViewById(R.id.textView);
        Animation a = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.animation);
        txt.setAnimation(a);
    }
}
