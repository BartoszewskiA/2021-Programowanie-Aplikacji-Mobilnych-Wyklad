package com.example.w05p03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView licznik;
    RatingBar rating;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        licznik = findViewById(R.id.licznik);
        rating = findViewById(R.id.rating);

        licznik.setText("oceniłes program na "+String.valueOf(rating.getRating()) + " gwiazdek");

        rating.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                licznik.setText("oceniłes program na "+String.valueOf(v) + " gwiazdek");
            }
        });
    }
}