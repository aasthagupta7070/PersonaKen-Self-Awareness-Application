package com.Project2.personaken;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public abstract
class MainActivity extends AppCompatActivity {
    public static int SPLASH_SCREEN =5000;
    Animation top_animation, down_animation, right_animation, left_animation;
    ImageView logo;
    TextView pers;
    TextView ken;
    TextView slogan;


    @Override
    public
    void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        getWindow ( ).setFlags ( WindowManager.LayoutParams.FLAG_FULLSCREEN , WindowManager.LayoutParams.FLAG_FULLSCREEN );
        setContentView ( R.layout.activity_main );

        top_animation = AnimationUtils.loadAnimation ( this , R.anim.top_animation );
        down_animation = AnimationUtils.loadAnimation ( this , R.anim.down_animation );
        left_animation = AnimationUtils.loadAnimation ( this , R.anim.left_animation );
        right_animation = AnimationUtils.loadAnimation ( this , R.anim.right_animation );

        logo = findViewById ( R.id.logo );
        pers = findViewById ( R.id.pers );
        ken = findViewById ( R.id.ken );
        slogan = findViewById ( R.id.slogan );

        logo.setAnimation ( top_animation );
        pers.setAnimation ( left_animation );
        ken.setAnimation ( right_animation );
        slogan.setAnimation ( down_animation );


        boolean b = new Handler ( ).postDelayed ( () -> {
                                                      Intent intent1 = new Intent ( MainActivity.this , Login.class );
                                                  } ,
                                                  SPLASH_SCREEN );
    }

    public abstract
    void onCreate ( Bundle savedInstanceState , Intent intent );
}

