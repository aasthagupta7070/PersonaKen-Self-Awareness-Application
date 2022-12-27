package com.Project2.personaken;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

public class Login extends MainActivity{
 Button callsignup,login_btn,forgetpassword;
 ImageView logoimg;
 TextView logoname,slogan;
 TextInputLayout username,password;
    @Override
    public
    void onCreate ( Bundle savedInstanceState ,Intent intent ) {
        super.onCreate ( savedInstanceState  );
        getWindow ( ).setFlags ( WindowManager.LayoutParams.FLAG_FULLSCREEN , WindowManager.LayoutParams.FLAG_FULLSCREEN );
        setContentView ( R.layout.activity_login );

        callsignup=findViewById ( R.id.callsignup);
        logoimg=findViewById ( R.id.logoimg );
        logoname =findViewById ( R.id.logoname );
        slogan=findViewById ( R.id.slogan );
        username=findViewById ( R.id.username );
        password=findViewById ( R.id.password );
        login_btn=findViewById ( R.id .login_btn);
        forgetpassword=findViewById ( R.id.forgetpassword );

        callsignup.setOnClickListener ( (view)->{
            Intent intent1 =new Intent ( Login.this,signup.class );

        } );
        login_btn.setOnClickListener ( (view)->{
            Intent intent1 =new Intent ( Login.this,Dashboard.class );

        } );
        forgetpassword.setOnClickListener ( (view)->{
            Intent intent1 =new Intent ( Login.this,signup.class );

        } );
    }


}