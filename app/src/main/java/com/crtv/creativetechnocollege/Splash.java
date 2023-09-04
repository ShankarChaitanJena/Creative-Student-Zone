package com.crtv.creativetechnocollege;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.creativetechnocollege.R;

public class Splash extends AppCompatActivity {
    ImageView logo,tclogo;
    TextView txt , txt2;
    Animation logo_animation , tc_anim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        logo = findViewById(R.id.imageView);
        tclogo = findViewById(R.id.imageView2);
        txt = findViewById(R.id.textView);
        txt2 = findViewById(R.id.textView2);


        logo_animation = AnimationUtils.loadAnimation(this,R.anim.logo_anim);
        logo.setAnimation(logo_animation);

        tc_anim = AnimationUtils.loadAnimation(this,R.anim.anim2);
        tc_anim.setStartOffset(2200);

        tclogo.setAnimation(tc_anim);
        txt.setAnimation(tc_anim);
        txt2.setAnimation(tc_anim);

        Intent home = new Intent(Splash.this,MainActivity.class);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(home);
                finish();
            }
        },4000);

    }
}