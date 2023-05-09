package com.example.roulettegame;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    ImageView IVRoulette;
    float startDegree = 0f;
    float endDegree = 0f;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        IVRoulette = findViewById(R.id.roulette);
    }

    public void rotate(View view) {
        startDegree= endDegree;
        Random ran = new Random();
        int degree_ran = ran.nextInt(360);
        endDegree = startDegree + 360*3 +degree_ran;
        ObjectAnimator object = ObjectAnimator.ofFloat(IVRoulette, "rotation",startDegree,endDegree);
        object.setInterpolator(new AccelerateDecelerateInterpolator());
        object.setDuration(5000);
        object.start();
    }

    public void animationTest(View view){

    }
}