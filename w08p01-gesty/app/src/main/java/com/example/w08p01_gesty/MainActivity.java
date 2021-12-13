package com.example.w08p01_gesty;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener {

    GestureDetector detektorGestow;
    TextView test;
    Button clear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        test = findViewById(R.id.test);
        clear = findViewById(R.id.clear);
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                test.setText("Wykonano:");
            }
        });
        detektorGestow = new GestureDetector(this, this);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        detektorGestow.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        //test.setText(test.getText().toString()+"\n"+"onDown");
        return false;
    }

    @Override
    public void onShowPress(MotionEvent motionEvent) {
        //test.setText(test.getText().toString()+"\n"+"onShowPress"+"\n"+
          //      motionEvent.getX()+ ":" + motionEvent.getY());
    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        //test.setText(test.getText().toString()+"\n"+"onSingleTapUp");
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        //test.setText(test.getText().toString()+"\n"+"onScroll");
        //test.setText("x:" + motionEvent1.getX() + "\ny:" + motionEvent1.getY());
        //test.setText("v:" + v + "\nv1:" + v1);
        return false;
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {
        //test.setText(test.getText().toString()+"\n"+"onLongPress");
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        //test.setText(test.getText().toString()+"\n"+"onFling");
//        test.setText("x:" + motionEvent.getX() + "\ny:" + motionEvent.getY()
//        +"\nx:" + motionEvent1.getX() + "\ny:" + motionEvent1.getY());
        test.setText("v:" + v + "\nv1:" + v1);
        return false;
    }
}