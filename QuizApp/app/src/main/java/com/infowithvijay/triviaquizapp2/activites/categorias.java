package com.infowithvijay.triviaquizapp2.activites;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.infowithvijay.triviaquizapp2.R;
import com.infowithvijay.triviaquizapp2.entretenimiento;
import com.infowithvijay.triviaquizapp2.historia;
import com.infowithvijay.triviaquizapp2.programacion;

public class categorias extends AppCompatActivity {
    Button btPrograming;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categorias);
    }
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.bt_historia:  // bt_VideoProduction

                Intent historia=new Intent(categorias.this, historia.class);
                startActivity(historia);
                finish();
                break;

            case R.id.bt_Programing:  // bt_Programing

                Intent siguiente=new Intent(categorias.this, programacion.class);
                startActivity(siguiente);
                finish();
                break;

            case R.id.bt_entretenimiento:  // bt_Motivation

                Intent entretenimiento=new Intent(categorias.this, entretenimiento.class);
                startActivity(entretenimiento);
                finish();
                break;
        }

    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(categorias.this, HomeScreen.class);
        startActivity(intent);
        finish();
    }

}
