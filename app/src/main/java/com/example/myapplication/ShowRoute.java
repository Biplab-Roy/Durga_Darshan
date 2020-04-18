package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class ShowRoute extends AppCompatActivity {

    AdView mAdView;
    TextView heading, body;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_route);
        heading = findViewById(R.id.routehead);
        body = findViewById(R.id.route);
        mAdView = findViewById(R.id.adView);
        //Show ads
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        int op = getIntent().getExtras().getInt("rt");
        switch (op){
            case 0:
                heading.setText(getString(R.string.sk1h));
                body.setText(getString(R.string.sk1b));
                break;
            case 1:
                heading.setText(getString(R.string.sk2h));
                body.setText(getString(R.string.sk2b));
                break;
            case 2:
                heading.setText(getString(R.string.nk1h));
                body.setText(getString(R.string.nk1b));
                break;
            case 3:
                heading.setText(getString(R.string.nk2h));
                body.setText(getString(R.string.nk2b));
                break;
            case 4:
                heading.setText(getString(R.string.nk3h));
                body.setText(getString(R.string.nk3b));
                break;
            case 5:
                heading.setText(getString(R.string.mi1h));
                body.setText(getString(R.string.mi1b));
                break;
        }
    }
}
