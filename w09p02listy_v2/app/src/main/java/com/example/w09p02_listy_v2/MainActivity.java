package com.example.w09p02_listy_v2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView01;
    String[] zawartoscListy = new String[] {
            "Pozycja 01", "Pozycja 02","Pozycja 03","Pozycja 04","Pozycja 05","Pozycja 06"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView01 = findViewById(R.id.listView01);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.lista_wlasna,zawartoscListy);
        listView01.setAdapter(adapter);
        listView01.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), "Kliknięto: "+i, Toast.LENGTH_SHORT).show();
            }
        });
    }
}