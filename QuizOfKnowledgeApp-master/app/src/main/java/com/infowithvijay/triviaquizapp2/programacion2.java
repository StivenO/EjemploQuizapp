package com.infowithvijay.triviaquizapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class programacion2 extends AppCompatActivity implements View.OnClickListener {
    Button a,b,c,d,sigue;
    int calificacion=0;
    Intent i, recibe;
    Bundle bolsa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programacion2);
        i=new Intent(programacion2.this,programacion3.class);
        a=(Button)findViewById(R.id.bta);
        b=(Button)findViewById(R.id.btb);
        c=(Button)findViewById(R.id.btc);
        d=(Button)findViewById(R.id.btd);
        sigue=(Button)findViewById(R.id.btsigue);
        try {
            recibe=getIntent();
            bolsa=recibe.getExtras();
            calificacion=bolsa.getInt("calificacion");
        } catch (Exception e) {
            Toast.makeText(this, "Error al recibir datos", Toast.LENGTH_SHORT) .show();
        }
        a.setOnClickListener(this);
        b.setOnClickListener(this);
        c.setOnClickListener(this);
        d.setOnClickListener(this);
        sigue.setOnClickListener(this);
        sigue.setEnabled(false);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bta:
                calificacion+=0;
                desabilitar();
                break;

            case R.id.btb: //Respuesta Correcta
                calificacion+=1;
                desabilitar();
                break;

            case R.id.btc:
                calificacion+=0;
                desabilitar();
                break;

            case R.id.btd:
                calificacion+=0;
                desabilitar();
                break;

            case R.id.btsigue:
                startActivity(i);
                break;

            default:
                break;
        }
        i.putExtra("calificacion", calificacion);
    }

    public void desabilitar () {
        a.setBackgroundColor(Color.RED);
        b.setBackgroundColor(Color.GREEN);
        c.setBackgroundColor(Color.RED);
        d.setBackgroundColor(Color.RED);
        a.setEnabled(false);
        b.setEnabled(false);
        c.setEnabled(false);
        d.setEnabled(false);
        sigue.setEnabled(true);

    }

}