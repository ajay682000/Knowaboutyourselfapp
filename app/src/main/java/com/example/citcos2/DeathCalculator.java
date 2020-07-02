package com.example.citcos2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.Random;

public class DeathCalculator extends AppCompatActivity {

    EditText name , age;
    RadioButton rb_male, rb_female;
    RadioButton rb_smoke_yes, rb_smoke_no;
    RadioButton rb_drugs_yes, rb_drugs_no;
    Button b_calculate;
    TextView tv_result;

    Random r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_death_calculator);
        name = findViewById(R.id.name);
        age = findViewById(R.id.age);
        rb_male = findViewById(R.id.rb_male);
        rb_female = findViewById(R.id.rb_female);
        rb_smoke_yes = findViewById(R.id.rb_smoke_yes);
        rb_smoke_no = findViewById(R.id.rb_smoke_no);
        rb_drugs_yes = findViewById(R.id.rb_drugs_yes);
        rb_drugs_no = findViewById(R.id.rb_drugs_no);
        tv_result = findViewById(R.id.tv_result);
        b_calculate = findViewById(R.id.b_calculate);

        r = new Random();

        name.setText("");
        age.setText("");
        rb_male.setChecked(true);
        rb_female.setChecked(false);

        rb_smoke_yes.setChecked(true);
        rb_smoke_no.setChecked(false);

        rb_drugs_yes.setChecked(true);
        rb_drugs_no.setChecked(false);

        tv_result.setText("");

        rb_male.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View V){
                rb_male.setChecked(true);
                rb_female.setChecked(false);

            }
        });

        rb_female.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View V){
                rb_male.setChecked(false);
                rb_female.setChecked(true);

            }
        });

        rb_smoke_yes.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View V){
                rb_smoke_yes.setChecked(true);
                rb_smoke_no.setChecked(false);

            }
        });

        rb_smoke_no.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View V){
                rb_smoke_yes.setChecked(false);
                rb_smoke_no.setChecked(true);

            }
        });

        rb_drugs_yes.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View V){
                rb_drugs_yes.setChecked(true);
                rb_drugs_no.setChecked(false);

            }
        });

        rb_drugs_no.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View V){
                rb_drugs_yes.setChecked(false);
                rb_drugs_no.setChecked(true);

            }
        });

        b_calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                if(!name.getText().toString().equals("") && !age.getText().toString().equals("")){
                    int currentAge = Integer.parseInt(age.getText().toString());
                    if(currentAge<20){
                        currentAge = 20;
                    }
                    int seed = name.getText().toString().hashCode();
                    r.setSeed(seed);

                    int ageofDying = r.nextInt(120 - currentAge) + currentAge;

                    boolean isMale = rb_male.isChecked();
                    boolean isSmokeing = rb_smoke_yes.isChecked();
                    boolean isTakingDrugs = rb_drugs_yes.isChecked();

                    if(isMale){
                        ageofDying = ageofDying - 5;
                    }

                    if(isSmokeing){
                        ageofDying = ageofDying - 8;
                    }

                    if(isTakingDrugs){
                        ageofDying = ageofDying - 10;
                    }

                    if(ageofDying <= currentAge){
                        ageofDying = currentAge + 10;
                    }

                    tv_result.setText("" + ageofDying);

                }
            }
        });
    }
}





