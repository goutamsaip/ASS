package com.example.nikhilreddy.ass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FaqActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq);

        final ArrayList<Item> faqList = new ArrayList<>();

        faqList.add(new Item("1","F.A.Q   1"));
        faqList.add(new Item("2","F.A.Q   2"));
        faqList.add(new Item("3","F.A.Q   3"));
        faqList.add(new Item("4","F.A.Q   4"));
        faqList.add(new Item("5","F.A.Q   5"));
        faqList.add(new Item("6","F.A.Q   6"));
        faqList.add(new Item("7","F.A.Q   7"));
        faqList.add(new Item("8","F.A.Q   8"));
        faqList.add(new Item("9","F.A.Q   9"));
        faqList.add(new Item("10","F.A.Q   10"));

        ListView listView = (ListView) findViewById(R.id.list_view);
        ChapterAdapter chapterAdapter = new ChapterAdapter(FaqActivity.this,faqList,R.color.green);
        listView.setAdapter(chapterAdapter);

    }
}
