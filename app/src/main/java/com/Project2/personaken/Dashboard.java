package com.Project2.personaken;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public
class Dashboard extends Login {

    private
    Button quizb;

    @Override
    public
    void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_dashboard );
        quizb=findViewById ( (R.id.quizb) );

        quizb.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public
            void onClick ( View v ) {
                Intent categoryIntent =new Intent ( Dashboard.this,Quiz.class );
                startActivity ( categoryIntent );
            }
        } );
    }
}