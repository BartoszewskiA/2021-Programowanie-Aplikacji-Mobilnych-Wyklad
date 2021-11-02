package com.example.w04p01_sluchacz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView opis;
    Button przycisk01, przycisk02, przycisk03;
    int ile =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        opis = findViewById(R.id.opis);
        przycisk01 = findViewById(R.id.przycisk_01);
        przycisk02 = findViewById(R.id.przycisk_02);
        przycisk03 = findViewById(R.id.przycisk_03);

        View.OnClickListener sluchacz01 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int Id = view.getId();
                switch (Id)
                {
                    case R.id.przycisk_01: ile++; break;
//                    case R.id.przycisk_02: ile =0 ; break;
                    case R.id.przycisk_03: ile--; break;
                }
                opis.setText(String.valueOf(ile));
            }
        };
        przycisk01.setOnClickListener(sluchacz01);
        przycisk02.setOnClickListener(sluchacz01);
        przycisk03.setOnClickListener(sluchacz01);

        View.OnLongClickListener sluchacz02 = new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                int Id = view.getId();
                switch(Id)
                {
                    case R.id.przycisk_01: ile+=100; break;
                    case R.id.przycisk_02: ile =0 ; break;
                    case R.id.przycisk_03: ile-=100; break;
                }
                opis.setText(String.valueOf(ile));
                return false;
            }
        };
        przycisk01.setOnLongClickListener(sluchacz02);
        przycisk02.setOnLongClickListener(sluchacz02);
        przycisk03.setOnLongClickListener(sluchacz02);


//        przycisk01.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                ile++;
//                opis.setText("kliknięto: "+String.valueOf(ile)+" razy");
//            }
//        });

    }
}