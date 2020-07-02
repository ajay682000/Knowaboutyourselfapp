package com.example.citcos2;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BldGrp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bld_grp);
    }
    public void apos(View v) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(BldGrp.this);
        builder.setMessage("Your blood group is A Positive\n\nYou have a good leadership qualities");
        builder.setCancelable(true);

        builder.setNegativeButton("GO BACK" ,new DialogInterface.OnClickListener(){

            @Override

            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        }  );
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
    public void aneg(View v) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(BldGrp.this);
        builder.setMessage("Your blood group is A Negative\n\nYou are a Hardworking person");
        builder.setCancelable(true);

        builder.setNegativeButton("GO BACK" ,new DialogInterface.OnClickListener(){

            @Override

            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        }  );
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
    public void bpos(View v) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(BldGrp.this);
        builder.setMessage("Your blood group is B Positive\n\nYou will sacrifice for others");
        builder.setCancelable(true);

        builder.setNegativeButton("GO BACK" ,new DialogInterface.OnClickListener(){

            @Override

            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        }  );
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
    public void bneg(View v) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(BldGrp.this);
        builder.setMessage("Your blood group is B Negative\n\nYor are Non-Flexible, Selfish and sadistic");
        builder.setCancelable(true);

        builder.setNegativeButton("GO BACK" ,new DialogInterface.OnClickListener(){

            @Override

            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        }  );
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
    public void abpos(View v) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(BldGrp.this);
        builder.setMessage("Your blood group is AB Positive\n\nYou are very difficult to understand");
        builder.setCancelable(true);

        builder.setNegativeButton("GO BACK" ,new DialogInterface.OnClickListener(){

            @Override

            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        }  );
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
    public void abneg(View v) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(BldGrp.this);
        builder.setMessage("Your blood group is AB Negative\n\nYou are Sharp and Intelligent");
        builder.setCancelable(true);

        builder.setNegativeButton("GO BACK" ,new DialogInterface.OnClickListener(){

            @Override

            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        }  );
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
    public void opos(View v) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(BldGrp.this);
        builder.setMessage("Your blood group is O Positive\n\nYou are Born to help");
        builder.setCancelable(true);

        builder.setNegativeButton("GO BACK" ,new DialogInterface.OnClickListener(){

            @Override

            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        }  );
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
    public void oneg(View v) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(BldGrp.this);
        builder.setMessage("Your blood group is O Negative\n\nYou are a narrow minded person");
        builder.setCancelable(true);

        builder.setNegativeButton("GO BACK" ,new DialogInterface.OnClickListener(){

            @Override

            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        }  );
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}
