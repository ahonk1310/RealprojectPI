package com.hamzah.realprojectpi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnMenuTabClickListener;

public class Fragmentactivity extends AppCompatActivity {

 BottomBar mBottomBar;
    @Override
    protected void onCreate(Bundle savedInstanceState){
super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi);
        mBottomBar = BottomBar.attach(this,savedInstanceState);
        mBottomBar.setItemsFromMenu(R.menu.menu_main, new OnMenuTabClickListener() {
            @Override
            public void onMenuTabSelected(int menuItemId) {
                if(menuItemId == R.id.buttonplanet) {
                    planetFragment f = new planetFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame, f).commit();
                }

                if(menuItemId == R.id.buttonasteroid) {
                    asteroidFragment f = new asteroidFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame, f).commit();
                }

                if(menuItemId == R.id.buttonkomet) {
                    kometFragment f = new kometFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame, f).commit();
                }
            }

            @Override
            public void onMenuTabReSelected(int menuItemId) {

            }
        });
        mBottomBar.mapColorForTab(0, "#9CCC65");
        mBottomBar.mapColorForTab(1, "#9CCC65");
        mBottomBar.mapColorForTab(2, "#9CCC65");

    }

}


