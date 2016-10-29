package com.example.isaquearaujo.organizaenem;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class TelaPrincipal extends AppCompatActivity {
    ViewPager viewpagerprincipal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal);
        viewpagerprincipal = (ViewPager)findViewById(R.id.viewpagerprincipal);
        viewpagerprincipal.setAdapter(new NavigateTelaPrincipal(getSupportFragmentManager()));
        viewpagerprincipal.setOffscreenPageLimit(2);
        viewpagerprincipal.setCurrentItem(0);
    }
}
