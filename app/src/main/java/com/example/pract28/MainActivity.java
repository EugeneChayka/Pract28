package com.example.pract28;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Получим ссылку на солнце
        ImageView sunImageView = findViewById(R.id.sun);
        // Анимация для восхода солнца
        Animation sunRiseAnimation = AnimationUtils.loadAnimation(this, R.anim.sun_rise);
        // Подключаем анимацию к нужному View
        sunImageView.startAnimation(sunRiseAnimation);
        // Получим ссылку на часы
        ImageView clockImageView = findViewById(R.id.clock);

        Animation clockTurnAnimation = AnimationUtils.loadAnimation(this, R.anim.clock_turn);
        clockImageView.startAnimation(clockTurnAnimation);
        // получим ссылку на часовую стрелку
        ImageView hourImageView = findViewById(R.id.hour_hand);

        Animation hourTurnAnimation = AnimationUtils.loadAnimation(this, R.anim.hour_turn);

        hourImageView.startAnimation(hourTurnAnimation);
    }
}