package com.infowithvijay.triviaquizapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class historia extends AppCompatActivity {
    Intent i;
    Button btIniciarh;


    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        i=new Intent (historia.this,historia1.class);
        btIniciarh=(Button)findViewById(R.id.bt_entretenimiento);
        btIniciarh.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                startActivity(i);
            }
        });
    }
}