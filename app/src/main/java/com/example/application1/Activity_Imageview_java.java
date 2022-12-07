package com.example.application1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Activity_Imageview_java extends AppCompatActivity {

    ImageView image_01;
    TextView textview_changePic,textview_changeScale;
    Integer imageIndex =0 , scaleIndex=0;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imageview_java);
        textview_changePic = findViewById(R.id.textview_change_pic);
        textview_changeScale = findViewById(R.id.textview_change_scaletype);
        image_01 = findViewById(R.id.imageview_01);
        textview_changePic.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN)
                    if (imageIndex == 2) {
                        image_01.setImageResource(R.drawable.imageview_java_1);
                        imageIndex = 1;

                    } else {
                        image_01.setImageResource(R.drawable.imageview_java_2);
                        imageIndex = 2;
                    }


                return false;
            }
        });
        textview_changeScale.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if (b) {
                    if (imageIndex == 2) {
                        image_01.setScaleType(ImageView.ScaleType.FIT_CENTER);
                        imageIndex = 1;
                    }  else {
                        image_01.setScaleType(ImageView.ScaleType.CENTER_CROP);
                        imageIndex = 2;
                    }


                    }

                    }
            });

    }
}












