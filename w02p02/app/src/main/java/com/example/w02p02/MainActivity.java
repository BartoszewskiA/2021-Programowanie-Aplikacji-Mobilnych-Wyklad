package com.example.w02p02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText liczbaX, liczbaY, wynik;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        liczbaX = findViewById(R.id.editText01);
        liczbaY = findViewById(R.id.editText02);
        wynik = findViewById(R.id.editText03);
    }

    public void wylicz(View view) {

        int x=0,y=0;
        String text = liczbaX.getText().toString();
        if (text.length()>0)
            x = Integer.parseInt(text);
        else
        {
            x =0;
            liczbaX.setText("0");
        }
        text = liczbaY.getText().toString();
        if (text.length()>0)
            y = Integer.parseInt(text);
        else
        {
            y =0;
            liczbaY.setText("0");
        }


        // int y = Integer.parseInt(liczbaY.getText().toString());
        int w = x+y;
        wynik.setText(String.valueOf(w));
    }
}