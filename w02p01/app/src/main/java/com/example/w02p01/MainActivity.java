package com.example.w02p01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void zdarzenieKlikniecia(View view) {
        TextView napis;
        napis = findViewById(R.id.textView01);
        napis.setText("Kliknięto przycisk");
    }


    public void zdarzenieKliknieciaNaNapis(View view) {
        Button przycisk;
        przycisk = findViewById(R.id.button01);
        przycisk.setText("Kliknięto napis");
    }
}