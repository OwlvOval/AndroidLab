package com.example.myapplication;

import android.app.Activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;


public class HelloActivity extends Activity {

    int count = 0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helloact);

        TextView score = findViewById(R.id.score);

        Button b1 = findViewById(R.id.button);
        Button b2 = findViewById(R.id.button2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                score.setText(String.valueOf(count));
                double a = Math.random()*1000;
              //  String thirdResult = String.format("%.3f",a);
                double b = (Math.random()*1000);
            //    System.out.println(thirdResult);
             //   String thirdResult1 = String.format("%.3f",b);
                findViewById(R.id.button).setX((float) a);
                findViewById(R.id.button).setY((float) b);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count--;
                score.setText(String.valueOf(count));
            }
        });
    }
}

