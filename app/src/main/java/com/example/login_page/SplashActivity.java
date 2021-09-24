package com.example.login_page;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {

    static final int SPLASH_SCREEN = 5000 ; // 5 second
    Animation topAnime , bottomAnime;
    ImageView iv_taxi;
    TextView tv_logoName , tv_desc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);

        topAnime = AnimationUtils.loadAnimation(this , R.anim.splash_top_animatio);
        bottomAnime = AnimationUtils.loadAnimation(this , R.anim.splash_bottom_animation);

        iv_taxi = findViewById(R.id.iv_taxi);
        tv_logoName = findViewById(R.id.tv_logoName);
        tv_desc = findViewById(R.id.tv_logoDesc);

        iv_taxi.setAnimation(topAnime);
        tv_logoName.setAnimation(bottomAnime);
        tv_desc.setAnimation(bottomAnime);

            //new Runnable()
        new Handler().postDelayed(() -> {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
            finish();
        }, SPLASH_SCREEN);
    }
}