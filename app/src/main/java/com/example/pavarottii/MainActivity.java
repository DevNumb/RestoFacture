package com.example.pavarottii;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button btn1;
EditText  txt1;
RadioButton ra ,ra3, ra4 , ra5 , ra6;
CheckBox ck1,ck2,ck3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 =findViewById(R.id.b1);
        txt1 = findViewById(R.id.ed1);
        ra = (RadioButton) findViewById(R.id.r1);
        ra3 = findViewById(R.id.r2);
        ra4 = findViewById(R.id.r3);
        ck1 = findViewById(R.id.ch1);
        ck2 = findViewById(R.id.ch2);
        ck3 = findViewById(R.id.ch12);
        ra5 = findViewById(R.id.r4);
        ra6 = findViewById(R.id.r5);
        btn1.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i = new Intent(getApplicationContext(),MainActivity2.class);
        i.putExtra("a",txt1.getText().toString());
        int x = 0;
        if (ra.isChecked()){
            i.putExtra("w","Pizza");
            i.putExtra("b", 5000);
            x = x+ 5000;
        }else if (ra3.isChecked()){
            i.putExtra("w","Ma9loub");
            i.putExtra("b", 4000);
            x = x + 4000;
        }else if (ra4.isChecked()) {
            i.putExtra("w","kaftaji");
            i.putExtra("b",3000);
            x = x + 3000;
        }
        if (ck1.isChecked()){
            i.putExtra("e" , "frite");
            i.putExtra("c", 500);
            x = x + 500;
        }
        if (ck2.isChecked()){
            i.putExtra("d" , "Oeuf");
            i.putExtra("c", 600);
            x = x + 600;
        }
        if (ck3.isChecked()){
            i.putExtra("v" ,"formage");
            i.putExtra("c",700);
            x = x + 700;
        }
        if (ra5.isChecked()){
            i.putExtra("f" , x);
        }else if (ra6.isChecked()){
            x = (int) (x + x*0.05);
            i.putExtra("f", x);
        }

        this.startActivity(i);
    }
}