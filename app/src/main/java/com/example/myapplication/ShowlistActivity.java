package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.maps.model.Marker;

import java.util.ArrayList;

public class ShowlistActivity extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showlist);
        listView = findViewById(R.id.pandalList);

        //Setup for Ads

        AdView mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        //Setup the List
        ArrayList<AdapterClass> data;
        int showid = getIntent().getExtras().getInt("id");
        switch (showid){
            case -1:
                data = getParentList();
                break;
            case 0:
                data = getSouthList();
                break;
            case 1:
                data = getNorthList();
                break;
            case 2:
                data = getmisList();
                break;
            default:
                data = getParentList();

        }
        OwnAdapter adapter = new OwnAdapter(this, data);
        listView.setAdapter(adapter);

    }

    private ArrayList<AdapterClass> getmisList() {
        ArrayList<AdapterClass> data = new ArrayList<>();
        Pandles.setmisPandles();
        ArrayList<Integer> rating = Pandles.misratings;
        ArrayList<String> names = Pandles.misPandleNames;
        int i=0;
        for(String name:names){
            data.add(new AdapterClass(name,(int)rating.get(i)));
            i++;
        }
        return data;
    }

    private ArrayList<AdapterClass> getNorthList() {
        ArrayList<AdapterClass> data = new ArrayList<>();
        Pandles.setNorthPandles();
        ArrayList<Integer> rating = Pandles.northrating;
        ArrayList<String> names = Pandles.northPandleNames;
        int i=0;
        for(String name:names){
            data.add(new AdapterClass(name,(int)rating.get(i)));
            i++;
        }
        return data;
    }

    private ArrayList<AdapterClass> getSouthList() {
        ArrayList<AdapterClass> data = new ArrayList<>();
        Pandles.setSouthPandles();
        ArrayList<Integer> rating = Pandles.southrating;
        ArrayList<String> names = Pandles.PandleNames;
        int i=0;
        for(String name:names){
            data.add(new AdapterClass(name,(int)rating.get(i)));
            i++;
        }
        return data;
    }

    private ArrayList<AdapterClass> getParentList() {
        ArrayList<AdapterClass> data = new ArrayList<>();
        data.add(new AdapterClass("South Kolkata",0));
        data.add(new AdapterClass("North Kolkata",0));
        data.add(new AdapterClass("Miscellaneous",0));
        return data;
    }
}
