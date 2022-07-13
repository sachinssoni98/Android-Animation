package com.example.animationproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView txt;
    private Button translate, rotate, zoom, alpha;
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt= findViewById(R.id.text);
        translate= findViewById(R.id.btn1);
        rotate= findViewById(R.id.btn2);
        zoom= findViewById(R.id.btn3);
        alpha= findViewById(R.id.btn4);
        imageView= findViewById(R.id.image);

        Animation animation= AnimationUtils.loadAnimation(this,R.anim.scale_image);
        imageView.startAnimation(animation);

        translate.setOnClickListener(this::translateText);
        rotate.setOnClickListener(this::rotateText);
        zoom.setOnClickListener(this::zoomText);
        alpha.setOnClickListener(this::alphaText);

    }

    private void alphaText(View view) {
        Animation animation= AnimationUtils.loadAnimation(this,R.anim.alpha_anim);
        txt.startAnimation(animation);
    }

    private void zoomText(View view) {
        Animation animation= AnimationUtils.loadAnimation(this,R.anim.zoom_anim);
        txt.startAnimation(animation);
    }

    private void rotateText(View view) {
        Animation animation= AnimationUtils.loadAnimation(this,R.anim.rotate_anim);
        txt.startAnimation(animation);
    }

    private void translateText(View view) {
        Animation animation= AnimationUtils.loadAnimation(this,R.anim.translate_anim);
        txt.startAnimation(animation);
    }
}