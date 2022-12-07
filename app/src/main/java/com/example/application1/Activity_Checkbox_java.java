package com.example.application1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class Activity_Checkbox_java extends AppCompatActivity {

    CheckBox CB_A01,CB_A02,CB_A03,CB_A04;
    String strTemp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkbox_java);

        CB_A01 = findViewById(R.id.checkbox_a01);
        CB_A02 = findViewById(R.id.checkbox_a02);
        CB_A03 = findViewById(R.id.checkbox_a03);
        CB_A04 = findViewById(R.id.checkbox_a04);


        CB_A01.setOnCheckedChangeListener(checkedChangeListener_01);
        CB_A02.setOnCheckedChangeListener(checkedChangeListener_01);
        CB_A03.setOnCheckedChangeListener(checkedChangeListener_01);
        CB_A04.setOnCheckedChangeListener(checkedChangeListener_01);
    }

    CompoundButton.OnCheckedChangeListener checkedChangeListener_01 = new CompoundButton.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

            strTemp="已選擇:";
            if(CB_A01.isChecked()==true){
                strTemp+=CB_A01.getText().toString() + " , ";
            }
            if(CB_A02.isChecked()==true){
                strTemp+=CB_A02.getText().toString() + " , ";
            }
            if(CB_A03.isChecked()==true){
                strTemp+=CB_A03.getText().toString() + " , ";
            }
            if(CB_A04.isChecked()==true){
                strTemp+=CB_A04.getText().toString() ;
            }

            Toast.makeText(Activity_Checkbox_java.this,strTemp,Toast.LENGTH_SHORT).show();

        }
    };
















}