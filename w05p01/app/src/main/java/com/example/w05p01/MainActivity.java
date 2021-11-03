package com.example.w05p01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView opis;
    Button przycisk;
    CheckBox zgoda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        opis = findViewById(R.id.opis);
        przycisk = findViewById(R.id.przycisk);
        zgoda = findViewById(R.id.zgoda);
        przycisk.setEnabled(false);

        zgoda.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) przycisk.setEnabled(true);
                else przycisk.setEnabled(false);
            }
        });


        przycisk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                if (zgoda.isChecked())
                opis.setText("OK");
//                else {
//                    //Context context = getApplicationContext();
//                    Toast.makeText(getApplicationContext(), "Kliknji zgodę", Toast.LENGTH_SHORT).show();
//                }
            }
        });
    }
}