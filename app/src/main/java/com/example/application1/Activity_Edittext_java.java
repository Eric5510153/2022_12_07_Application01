package com.example.application1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity_Edittext_java extends AppCompatActivity {
Button button_add;
TextView text_answer;
EditText edittext_input01,edittext_input02;
Integer int_01, int_02,int_answer;
double double_01,double_02,double_answer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edittext_java);
        button_add=findViewById(R.id.btn_add);
        text_answer=findViewById(R.id.text_answer);
        edittext_input01=findViewById(R.id.edittext_input01);
        edittext_input02=findViewById(R.id.edittext_input02);

        button_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = edittext_input01.getText().toString();
                double_01=Double.parseDouble(s);
                double_02=Double.parseDouble(edittext_input02.getText().toString());

                /*
                int_01 =Integer.parseInt(s);
                int_02 =Integer.parseInt(edittext_input02.getText().toString());
*/
                //int_answer= int_01 + int_02;
                double_answer=double_01+double_02;
                text_answer.setText(" = "+double_answer);
              //  text_answer.setText(int_answer.toString);
            }
        });























    }
}