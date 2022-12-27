package com.Project2.personaken;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public
class signup extends Login{

    TextInputLayout regname,regusername,regemail,regphoneno,regPassword;
    Button regbtn,regtologinbtn;

    FirebaseDatabase rootNode;

    DatabaseReference refrence;

    @Override
    public
    void onCreate ( Bundle savedInstanceState , Intent intent ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_signup );
    regname=findViewById ( R.id.name );
    regusername=findViewById ( R.id.username );
    regemail=findViewById ( R.id.email );
    regphoneno=findViewById ( R.id.phone );
    regPassword=findViewById ( R.id.password );
    regbtn=findViewById ( R.id.regbtn );
    regtologinbtn=findViewById ( R.id.signuptologin );


    regbtn.setOnClickListener ( new View.OnClickListener ( ) {
        @Override
        public
        void onClick ( View v ) {
 rootNode= FirebaseDatabase.getInstance ();
 refrence= rootNode.getReference ("users" );

 String name =regname.getEditText ().getText ().toString();
            String username =regname.getEditText ().getText ().toString();
            String email =regname.getEditText ().getText ().toString();
            String phoneNo=regname.getEditText ().getText ().toString();
            String password=regname.getEditText ().getText ().toString();


 userhelper helperClass= new userhelper (name,username,email,phoneNo,password  );

 refrence.setValue ( "First data storage" );


        }
    } );
    }
}