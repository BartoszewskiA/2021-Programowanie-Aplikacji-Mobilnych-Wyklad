package com.example.w05p04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView opis;
    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        opis = findViewById(R.id.opis);
        spinner = findViewById(R.id.spinner);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.zawartoscSpinnera));
        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i)
                {
                    case 0: opis.setText("wybrano pozycję 1"); break;
                    case 1: opis.setText("wybrano pozycję 2"); break;
                    case 2: opis.setText("wybrano pozycję 3"); break;
                    case 3: opis.setText("wybrano pozycję 4"); break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

//        spinner.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                switch (i)
//                {
//                    case 0: opis.setText("wybrano pozycję 1"); break;
//                    case 1: opis.setText("wybrano pozycję 2"); break;
//                    case 2: opis.setText("wybrano pozycję 3"); break;
//                    case 3: opis.setText("wybrano pozycję 4"); break;
//                }
//            }
//        });

    }
}