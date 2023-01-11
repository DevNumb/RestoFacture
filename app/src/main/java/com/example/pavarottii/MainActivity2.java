package com.example.pavarottii;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
TextView t1,t2,t3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent a = getIntent();
        t1 = findViewById(R.id.txt1);
        t2 = findViewById(R.id.txt2);
        t3 = findViewById(R.id.txt3);
        t1.setText(a.getStringExtra("a"));
        String ch = a.getStringExtra("w");
        if (a.getStringExtra("e")!=null){
            ch = ch +"+"+ a.getStringExtra("e");
        }
        if (a.getStringExtra("d")!=null){
            ch = ch +"+"+  a.getStringExtra("d");
        }

        if (a.getStringExtra("v")!=null){
            ch = ch + a.getStringExtra("v");
        }

        t2.setText(ch);
        t3.setText(String.valueOf (a.getIntExtra("f" , Integer.parseInt("0"))));



    }
}