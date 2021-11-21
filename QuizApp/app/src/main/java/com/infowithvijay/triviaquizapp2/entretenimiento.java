package com.infowithvijay.triviaquizapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class entretenimiento extends AppCompatActivity {
    Intent i;
    Button btiniciare;


    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        i=new Intent (entretenimiento.this,entretenimiento1.class);
        btiniciare=(Button)findViewById(R.id.bt_historia);
        btiniciare.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) { startActivity(i);
            }
        });

    }
}