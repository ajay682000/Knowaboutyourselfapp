package com.example.citcos2;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Zodic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zodic);
    }

    public void aries(View v) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(Zodic.this);
        builder.setMessage("You can become extraordinary leader.\nYou are not silent.\nFocused and dedicated people.\nYou only care the people who care you.\nThey constantly require others to motivate them to get going and do their best.");
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

    public void taurus(View v) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(Zodic.this);
        builder.setMessage("Practical,Artistic,Loyal,Stable and Trustworthy.\nDedicated in their work and relationship alike.\nThey love to write,sing and read.\nLove to maintain and nurture their friendship but they are lazy ,most possessive an stubborn");
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

    public void gemini(View v) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(Zodic.this);
        builder.setMessage("GEMINI-BORN ARE CHEERFUL, TACTFUL, ENTHUSIASTIC,\n" +
                "DIPLOMATIC, VERSATILE AND GOOD TALKERS.\n" +
                "\n" +
                "THEY LOVE TO TALK AND LISTEN..\n" +
                "THEY LOVE TO COLLECT INFORMATION FROM OTHERS.\n" +
                "BUT THEY'RE THE PERSONS WHO DON'T HAVE LONG RELATIONSHIPS\n" +
                "\n" +
                "AND THEY SEARCH FOR NEW PERSONS..\n");
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
    public void cancer(View v) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(Zodic.this);
        builder.setMessage("THEYRE KNOWN FOR VERY UNPREDICTABLE, INDECISIVE,\n" +
                "\n" +
                "TEMPERAMENTAL, AND INSECURE\n" +
                "THEY ARE RATHER EMOTIONAL AND SENSITIVE ONLY ADDS\n" +
                "\n" +
                "TO THEIR VULNERABILITY\n" +
                "THEY PROFOUNDLY FEAR REJECTION BY THEIR LOVED\n" +
                "\n" +
                "ONES AND ARE PRONE TO GET HURT EASILY\n" +
                "MOST SENSITIVE AND THEY BELIEVE EVERYONE EASILY\n");
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

    public void leo(View v) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(Zodic.this);
        builder.setMessage("MAGNANIMOUSNESS, SELF-AWARENESS,\n" +
                "DIGNITY, EXHIBITING MAJESTY OR GRAND, OPTIMISM,\n" +
                "\n" +
                "ROMANTIC, ARISTOCRAT, DEDICATED...\n" +
                "LEADING QUALITY AND CROWD ATTRACTOR..\n" +
                "THEY'RE HONEST AND CHARISMATIC INDIVIDUALS..\n" +
                "\n" +
                "AND ROMANTIC PERSONALITIES\n");
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

    public void virgo(View v) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(Zodic.this);
        builder.setMessage("THEY HAVE MESMERIZING VOICE AND SPEECH\n" +
                "\n" +
                "EMOTIONAL AND SENTIMENTAL ADDICTS\n" +
                "THEY GET ANGRY EASILY AND ASK APOLOGIZE QUICKLY\n" +
                "\n" +
                "ROMANTIC AND LOVEABLE CHARACTER\n" +
                "EGOIST BUT MOST CARING PERSONALITIES\n");
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
    public void libra(View v) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(Zodic.this);
        builder.setMessage("THE LIBRA-BORN ARE VERY BALANCED BY NATURE, DIPLOMATIC,\n" +
                "\n" +
                "JUST AND CHARMING TO THE CORE.\n" +
                "THEY ARE ATTRACTIVE PEOPLE, AND THEIR COOL AND\n" +
                "CALM TEMPERAMENT ATTRACTS ATTENTION WHEREVER THEY GO.\n" +
                "\n" +
                "IT IS VERY DIFFICULT FOR THEM TO SAY\n" +
                "'NO TO ANY REQUEST THAT PEOPLE MAY MAKE TO THEM..\n" +
                "THEY AVOID UNNECESSARY THINGS AND ARGUMENTS\n");
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
    public void scorpio(View v) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(Zodic.this);
        builder.setMessage("SCORPIO-BORN ARE SINCERE, BRAVE, AND AT TIMES STUBBORN;\n" +
                "\n" +
                "THEY ARE INTENSE AND PASSIONATE PEOPLE.\n" +
                "THEY LIKE TO BELIEVE THAT THEY ARE IN FULL CONTROL OF THEIR\n" +
                "\n" +
                "DESTINY AND THEY HAVE STRONG WILL POWER\n" +
                "THEY OWN A MAGNETIC CHARM AND THEY'RE MYSTERY INDIVIDUALS\n" +
                "\n" +
                "IN LOVE, SCORPIO MAKES FOR A LOVING,\n" +
                "FAITHFUL YET DEEPLY POSSESSIVE OR JEALOUS PARTNERS\n");
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

    public void saggitarius(View v) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(Zodic.this);
        builder.setMessage("FRANK, COURAGEOUS, KIND AND GENEROUS..\n" +
                "DEEPLY INVOLVED IN CULTURE, INTELLECTUAL AND CREATIVE\n" +
                "\n" +
                "PURSUITS, TRAVEL AND EVEN SELF-PRAISE.\n" +
                "THEIR WORDS WILL BE LIKE A ARROW FROM THE BOW.\n" +
                "FOCUS MINDED AND FAST APPROACHING\n");
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
    public void capricorn(View v) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(Zodic.this);
        builder.setMessage("THEY ARE AMBITIOUS, CONSERVATIVE, DETERMINED,\n" +
                "PRACTICAL AND HELPFUL. THEY MAKE GOOD TEAM LEADERS\n" +
                "AND ORGANISERS, BECAUSE OF THEIR SINGLE-MINDED FOCUS\n" +
                "ON THEIR WORK, SENSE OF RESPONSIBILITY AND SINCERITY.\n" +
                "THEY'RE KIND AND THE SAME TIME STRONG HEARTED..\n" +
                "AND DEFINITELY THEY WILL FIGHT UNTIL THEY WIN..");
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

    public void aquarius(View v) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(Zodic.this);
        builder.setMessage("THEY ARE PROGRESSIVE AND MODERN A LOT..\n" +
                "\n" +
                "TRUTH SEEKERS AND BROAD MINDED..\n" +
                "BUT THEY RE THE PERSONS WHO TALK CUT AND DRIED.\n" +
                "\n" +
                "SO FEW ONLY WILL BE VERY CLOSE TO THEM..\n" +
                "\n" +
                "THEY'RE THE PERSONS WHO RAISE VOICE AGAINST PROBLEMS.\n");
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
    public void pisces(View v) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(Zodic.this);
        builder.setMessage("THEY ARE LOVELY, MYSTICAL AND COMPASSIONATE BEINGS..\n" +
                "\n" +
                "THEY ARE SELFLESS, SPIRITUAL AND\n" +
                "FOCUSSED ON THE SOUL'S JOURNEY TOWARDS SALVATION..\n" +
                "THEY'RE DREAMERS AND WHO DON'T WANT TO TAKE RISK..\n" +
                "THEY'RE SOFT HEARTED AND CONFUSED MINEDED..");
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
