package com.example.application1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Activity_Radiobutton_java extends AppCompatActivity {

     TextView textViewAns_1,textViewAns_2;
     RadioGroup radioGroup_1,radioGroup_2;
     RadioButton radiobutton_4,radiobutton_5,radiobutton_6;

     RadioGroup.OnCheckedChangeListener radioLister_1 = new RadioGroup.OnCheckedChangeListener() {
         @Override
         public void onCheckedChanged(RadioGroup radioGroup, int i) {
       int selectedId;
             selectedId = radioGroup.getCheckedRadioButtonId();
             if(selectedId == R.id.radiobutton_1){
                 textViewAns_1.setText("第一題為:"+((RadioButton)(findViewById(R.id.radiobutton_1))).getText().toString());
             }else if(selectedId == R.id.radiobutton_2){
                 textViewAns_1.setText("第一題為:"+((RadioButton)(findViewById(R.id.radiobutton_2))).getText().toString());
             }else if(selectedId == R.id.radiobutton_3) {
                 textViewAns_1.setText("第一題為:" + ((RadioButton) (findViewById(R.id.radiobutton_3))).getText().toString());
             }
         }
     };

    /*RadioGroup.OnCheckedChangeListener radioLister_2 = new RadioGroup.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(RadioGroup radioGroup, int i) {
            int selectedId;
            selectedId = radioGroup.getCheckedRadioButtonId();
            if(selectedId == R.id.radiobutton_4){
                textViewAns_2.setText("第二題為:"+((RadioButton)(findViewById(R.id.radiobutton_4))).getText().toString());
            }else if(selectedId == R.id.radiobutton_5){
                textViewAns_2.setText("第二題為:"+((RadioButton)(findViewById(R.id.radiobutton_5))).getText().toString());
            }else if(selectedId == R.id.radiobutton_6) {
                textViewAns_2.setText("第二題為:" + ((RadioButton) (findViewById(R.id.radiobutton_6))).getText().toString());
            }
        }
    };*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radiobutton_java);

        textViewAns_1 = findViewById(R.id.textview_ans_1);
        textViewAns_2 = findViewById(R.id.textview_ans_2);

        radioGroup_1 = findViewById(R.id.radiogroup_01);
        radioGroup_2 = findViewById(R.id.radiogroup_02);

        radiobutton_4 = findViewById(R.id.radiobutton_4);
        radiobutton_5 = findViewById(R.id.radiobutton_5);
        radiobutton_6 = findViewById(R.id.radiobutton_6);


        radioGroup_1.setOnCheckedChangeListener(radioLister_1);
       /* radioGroup_2.setOnCheckedChangeListener(radioLister_2);

*/
        radiobutton_4 .setOnClickListener(radioLister_2);
        radiobutton_5 .setOnClickListener(radioLister_2);
        radiobutton_6 .setOnClickListener(radioLister_2);
    }

    View.OnClickListener radioLister_2 =new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            int selectedId;
            selectedId = radioGroup_2.getCheckedRadioButtonId();
            textViewAns_2.setText("第二題為:" + ((RadioButton) findViewById(selectedId)).getText().toString());

        }
    };



}