package com.infowithvijay.triviaquizapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View;
import android.view.View.OnClickListener;


import com.infowithvijay.triviaquizapp2.activites.CategoryActivity;

public class scoreh extends AppCompatActivity {
    Intent i, recibe;
    Bundle bolsa;
    int calificacion;
    Button reg;
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scoreh);
        reg=(Button) findViewById(R.id.regresar);
        txt=(TextView) findViewById(R.id.score);
        i=new Intent(scoreh.this, CategoryActivity.class);
        try {
            recibe=getIntent();
            bolsa=recibe.getExtras();
            calificacion=bolsa.getInt("calificacion");
            txt.setText("score: "+calificacion);
        } catch (Exception e) {
            Toast.makeText(this, "Error al recibir datos", Toast.LENGTH_SHORT) .show();
        }
        reg.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(i);
            }
        });
    }

}