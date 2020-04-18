package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.maps.model.Marker;

import java.util.ArrayList;

class OwnAdapter extends BaseAdapter {
    private ArrayList<AdapterClass> data;
    private Context context;
    private LayoutInflater inflater;
    public OwnAdapter(Context context, ArrayList<AdapterClass> data) {
        this.data = data;
        this.context = context;
        this.inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, final View convert, ViewGroup parent) {
        final View convertView = inflater.inflate(R.layout.listitem,null);
        TextView name = convertView.findViewById(R.id.name);
        TextView rating = convertView.findViewById(R.id.rating);
        name.setText(data.get(position).name);
        final int i = data.get(position).rating;
        if(i==0) {
            rating.setVisibility(View.INVISIBLE);
            rating.setHeight(0);
            name.setPadding(0,50,0,50);
        }
        else {
            rating.setText("Rating: " + String.valueOf(i));
        }
        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(i==0) {
                    context.startActivity(new Intent(context, ShowlistActivity.class).putExtra("id", position));
                }
            }
        });
        return convertView;
    }
}
