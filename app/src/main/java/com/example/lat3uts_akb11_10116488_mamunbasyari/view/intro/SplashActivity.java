package com.example.lat3uts_akb11_10116488_mamunbasyari.view.intro;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.lat3uts_akb11_10116488_mamunbasyari.R;

public class SplashActivity extends AppCompatActivity {

    private int loading = 4000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent walkthough = new Intent(SplashActivity.this, WalkthroughActivity.class);
               startActivity(walkthough);
               finish();
            }
        },loading);
    }
}
