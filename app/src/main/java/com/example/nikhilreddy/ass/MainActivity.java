package com.example.nikhilreddy.ass;

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
        final CardView articlescard = (CardView) findViewById(R.id.articlescard);
        final LinearLayout articleslayout = (LinearLayout) findViewById(R.id.articleslayout);
        final LinearLayout articlesoptionslayout = (LinearLayout) findViewById(R.id.articlesoptionslayout);
        final CardView faqcard = (CardView) findViewById(R.id.faqcard);
        final LinearLayout faqlayout = (LinearLayout) findViewById(R.id.faqlayout);
        final LinearLayout faqoptionslayout = (LinearLayout) findViewById(R.id.faqoptionslayout);
        final CardView quizcard = (CardView) findViewById(R.id.quizcard);
        final LinearLayout quizlayout = (LinearLayout) findViewById(R.id.quizlayout);
        final LinearLayout quizoptionslayout = (LinearLayout) findViewById(R.id.quizoptionslayout);

        tutorialcard.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if(tutoriallayout.getVisibility() == View.VISIBLE) {
                    tutoriallayout.setVisibility(View.GONE);
                    tutorialoptionslayout.setVisibility(View.VISIBLE);
                    articleslayout.setVisibility(View.VISIBLE);
                    articlesoptionslayout.setVisibility(View.GONE);
                    faqlayout.setVisibility(View.VISIBLE);
                    faqoptionslayout.setVisibility(View.GONE);
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
                if(articleslayout.getVisibility() == View.VISIBLE) {
                    tutoriallayout.setVisibility(View.VISIBLE);
                    tutorialoptionslayout.setVisibility(View.GONE);
                    articleslayout.setVisibility(View.GONE);
                    articlesoptionslayout.setVisibility(View.VISIBLE);
                    faqlayout.setVisibility(View.VISIBLE);
                    faqoptionslayout.setVisibility(View.GONE);
                    quizlayout.setVisibility(View.VISIBLE);
                    quizoptionslayout.setVisibility(View.GONE);
                } else {
                    articleslayout.setVisibility(View.VISIBLE);
                    articlesoptionslayout.setVisibility(View.GONE);
                }
            }
        });
        faqcard.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if(faqlayout.getVisibility() == View.VISIBLE) {
                    tutoriallayout.setVisibility(View.VISIBLE);
                    tutorialoptionslayout.setVisibility(View.GONE);
                    articleslayout.setVisibility(View.VISIBLE);
                    articlesoptionslayout.setVisibility(View.GONE);
                    faqlayout.setVisibility(View.GONE);
                    faqoptionslayout.setVisibility(View.VISIBLE);
                    quizlayout.setVisibility(View.VISIBLE);
                    quizoptionslayout.setVisibility(View.GONE);
                } else {
                    faqlayout.setVisibility(View.VISIBLE);
                    faqoptionslayout.setVisibility(View.GONE);
                }
            }
        });
        quizcard.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if(quizlayout.getVisibility() == View.VISIBLE) {
                    tutoriallayout.setVisibility(View.VISIBLE);
                    tutorialoptionslayout.setVisibility(View.GONE);
                    articleslayout.setVisibility(View.VISIBLE);
                    articlesoptionslayout.setVisibility(View.GONE);
                    faqlayout.setVisibility(View.VISIBLE);
                    faqoptionslayout.setVisibility(View.GONE);
                    quizlayout.setVisibility(View.GONE);
                    quizoptionslayout.setVisibility(View.VISIBLE);
                } else {
                    quizlayout.setVisibility(View.VISIBLE);
                    quizoptionslayout.setVisibility(View.GONE);
                }
            }
        });
    }
}
