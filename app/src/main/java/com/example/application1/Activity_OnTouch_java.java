package com.example.application1;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity_OnTouch_java extends AppCompatActivity {

    ImageView image_01;
    TextView textview_01, textview_02;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imageview_java);
        textview_01 = findViewById(R.id.textview_change_pic);
        textview_02 = findViewById(R.id.textview_change_scaletype);
        image_01 = findViewById(R.id.imageview_01);
        textview_01.setText("手勢觸發的動作型態:");
        textview_02.setText("");


        image_01.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN)
                {
                    textview_02.setText("event Action Down 動作被觸發");
                }else if(motionEvent.getAction()==MotionEvent.ACTION_UP){
                    textview_02.setText("event Action Up 動作被觸發");
                }else if(motionEvent.getAction()==MotionEvent.ACTION_MOVE){
                    textview_02.setText("event Action Move 動作被觸發");
                }else {
                    textview_02.setText("Action Code - " +motionEvent.getAction()+"發生");
                }
                return false;
            }
        });


    }
}












