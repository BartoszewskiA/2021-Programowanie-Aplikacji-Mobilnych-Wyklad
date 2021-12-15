package com.example.w09p03_menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView01;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView01 = findViewById(R.id.textView01);
        registerForContextMenu(textView01);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_glowne,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
       getMenuInflater().inflate(R.menu.menu_kontekstowe,menu);
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int Id = item.getItemId();
        switch (Id)
        {
            case R.id.pozycja01: textView01.setText("Wybrano pozycję 01"); break; //return true;
            case R.id.pozycja02: textView01.setText("Wybrano pozycję 02"); break;
            case R.id.pozycja03: textView01.setText("Wybrano pozycję 03"); break;
            case R.id.pozycja04: textView01.setText("Wybrano pozycję 04"); break;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        int Id = item.getItemId();
        switch (Id)
        {
            case R.id.mk_pozycja01: textView01.setText("Wybrano menu kontekstowe pozycję 01"); break; //return true;
            case R.id.mk_pozycja02: textView01.setText("Wybrano menu kontekstowe pozycję 02"); break;
            case R.id.mk_pozycja03: textView01.setText("Wybrano menu kontekstowe pozycję 03"); break;
        }
        return super.onContextItemSelected(item);
    }
}