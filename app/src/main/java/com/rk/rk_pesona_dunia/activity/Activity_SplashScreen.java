package com.rk.rk_pesona_dunia.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.rk.rk_pesona_dunia.R;

public class Activity_SplashScreen extends AppCompatActivity {

    public int durasiMemuat = 3000;
    public Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                i = new Intent(Activity_SplashScreen.this, Activity_Negara.class);
                startActivity(i);
                finish();
            }
        }, durasiMemuat);
    }
}