package com.example.josip.smartapartmentnew;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by jvrlic on 13.2.2017..
 */

public class MyListAdapter extends ArrayAdapter<String> {

    public MyListAdapter(Context context, int textViewResourceId) {
        super(context, textViewResourceId);
    }

    public MyListAdapter(Context context, int resource, List<String> items) {
        super(context, resource, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;

        if (v == null) {
            LayoutInflater vi;
            vi = LayoutInflater.from(getContext());
            v = vi.inflate(R.layout.itemlistrow, null);
        }

        String p = getItem(position);

        if (p != null) {
            TextView tv = (TextView) v.findViewById(R.id.textViewOpis);
            ImageView iv = (ImageView) v.findViewById(R.id.imageView);


            if (tv != null) {
                tv.setText(p);
            }

            if (p.contains("by"))
            {
                iv.setImageResource(R.drawable.door_unlock);
            }
            else
            {
                iv.setImageResource(R.drawable.door_open);
            }

        }

        return v;
    }

}