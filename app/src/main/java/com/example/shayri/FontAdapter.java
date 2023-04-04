package com.example.shayri;

import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class FontAdapter extends BaseAdapter {
    Edit_shyari edit_shyari;
    String[] colours;
    String type;

    public FontAdapter(Edit_shyari edit_shyari, String[] colours, String type) {
        this.edit_shyari=edit_shyari;
        this.colours=colours;
        this.type=type;
    }

    @Override
    public int getCount() {
        return colours.length;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view= LayoutInflater.from(edit_shyari).inflate(R.layout.grid_item,viewGroup,false);
        TextView textView=view.findViewById(R.id.Text_gridview);
        if(type.equals("font")) {
            Typeface typeface = Typeface.createFromAsset(edit_shyari.getAssets(), Config.font[i]);
            textView.setText("padu");
            textView.setTypeface(typeface);
        }
        else {
            textView.setText(Config.emoji[i]);
        }
        return view;
    }
}
