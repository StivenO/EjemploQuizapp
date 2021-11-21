package com.infowithvijay.triviaquizapp2.activites;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.infowithvijay.triviaquizapp2.R;

public class ScoreActivity extends AppCompatActivity {

    int programingHighScore,motivationHighScore,videoProductionHighScore;

    TextView txtResultForMotivationS;

    ImageView imgHomeScreen;


    public static final String SCOREPREFERENCE = "shared_preference";
    public static final String PROGRAMING = "programing_high_score_preference";
    public static final String MOTIVATION = "motivation_high_score_preference";
    public static final String VIDEOPRODUCTION = "video_production_high_score_preference";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        txtResultForMotivationS = findViewById(R.id.txtResultForMotivationS);

        imgHomeScreen = findViewById(R.id.img_homeS);

        loadHighScore();

        imgHomeScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ScoreActivity.this, HomeScreen.class);
                startActivity(intent);
                finish();
            }
        });

    }


    private void loadHighScore() {

    }
}