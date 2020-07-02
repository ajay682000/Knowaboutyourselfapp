package com.example.citcos2;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void zodic(View V){
        Intent i = new Intent(this,Zodic.class);
        startActivity(i);
    }
    public void date(View V){
        Intent i = new Intent(this,Date.class);
        startActivity(i);
    }
    public void blood(View V){
        Intent i = new Intent(this,BldGrp.class);
        startActivity(i);
    }
    public void death(View v){
        Intent i = new Intent(this,DeathCalculator.class);
        startActivity(i);
    }
    public void guess(View v){
        Intent i = new Intent(this,NumberGuess.class);
        startActivity(i);
    }
    public void friend(View V){
        Intent i = new Intent(this,FriendshipCalculator.class);
        startActivity(i);
    }





    @Override



    public void onBackPressed () {
        final AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setMessage("Are You Sure Want to Exit?");
        builder.setCancelable(true);
        builder.setPositiveButton("Yes",new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialogInterface, int i ) {
                finish();
            }
        } );
        builder.setNegativeButton("No!!" ,new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        }  );
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}
