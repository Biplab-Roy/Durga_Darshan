package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.PatternMatcher;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class SpalashScreen extends AppCompatActivity {

    ImageView im;
    TextView tv;
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spalash_screen);
        im = findViewById(R.id.splogo);
        tv = findViewById(R.id.text);
        context = this;
        Animation animSlide = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.fadein);
        // Start the animation like this
        im.startAnimation(animSlide);
        tv.setAnimation(animSlide);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Pandles.setNorthPandles();
                Pandles.setSouthPandles();
                Pandles.setmisPandles();
                startActivity(new Intent(getApplicationContext(),LaunchActivity.class));

            }
        },2000);

    }
}
