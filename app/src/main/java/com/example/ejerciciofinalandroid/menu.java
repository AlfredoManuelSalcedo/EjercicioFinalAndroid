package com.example.ejerciciofinalandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;

public class menu extends AppCompatActivity {
    TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        texto = findViewById(R.id.textodes);
        TabLayout tabLayout =(TabLayout) findViewById(R.id.pestanias);
        tabLayout.addTab(tabLayout.newTab().setText("Cartera"));
        tabLayout.addTab(tabLayout.newTab().setText("Comprar"));
        tabLayout.addTab(tabLayout.newTab().setText("Vender"));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                Fragment fragment = null;
                switch (tab.getPosition()){
                    case 0:
                        texto.setVisibility(View.INVISIBLE);
                        fragment = new FirstFragment();
                        break;
                    case 1:
                        texto.setVisibility(View.INVISIBLE);
                        fragment = new FirstFragment();
                        break;
                    case 2:
                        texto.setVisibility(View.INVISIBLE);
                        fragment = new FirstFragment();
                        break;
                }
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.frane, fragment);
                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                ft.commit();
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}