package com.example.w04p02_kontrolki_cz1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView opis;
    Button sprawdz;
    RadioButton opcja1, opcja2, opcja3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        opis = findViewById(R.id.opis);
        opcja1 = findViewById(R.id.radioButton01);
        opcja2 = findViewById(R.id.radioButton02);
        opcja3 = findViewById(R.id.radioButton03);
        sprawdz = findViewById(R.id.sprwdz);

        if (opcja1.isChecked()) opis.setText("Wybrano opcję 1");
        else if (opcja2.isChecked()) opis.setText("Wybrano opcję 2");
        else opis.setText("Wybrano opcję 3");

        sprawdz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (opcja1.isChecked()) opis.setText("1");
                else if (opcja2.isChecked()) opis.setText("2");
                else opis.setText("3");
            }
        });

        opcja1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                opis.setText("Wybrano opcję pierwsza");
            }
        });
        opcja2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                opis.setText("Wybrano opcję druga");
            }
        });
        opcja3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                opis.setText("Wybrano opcję trzecia");
            }
        });

    }

    public void wyborOpcji(View view) {
//        int Id = view.getId();
//        switch (Id)
//        {
//            case R.id.radioButton01: opis.setText("Wybrano opcję 1"); break;
//            case R.id.radioButton02: opis.setText("Wybrano opcję 2"); break;
//            case R.id.radioButton03: opis.setText("Wybrano opcję 3"); break;
//        }
    }
}