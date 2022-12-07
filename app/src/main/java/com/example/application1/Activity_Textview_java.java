package com.example.application1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;

import java.lang.reflect.TypeVariable;

public class Activity_Textview_java extends AppCompatActivity {



    TextView textview_01,textview_02,textview_03;
    String text1;
    Integer colorText2;
    float sizeText3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_textview_java);

        textview_01 = findViewById(R.id.textview_1);
        textview_02 = findViewById(R.id.textview_2);
        textview_03 = findViewById(R.id.textview_3);
       text1=textview_01.getText().toString();
       colorText2=textview_02.getCurrentTextColor();
       sizeText3=textview_03.getTextSize()/getResources().getDisplayMetrics().scaledDensity;

    textview_01.setOnFocusChangeListener(new View.OnFocusChangeListener() {
        @Override
        public void onFocusChange(View view, boolean b) {

         if(b==true){
             textview_01.setText("目前焦點:Focus在TextView1");
         }
         else{
             textview_01.setText(text1);
         }


    }
});

     textview_02.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {

                if(b==true){
                    textview_02.setTextColor(0xffff0000);
                }
                else{
                    textview_02.setTextColor(colorText2);
                }


            }
        });

        textview_03.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {

                if(b==true){
                    textview_03.setTextSize(30.0f);
                }
                else{
                    textview_03.setTextSize(TypedValue.COMPLEX_UNIT_SP,sizeText3);
                }


            }
        });















    }
}