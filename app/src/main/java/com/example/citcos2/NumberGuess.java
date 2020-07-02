package com.example.citcos2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NumberGuess extends AppCompatActivity {

    private TextView txt_view;
    private Button higher,yes,lower,ok;

    private int tries = 0;
    private int left = 1,right = 1000;
    private int mid;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_guess);

        txt_view = (TextView) findViewById(R.id.txt_view);
        higher = (Button) findViewById(R.id.higher);
        lower = (Button) findViewById(R.id.lower);
        yes = (Button) findViewById(R.id.yes);
        ok = (Button) findViewById(R.id.ok);

        yes.setVisibility(View.INVISIBLE);
        higher.setVisibility(View.INVISIBLE);
        lower.setVisibility(View.INVISIBLE);

        txt_view.setText("Think of a number between 1 to 1000 and i will  guess that in 10 guesses");

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                yes.setVisibility(View.VISIBLE);
                higher.setVisibility(View.VISIBLE);
                lower.setVisibility(View.VISIBLE);
                ok.setVisibility(View.INVISIBLE);

                guess();

            }
        });

        lower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                right = mid - 1;
                guess();
            }
        });

        higher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                left = mid + 1;
                guess();
            }
        });

        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_view.setText("WOW!! I guessed in " + tries + "moves");

                yes.setVisibility(View.INVISIBLE);
                higher.setVisibility(View.INVISIBLE);
                lower.setVisibility(View.INVISIBLE);
                ok.setVisibility(View.VISIBLE);

                ok.setText("New Game");

                tries = 0;
                left = 1;
                right = 1000;

            }
        });

    }

    private void guess(){
        mid = (left + right) / 2;
        tries++;
        txt_view.setText("My guess is" + mid + "\nIf the number you thought was higher than my guess then click higher otherwise click lower.\nIf both are equal click yes");
    }
}
