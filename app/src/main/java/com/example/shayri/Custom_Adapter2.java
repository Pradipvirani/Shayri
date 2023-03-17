package com.example.shayri;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class Custom_Adapter2 extends BaseAdapter {
    MainActivity mainActivity;
    int[] image;
    String[] type;
    ListView lv;
    ImageView img;
    TextView txt;

    public Custom_Adapter2(MainActivity2 mainActivity2, String[] lvshayri, int image) {
    }

    @Override
    public int getCount() {
        return 0;
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
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}
