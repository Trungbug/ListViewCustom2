package com.example.listviewcustom2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class AdapterCustom extends BaseAdapter {
    public AdapterCustom(List<Country> list, int layout, Context context) {
        this.list = list;
        this.layout = layout;
        this.context = context;
    }

    private List<Country> list = new ArrayList<>();
    private int layout;
    private Context context;
    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout,null);
        ImageView imgSrc = view.findViewById(R.id.imgcustom);
        TextView textCountry = view.findViewById(R.id.textName);
        TextView textPopulation = view.findViewById(R.id.textpopulation);
        TextView textArea = view.findViewById(R.id.textArea);
        Country get = list.get(i);
        imgSrc.setImageResource(get.getSourceImage());
        textCountry.setText(get.getTextCountry());
        textArea.setText("Area: "+get.getTextArea());
        textPopulation.setText("Population: "+get.getTextPopulation());
        return view;
    }
}