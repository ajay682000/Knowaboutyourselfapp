package com.example.citcos2;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Date extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date);
    }

    public void one(View v) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(Date.this);
        builder.setMessage("Those who born on 1st\n\nYou are a very Friendly person.\nYou love the good things in life.\nYou are very ambitious.\nYou seek stable,long term relationship.\nYou have good leadership skills.\nIf you channel your efforts in right direction,you can go far in life");
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
    public void two(View v) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(Date.this);
        builder.setMessage("Those who born on 2nd\n\nYou are a very helpful person.\nYou make friends easily.\nYou tend to be very loving and caring in your relationships.\nYou are very optimistic and confident about the things you do.\nThis is a quality which will help you to get ahead in life.");
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
    public void three(View v) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(Date.this);
        builder.setMessage("Those who born on 3rd\n\nYou have a creative mind\nYou love to explore new places and learn about new things\n Your loved ones are very happy in your company\n You have big dreams in your life\n Try your best and you shall achieve them.");
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
    public void four(View v) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(Date.this);
        builder.setMessage("Those who are born on 4th\n\n YOu are someone who loves life.\nYour smiles are infectioius.\nYour motivational sprit is undeniable.\nYour are romantic at heart and will have a very good love life.\nMost of the time you are understanding individual but at times it is difficult to deal with.\nYou are totsl and trustworthy.\nYorr friends love you ");
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
    public void five(View v) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(Date.this);
        builder.setMessage("Those who born on 5th\n\nYou have a magnetic and pleasing personality and good sense of humour.\nPeople like you to be around them.\nYou tend to fall in love very fast.\nYou are emotional.\nYou love to wear fashionable and stylish clothes. ");
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
    public void six(View v) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(Date.this);
        builder.setMessage("Those who born on 6th\n\nYou are cheerful at heart.\nYou are enthusiastic about trying new things.\nYou have adventerous streak.\nAt the same time you are sensitive indivitual.\nYou can maintain friendship very well.\nYou are compassionate and caring for the peopele you love.\nYoou will accomplish alot in life.");
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

    public void seven(View v) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(Date.this);
        builder.setMessage("Those who born on 7th\n\nYou have a shy and likeable personality.\nYou are dependable person.\nYou like stability and peace in your life.\nYou are sincere in your work.\nWhen in love you become very romantic and mushy.\nYou like to lead a luxurious life.\nYou are faithful towards family an friends.");
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
    public void eight(View v) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(Date.this);
        builder.setMessage("Those who born on 8th\n\nYou have calm and humble personality.\nYou have chilled attitude towards life.\n You are usually quite jolly and love to crack jokes.\nYou are a profound thinker.\nYou believe in god and are spiritual in your way of living.\nYou are magnanimous person when required. ");
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
    public void nine(View v) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(Date.this);
        builder.setMessage("Those who born on 9th\n\nYou are a smart and stylish personality.\nThe opposite gender gets easily attracted to you.\nYou love the finer things in life.\nYou believe in living in the present.\nYou take very good care of your family and friends.\nIn a relationship, your partner is the apple of your life!");
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
    public void ten(View v) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(Date.this);
        builder.setMessage("Those who born on 10th\n\nYou are a very charismatic person.\nPeople love to be in touch with you.\nYou are self-sacrificing in your relationship.\nYou are like a coconut - tough exterior but tender & sensitive at heart.\nAt times,you love to indulge in artistic and creative ventures.\nTake care that people don't take advantage of your helpful nature");
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
    public void eleven(View v) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(Date.this);
        builder.setMessage("Those who born on 11th\n\nYou are warm and inviting personality.\nYou are amiable and love to make new friends.\nYou are quick to return favours from friends.\nYou love to crack jokes and spend long hours with friends.\nIn relationships,you seek to dominate your partner but in a non-threatening way.Ath the same time,you are very passionate in your relationships.");
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
    public void tweleve(View v) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(Date.this);
        builder.setMessage("You are a wise person known for your\n" +
                "humility. You are dedicated and sincere in\n" +
                "your studies/work. You are an emotional\n" +
                "lover. You tend to get possessive in your\n" +
                "relationships, but otherwise you are an easy\n" +
                "going and friendly person. You love to dress\n" +
                "well. You are realistic in the game of life.");
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
    public void thirteen(View v) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(Date.this);
        builder.setMessage("You are wise beyond your years. Your friends\n" +
                "turn to you whenever they need advice. You\n" +
                "care deeply for the people close to your\n" +
                "heart. You are a very good motivator. You\n" +
                "work very well in teams and are a team\n" +
                "player. You don't hold back your feelings and\n" +
                "are very expressive in love and romance.");
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
    public void fourteen(View v) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(Date.this);
        builder.setMessage("You were born to be a leader! You are cool in\n" +
                "difficult situations and inspire others in times\n" +
                "of crisis. You love travelling. You like to dress\n" +
                "in-sync with the latest fashion trends. You\n" +
                "love to be pampered by your loved one. You\n" +
                "prefer to be in a serious relationship. You are\n" +
                "faithful to your family.");
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
    public void fifteen(View v) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(Date.this);
        builder.setMessage("You have a very magnetic personality. You\n" +
                "always stand out in a crowd! You are usually\n" +
                "smiling and spreading cheer around. You are\n" +
                "serious about life. You have certain goals in\n" +
                "life which you want to reach and strive hard\n" +
                "to achieve them. You pour your everything\n" +
                "into a relationship. Sentiments are very\n" +
                "important for you.");
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
    public void sixteen(View v) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(Date.this);
        builder.setMessage("You have a patient and introspective\n" +
                "personality. You do things after thinking about\n" +
                "the pros and cons. You are kind and altruistic\n" +
                "by nature. You like to help others. Your\n" +
                "enthusiasm is infectious. Even though you\n" +
                "express your love to your partner only every\n" +
                "now and then you do take great care of them\n" +
                "and shower all of your attention on them\n");
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
    public void seventeen(View v) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(Date.this);
        builder.setMessage("You are not a very loud person. But at times\n" +
                "you can lose your temper very easily. You\n" +
                "have a creative bent in you. You like to\n" +
                "indulge in artistic ventures. You are mature\n" +
                "beyond your years. You try to be friends with\n" +
                "everyone. You are a born flirt. You prefer\n" +
                "independence and seek space in your love\n" +
                "relationships.");
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
    public void eighteen(View v) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(Date.this);
        builder.setMessage("You are a person who likes the outdoors. You\n" +
                "like spending time in peaceful, natural\n" +
                "surroundings. You are a dynamic person. You\n" +
                "cannot sit in one place for a long time. You\n" +
                "like dressing up for occasions. You prefer to\n" +
                "express your views openly. You are an exciting\n" +
                "person to fall in love with but you prefer to\n" +
                "be in a strong, long-term relationship only.");
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
    public void nineteen(View v) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(Date.this);
        builder.setMessage("You are attractive with an impeccable sense\n" +
                "of fashion. You have more friends of the\n" +
                "opposite sex than your own. You are a jolly\n" +
                "person with a great sense of humour. This is\n" +
                "why people want to spend time with you.\n" +
                "Someone will fall in love with you because\n" +
                "of your enthusiastic, understanding, and\n" +
                "free-spirited nature.");
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
    public void twenty(View v) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(Date.this);
        builder.setMessage("You are a person who is liked by one and all.\n" +
                "You are innocent and very friendly. Try not to\n" +
                "be too gullible. You have a sensitive side\n" +
                "which very few people close to you know\n" +
                "about. Members of your own sex are jealous\n" +
                "of you because of how easily you mix with\n" +
                "the opposite sex.");
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
    public void twentyone(View v) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(Date.this);
        builder.setMessage("You love life to the fullest and don't worry\n" +
                "about tomorrow. You like to be as\n" +
                "independent as possible. You confront\n" +
                "obstacles in life by giving your best. You are a\n" +
                "beautiful person. You are fun to be with.\n" +
                "Someone will fall in love with you for the\n" +
                "intimacy and affection you tend to show.");
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
    public void twentytwo(View v) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(Date.this);
        builder.setMessage("Even though you are not very extroverted, you\n" +
                "mix very well with people once you get to\n" +
                "know them a bit. You are a devout person.\n" +
                "You are someone that is known for your\n" +
                "intelligence. At times, you crave attention. You\n" +
                "love the company of your friends and cherish\n" +
                "the time you spend with them. You will find\n" +
                "bliss with the person you love most in your life.");
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
    public void twentythree(View v) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(Date.this);
        builder.setMessage("You are a happy-go-lucky person. You take life\n" +
                "as it comes. Family and friends are very\n" +
                "important to you. You are known for your wit.\n" +
                "You possess the talent to master one of the\n" +
                "arts. Try to find your artistic ability of you\n" +
                "haven't yet. You are very thoughtful and care\n" +
                "for your partner when in a relationship.");
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
    public void twentyfour(View v) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(Date.this);
        builder.setMessage("You are a stable and a responsible person.\n" +
                "People know that they can depend on you.\n" +
                "When in love, you are very charming and\n" +
                "affectionate towards your partner. You try to\n" +
                "remain active as much as possible. You are\n" +
                "sincere in your work/studies but if you put in\n" +
                "more effort you can be very successful.");
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
    public void twentyfive(View v) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(Date.this);
        builder.setMessage("You are a friendly and loveable person. You\n" +
                "try not to antagonize others by being\n" +
                "diplomatic. You are very generous towards\n" +
                "the underprivileged. You are ambitious and\n" +
                "wish to achieve lots of things in life. Be open\n" +
                "minded and try to do your best...you will\n" +
                "reach your goals soon! When in love, you\n" +
                "become very romantic, mushy and caring.\n");
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
    public void twentysix(View v) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(Date.this);
        builder.setMessage("You are a frank and expressive person. You\n" +
                "do what your heart tells you to do. You do\n" +
                "not care much about what others say. You\n" +
                "maintain a calm exterior. You don't lose your\n" +
                "temper easily. You love to explore new\n" +
                "places and learn about new things. You like\n" +
                "to flirt and your flirting will get you the\n" +
                "love of your life!\n");
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
    public void twentyseven(View v) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(Date.this);
        builder.setMessage("You have an attractive and vibrant\n" +
                "personality. You are a social animal and like\n" +
                "to party! You make new friends very easily.\n" +
                "You are known for your good sense of\n" +
                "humour. At times you are very obstinate. You\n" +
                "\n" +
                "can forgive but you don't forget easily. In your\n" +
                "love life, you tend to be choosy in your search\n" +
                "for the perfect partner.\n");
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
    public void twentyeight(View v) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(Date.this);
        builder.setMessage("You are a star! Your joyful attitude towards\n" +
                "life is unmatched. You are very talkative,\n" +
                "but at the same time quite attentive. You\n" +
                "love luxury. You are in sync with the latest\n" +
                "fashion trends and groom yourself well.\n" +
                "At times you get too emotional.\n" +
                "You cherish loyalty.");
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
    public void twentynine(View v) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(Date.this);
        builder.setMessage("You are an optimistic person and like to\n" +
                "motivate others. You do not take many risks\n" +
                "and adopt to a cautious approach before\n" +
                "trying anything new. In your free time you\n" +
                "are lively and relaxed. You like to chill out\n" +
                "with friends whenever you get the chance.\n" +
                "You are very passionate in love and make\n" +
                "your partner feel on top of the world!\n" +
                "[");
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
    public void thirty(View v) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(Date.this);
        builder.setMessage("You have a sexy and mysterious personality,\n" +
                "Because of this the opposite sex love to be\n" +
                "around you. You are very sociable and\n" +
                "amiable. You have good leadership skills and\n" +
                "\n" +
                "this will help you in your workplace. You\n" +
                "weigh pros and cons before taking any\n" +
                "decisions. You want your partner to be good\n" +
                "looking, dynamic and humorous.\n");
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
    public void thirtyone(View v) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(Date.this);
        builder.setMessage("You are a simple and honest person. You\n" +
                "don't like too many frills. You have a creative\n" +
                "mind. If you channel your talents in the right\n" +
                "direction, you can succeed easily. You have a\n" +
                "\n" +
                "warm and compassionate personality which\n" +
                "others like very much. You are easily\n" +
                "approachable. You need a lot of time to commit\n" +
                "in a relationship. You do not get too possessive");
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
