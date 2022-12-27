package com.Project2.personaken;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toolbar;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public
class Quiz extends Dashboard {

    private
    RecyclerView recyclerView;
    @Override
    public
    void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_quiz );
        Toolbar toolbar = findViewById ( R.id.toolbar );

        setSupportActionBar (toolbar );
        getSupportActionBar ( ).setTitle ( "level" );
        getSupportActionBar ( ).setDisplayHomeAsUpEnabled ( true );

        recyclerView = findViewById ( R.id.rv);
        LinearLayoutManager layoutManager = new LinearLayoutManager ( this );
        layoutManager.setOrientation ( RecyclerView.VERTICAL );

        recyclerView.setLayoutManager ( layoutManager );

        List<quizcategmodel> list=new ArrayList<> (  );
        list.add ( new quizcategmodel ("","Entrance"  ) );
        list.add ( new quizcategmodel ("","Beginner"  ) );
        list.add ( new quizcategmodel ("","Medium"  ) );
        list.add ( new quizcategmodel ("","Advance"  ) );
        list.add ( new quizcategmodel ("","Expert"  ) );

        categoryAdapter adapter=new categoryAdapter ( list );
        recyclerView.setAdapter ( adapter );

    }
    @Override
    public boolean onOptionsItemSelected( @NonNull MenuItem item ){
        if(item.getItemId ()==android.R.id.home){
            finish ();
        }
        return super.onOptionsItemSelected ( item );
    }


    public
    void setSupportActionBar ( Toolbar supportActionBar ) {

    }
}