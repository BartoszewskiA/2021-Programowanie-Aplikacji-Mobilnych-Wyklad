package com.example.w05p01_aktywnosci;

import androidx.activity.result.ActivityResult;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    static final int KOD_OPD_OKNA = 1;

    Button button02;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button02 = findViewById(R.id.button02);
        button02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intencja = new Intent(getApplicationContext(),MainActivity2.class);
                startActivity(intencja);
            }
        });
    }

    public void otwieranieNowejAktywnosci(View view) {
        Intent intencja = new Intent(this,MainActivity2.class);
        startActivity(intencja);
    }

    public void przekazywanieDanychDoAktywnosci(View view) {
        Intent intencja = new Intent(this,MainActivity3.class);
        intencja.putExtra("dana01","tekst przekazany z aktywnosci głownej");
        intencja.putExtra("dana02",101);
        startActivity(intencja);
    }

    public void odbieraniedanychZAktywnosci(View view) {
        Intent intencja = new Intent(this,MainActivity4.class);
        startActivityForResult(intencja,KOD_OPD_OKNA);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode==KOD_OPD_OKNA && resultCode== Activity.RESULT_OK)
        {
            TextView opis = findViewById(R.id.opis);
            String s = data.getStringExtra("dana01");
            opis.setText(s);
        }
    }

    public void otwieranieAdresuInternetowego(View view) {
        Uri adres = Uri.parse("http://bartoszewski.uniwersytetradom.pl");
        Intent intencja  = new Intent(Intent.ACTION_VIEW, adres);
        startActivity(intencja);
    }

    public void otwieranieAdresuGeograficznego(View view) {
        Uri adres = Uri.parse("geo:51.405,21.17");
        Intent intencja  = new Intent(Intent.ACTION_VIEW, adres);
        startActivity(intencja);
    }
}