package com.example.nikhilreddy.ass;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final CardView tutorialcard = (CardView) findViewById(R.id.tutorialcard);
        final LinearLayout tutoriallayout = (LinearLayout) findViewById(R.id.tutoriallayout);
        final LinearLayout tutorialoptionslayout = (LinearLayout) findViewById(R.id.tutorialoptionslayout);
        final LinearLayout beginnertutoriallayout = (LinearLayout) findViewById(R.id.beginnertutoriallayout);
        final LinearLayout intermediatetutoriallayout = (LinearLayout) findViewById(R.id.intermediatetutoriallayout);
        final LinearLayout advancedtutoriallayout = (LinearLayout) findViewById(R.id.advancedtutoriallayout);
        final CardView articlescard = (CardView) findViewById(R.id.articlescard);
        final LinearLayout articleslayout = (LinearLayout) findViewById(R.id.articleslayout);
        final CardView faqcard = (CardView) findViewById(R.id.faqcard);
        final LinearLayout faqlayout = (LinearLayout) findViewById(R.id.faqlayout);
        final CardView quizcard = (CardView) findViewById(R.id.quizcard);
        final LinearLayout quizlayout = (LinearLayout) findViewById(R.id.quizlayout);
        final LinearLayout quizoptionslayout = (LinearLayout) findViewById(R.id.quizoptionslayout);
        final LinearLayout easyquizlayout = (LinearLayout) findViewById(R.id.easyquizlayout);
        final LinearLayout mediumquizlayout = (LinearLayout) findViewById(R.id.mediumquizlayout);
        final LinearLayout hardquizlayout = (LinearLayout) findViewById(R.id.hardquizlayout);

        final Intent beginnertut_intent = new Intent(this, BeginnerTutorialActivity.class);
        final Intent intermediatetut_intent = new Intent(this, IntermediateTutorialActivity.class);
        final Intent advancedtut_intent = new Intent(this, AdvancedTutorialActivity.class);
        final Intent easyquiz_intent = new Intent(this, EasyQuizActivity.class);
        final Intent mediumquiz_intent = new Intent(this, MediumQuizActivity.class);
        final Intent hardquiz_intent = new Intent(this, HardQuizActivity.class);
        final Intent articles_intent = new Intent(this, ArticlesActivity.class);
        final Intent faq_intent = new Intent(this, FaqActivity.class);

        tutorialcard.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if(tutoriallayout.getVisibility() == View.VISIBLE) {
                    tutoriallayout.setVisibility(View.GONE);
                    tutorialoptionslayout.setVisibility(View.VISIBLE);
                    quizlayout.setVisibility(View.VISIBLE);
                    quizoptionslayout.setVisibility(View.GONE);
                } else {
                    tutoriallayout.setVisibility(View.VISIBLE);
                    tutorialoptionslayout.setVisibility(View.GONE);
                }
            }
        });
        articlescard.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                tutoriallayout.setVisibility(View.VISIBLE);
                tutorialoptionslayout.setVisibility(View.GONE);
                quizlayout.setVisibility(View.VISIBLE);
                quizoptionslayout.setVisibility(View.GONE);

            }
        });
        faqcard.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                tutoriallayout.setVisibility(View.VISIBLE);
                tutorialoptionslayout.setVisibility(View.GONE);
                quizlayout.setVisibility(View.VISIBLE);
                quizoptionslayout.setVisibility(View.GONE);

            }
        });
        quizcard.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if(quizlayout.getVisibility() == View.VISIBLE) {
                    tutoriallayout.setVisibility(View.VISIBLE);
                    tutorialoptionslayout.setVisibility(View.GONE);
                    quizlayout.setVisibility(View.GONE);
                    quizoptionslayout.setVisibility(View.VISIBLE);
                } else {
                    quizlayout.setVisibility(View.VISIBLE);
                    quizoptionslayout.setVisibility(View.GONE);
                }
            }
        });
        beginnertutoriallayout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                startActivity(beginnertut_intent);
            }
        });
        intermediatetutoriallayout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                startActivity(intermediatetut_intent);
            }
        });
        advancedtutoriallayout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                startActivity(advancedtut_intent);
            }
        });
        easyquizlayout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                startActivity(easyquiz_intent);
            }
        });
        mediumquizlayout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                startActivity(mediumquiz_intent);
            }
        });
        hardquizlayout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                startActivity(hardquiz_intent);
            }
        });
        articleslayout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                startActivity(articles_intent);
            }
        });
        faqlayout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                startActivity(faq_intent);
            }
        });
    }
}
