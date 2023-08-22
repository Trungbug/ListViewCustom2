
package com.example.listviewcustom2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        list.add(new Country(R.drawable.thailan,"Thái Lan","72","32"));
        list.add(new Country(R.drawable.hanquoc,"Hàn Quốc","72","32"));
        list.add(new Country(R.drawable.laos,"Lào","72","32"));
        list.add(new Country(R.drawable.hanquoc,"Hàn Quốc","72","33"));
        list.add(new Country(R.drawable.thailan,"Thái Lan","72","33"));
        list.add(new Country(R.drawable.laos,"Lào","72","33"));
        adapterCustom = new AdapterCustom(list,R.layout.custom,MainActivity2.this);
        gridView = findViewById(R.id.grview);
        gridView.setAdapter(adapterCustom);
    }
    private GridView gridView;
    private AdapterCustom adapterCustom;
    private List<Country> list = new ArrayList<>();
}