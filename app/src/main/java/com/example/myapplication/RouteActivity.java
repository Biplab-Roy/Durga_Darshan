package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.mediation.Adapter;

public class RouteActivity extends AppCompatActivity {

    ListView listView;
    //InterstitialAd interstitialAds;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_route);
        AdView mAdView = findViewById(R.id.adView);
        listView = findViewById(R.id.routelist);

        //Show ads
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
/*
        showad();

        interstitialAds.setAdListener(new AdListener()
                                      {
                                          @Override
                                          public void onAdClosed() {
                                              startActivity(new Intent(getApplicationContext(),LaunchActivity.class));
                                          }
                                      }

        );
        */


        String[] data = new String[6];
        data[0] = "South Kolkata 1";
        data[1] = "South Kolkata 2";
        data[2] = "North Kolkata 1";
        data[3] = "North Kolkata 2";
        data[4] = "North Kolkata 3";
        data[5] = "Miscellaneous 1";
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,data);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                startActivity(new Intent(getApplicationContext(),ShowRoute.class).putExtra("rt",position));
            }
        });
    }
/*
    public void showad(){
        interstitialAds = new InterstitialAd(this);
        interstitialAds.setAdUnitId(getString(R.string.interstitial_ad_unit_id));
        interstitialAds.loadAd(new AdRequest.Builder().build());
    }

    @Override
    public void onBackPressed() {
        if (interstitialAds.isLoaded()) {
            interstitialAds.show();
        }
        else {
            super.onBackPressed();
        }
    }
    */
}
