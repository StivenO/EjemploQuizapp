package com.infowithvijay.triviaquizapp2.activites;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.infowithvijay.triviaquizapp2.R;
import com.infowithvijay.triviaquizapp2.entretenimiento;
import com.infowithvijay.triviaquizapp2.entretenimiento1;
import com.infowithvijay.triviaquizapp2.historia;
import com.infowithvijay.triviaquizapp2.programacion;

public class CategoryActivity extends AppCompatActivity implements View.OnClickListener{


    Button btPrograming,bthistoria,btentretenimiento,salir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

     btPrograming = findViewById(R.id.bt_Programing);
     bthistoria = findViewById(R.id.bt_historia);
     btentretenimiento = findViewById(R.id.bt_entretenimiento);
     salir = findViewById(R.id.salir);

        btPrograming.setOnClickListener(this);
        bthistoria.setOnClickListener(this);
        btentretenimiento.setOnClickListener(this);
        salir.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.bt_historia:  // bt_VideoProduction

                Intent entretenimiento=new Intent(CategoryActivity.this, entretenimiento.class);
                startActivity(entretenimiento);
                finish();
                break;

            case R.id.bt_Programing:  // bt_Programing

                Intent siguiente=new Intent(CategoryActivity.this, programacion.class);
                startActivity(siguiente);
                finish();
                break;

            case R.id.bt_entretenimiento:  // bt_Motivation

                Intent historia=new Intent(CategoryActivity.this, historia.class);
                startActivity(historia);
                finish();
                break;
            case R.id.salir:  // bt_Motivation

                Intent fuera=new Intent(CategoryActivity.this, HomeScreen.class);
                startActivity(fuera);
                finish();
                break;
        }

    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(CategoryActivity.this, HomeScreen.class);
        startActivity(intent);
        finish();
    }

}