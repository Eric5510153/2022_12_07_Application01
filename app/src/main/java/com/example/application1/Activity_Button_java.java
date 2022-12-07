package com.example.application1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity_Button_java extends AppCompatActivity {

    Button btn_01,btn_02;
    int i =0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_java);

        btn_01 = findViewById(R.id.btn_01);
        btn_02 = findViewById(R.id.btn_02);
    btn_01.setOnClickListener(new View.OnClickListener(){
            @Override
                public void onClick(View view) {
                i++;
                btn_01.setText("已按下按鈕"+i+"次");
                btn_01.setBackgroundColor(0);
                btn_01.setLongClickable(false);
                btn_02.setBackgroundResource(R.drawable.button_blue);
                btn_02.setLongClickable(true);
        }
    });

    btn_02.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v1) {

            i=0;
           btn_01.setText("按鈕一");
            btn_01.setBackgroundResource(R.drawable.button_blue);
            btn_01.setLongClickable(true);
            btn_02.setBackgroundColor(0);
            btn_02.setLongClickable(false);



        }
    });


    }
}