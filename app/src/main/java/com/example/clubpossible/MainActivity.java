package com.example.clubpossible;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;


import com.example.clubpossible.Controlador.Consumo;
import com.example.clubpossible.Controlador.Movimiento;
import com.example.clubpossible.Controlador.Otro;
import com.example.clubpossible.Controlador.PagerController;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TabLayout tabLayout;
  /*  ViewPager viewPager;*/
    TabItem tab1, tab2, tab3;
    CardView movv, conss, compras;
    PagerController pagerAdapter;

    FrameLayout  viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        viewPager = findViewById(R.id.viewpager);
/*
 tabLayout = findViewById(R.id.tablayout);
        view1 = findViewById(R.id.tabmovimiento);
        tab2 = findViewById(R.id.tabconsumo);
        tab3 = findViewById(R.id.tabotro);
*/

        movv = findViewById(R.id.mov);
        conss = findViewById(R.id.cons);
        compras = findViewById(R.id.compras);

        getSupportFragmentManager().beginTransaction().replace(R.id.viewpager, new Movimiento()).commit();

        movv.setOnClickListener(this);
        conss.setOnClickListener(this);
        compras.setOnClickListener(this);
        /*
        pagerAdapter = new PagerController(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(pagerAdapter);
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                if (tab.getPosition()==0){
                    pagerAdapter.notifyDataSetChanged();
                }
                if (tab.getPosition()==1){
                    pagerAdapter.notifyDataSetChanged();
                }
                if (tab.getPosition()==2){
                    pagerAdapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        viewPager.addOnPageChangeListener(new  TabLayout.TabLayoutOnPageChangeListener(tabLayout));
*/
    }

    @Override
    public void onClick(View v) {
        if (v.getId()== R.id.mov){
        getSupportFragmentManager().beginTransaction().replace(R.id.viewpager, new Movimiento()).commit();

        }
        if (v.getId()== R.id.cons){
            startActivity(new Intent(MainActivity.this,TransferenciaFavorito.class));

        }
        if (v.getId()== R.id.compras){
            startActivity(new Intent(MainActivity.this,Tienda.class));

        }
    }

}