package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class LaunchActivity extends AppCompatActivity {

    LinearLayout showmap, showlist, showroute, showpics, share, help;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);
        showmap = findViewById(R.id.showmap);
        showlist = findViewById(R.id.showlist);
        showroute = findViewById(R.id.showroute);
        showpics = findViewById(R.id.showpics);
        share = findViewById(R.id.share);
        help = findViewById(R.id.help);


        showmap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
            }
        });

        showlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),ShowlistActivity.class).putExtra("id",-1));
            }
        });

        showroute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),RouteActivity.class));

            }
        });

        showpics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Coming Soon",Toast.LENGTH_LONG).show();

            }
        });

        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                String sub = "Durga Darshan\n";
                String body = "Don't know routes for pandals? Left any Puja pandal? Here is our application DURGA DARSHAN. Get suggested route through map and don't miss any puja pandal." +
                        "Available on play store for free \n" + "https://play.google.com/store/apps/details?id=" + getPackageName();
                intent.putExtra(Intent.EXTRA_SUBJECT,sub);
                intent.putExtra(Intent.EXTRA_TEXT,body);
                startActivity(Intent.createChooser(intent,"Share Using"));

            }
        });

        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Contact.class));

            }
        });


    }

    @Override
    public void onBackPressed() {
    }
}
