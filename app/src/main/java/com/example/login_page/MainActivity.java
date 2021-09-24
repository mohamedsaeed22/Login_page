package com.example.login_page;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    FloatingActionButton fb, google, twitter;
    ViewPager2 viewPager;
    ConstraintLayout constraintLayout;
    float v = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tabLayout = findViewById(R.id.tab_layout);
        viewPager = findViewById(R.id.view_pager);
        fb = findViewById(R.id.fab_facebook);
        google = findViewById(R.id.fab_google);
        twitter = findViewById(R.id.fab_twitter);
        constraintLayout = findViewById(R.id.constraintLayout);

        PagerAdapter adapter = new PagerAdapter(getSupportFragmentManager(), getLifecycle());

        viewPager.setAdapter(adapter);

        constraintLayout.setTranslationY(400);
        tabLayout.setTranslationX(800);
        tabLayout.setAlpha(v);
        constraintLayout.setAlpha(v);
        tabLayout.animate().translationX(0).alpha(1).setDuration(1000).setStartDelay(400).start();
        constraintLayout.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(400).start();

        setScreenAnimations();
        tabLayout.addTab(tabLayout.newTab().setText(R.string.tab_name_login));
        tabLayout.addTab(tabLayout.newTab().setText(R.string.tab_name_signup));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {

            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                switch (tab.getPosition()) {
                    case 0:
                        fb.setVisibility(View.VISIBLE);
                        google.setVisibility(View.VISIBLE);
                        twitter.setVisibility(View.VISIBLE);
                        setScreenAnimations();
                        break;
                    case 1:
                        fb.setVisibility(View.INVISIBLE);
                        google.setVisibility(View.INVISIBLE);
                        twitter.setVisibility(View.INVISIBLE);
                        break;
                }
            }
            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        viewPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                tabLayout.selectTab(tabLayout.getTabAt(position));
            }
        });
    }
    void setScreenAnimations() {
        fb.setTranslationY(300);
        google.setTranslationY(300);
        twitter.setTranslationY(300);
        fb.setAlpha(v);
        google.setAlpha(v);
        twitter.setAlpha(v);
        fb.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(400).start();
        google.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(600).start();
        twitter.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(800).start();
    }
}