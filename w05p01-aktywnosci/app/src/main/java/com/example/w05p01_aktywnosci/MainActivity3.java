package com.example.w05p01_aktywnosci;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    TextView wynik;
    String s;
    int x;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        wynik = findViewById(R.id.textView_01_act3);

        Bundle paczka = getIntent().getExtras();
        s = paczka.getString("dana01");
        x = paczka.getInt("dana02");

        wynik.setText(s + " " + x);
    }
}