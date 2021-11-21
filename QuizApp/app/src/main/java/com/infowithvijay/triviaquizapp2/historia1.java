package com.infowithvijay.triviaquizapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class historia1 extends AppCompatActivity implements View.OnClickListener {
    Button a,b,c,d,sigue;
    int calificacion=0;
    Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historia1);
          i=new Intent(historia1.this,historia2.class);
          a=(Button)findViewById(R.id.bta);
          b=(Button)findViewById(R.id.btb);
          c=(Button)findViewById(R.id.btc);
          d=(Button)findViewById(R.id.btd);
          sigue=(Button)findViewById(R.id.btsigue);
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
            case R.id.bta: //Respuesta Correcta
                calificacion=1;
                desabilitar();
                break;

            case R.id.btb:
                calificacion=0;
                desabilitar();
                break;

            case R.id.btc:
                calificacion=0;
                desabilitar();
                break;

            case R.id.btd:
                calificacion=0;
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
        a.setBackgroundColor(Color.GREEN);
        b.setBackgroundColor(Color.RED);
        c.setBackgroundColor(Color.RED);
        d.setBackgroundColor(Color.RED);
        a.setEnabled(false);
        b.setEnabled(false);
        c.setEnabled(false);
        d.setEnabled(false);
        sigue.setEnabled(true);

    }
}