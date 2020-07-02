package com.example.citcos2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Random;

public class FriendshipCalculator extends AppCompatActivity {

    EditText txt1,txt2;
    Button button1;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friendship_calculator);

        txt1 = (EditText) findViewById(R.id.txt1);
        txt2 = (EditText) findViewById(R.id.txt2);
        tv = (TextView) findViewById(R.id.tv);
        button1 = (Button) findViewById(R.id.button1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!txt2.getText().toString().equals("") && !txt1.getText().toString().equals("")){
                    String second = txt2.getText().toString();
                    String first = txt1.getText().toString();
                    Calendar c = Calendar.getInstance();
                    String day = String.valueOf(c.get(Calendar.DAY_OF_MONTH));
                    String month = String.valueOf(c.get(Calendar.MONTH));
                    String year = String.valueOf(c.get(Calendar.YEAR));

                    String result = first + second + day + month + year;
                    result = result.toLowerCase();
                    result = result.trim();

                    int seed = result.hashCode();
                    Random r = new Random(seed);

                    tv.setText((r.nextInt(100) + 1) + "%");


                }
            }
        });


    }
}
