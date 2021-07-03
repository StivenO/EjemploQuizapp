package com.infowithvijay.triviaquizapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class programacion extends AppCompatActivity {
    Intent i;
    Button btIniciarh;


    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        i=new Intent (programacion.this,programacion1.class);
        btIniciarh=(Button)findViewById(R.id.bt_Programing);
        btIniciarh.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                startActivity(i);
            }
        });
    }
}