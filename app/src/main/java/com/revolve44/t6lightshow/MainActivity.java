package com.revolve44.t6lightshow;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button l = (Button) findViewById(R.id.button1);
        l.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View arg0, MotionEvent arg1) {
                switch (arg1.getAction()) {
                    case MotionEvent.ACTION_DOWN: {
                        ImageView imageView = findViewById(R.id.img1);
                        imageView.setImageResource(R.drawable.whitecolor);
                        break;
                    }
                    case MotionEvent.ACTION_UP:{
                        ImageView imageView = findViewById(R.id.img1);
                        imageView.setImageResource(R.drawable.blackcolor);
                        break;
                    }
                }
                return true;
            }
        });
        final Button v = (Button) findViewById(R.id.button2);
        v.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View arg0, MotionEvent arg1) {
                switch (arg1.getAction()) {
                    case MotionEvent.ACTION_DOWN: {
                        ImageView imageView = findViewById(R.id.img2);
                        imageView.setImageResource(R.drawable.whitecolor);
                        break;
                    }
                    case MotionEvent.ACTION_UP:{
                        ImageView imageView = findViewById(R.id.img2);
                        imageView.setImageResource(R.drawable.blackcolor);
                        break;
                    }
                }
                return true;
            }
        });

    }
}
