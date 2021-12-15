package com.example.w05p01_aktywnosci;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }

    public void wyslijOdpowiedz(View view) {
        EditText odp = findViewById(R.id.odpowiedz);
        String s = odp.getText().toString();
        Intent wynik = new Intent();
        wynik.putExtra("dana01", s);
        setResult(RESULT_OK, wynik);
        finish();
    }
}