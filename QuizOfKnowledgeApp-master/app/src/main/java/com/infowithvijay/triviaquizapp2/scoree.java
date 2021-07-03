package com.infowithvijay.triviaquizapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.infowithvijay.triviaquizapp2.activites.CategoryActivity;

public class scoree extends AppCompatActivity {

    Intent i, recibe;
    Bundle bolsa;
    int calificacion;
    Button reg;
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scoree);
        reg=(Button) findViewById(R.id.regresar);
        txt=(TextView) findViewById(R.id.score);
        i=new Intent(scoree.this, CategoryActivity.class);
        try {
            recibe=getIntent();
            bolsa=recibe.getExtras();
            calificacion=bolsa.getInt("calificacion");
            txt.setText("score: "+calificacion);
        } catch (Exception e) {
            Toast.makeText(this, "Error al recibir datos", Toast.LENGTH_SHORT) .show();
        }
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(i);
            }
        });
    }

}