package com.example.nikhilreddy.ass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class BeginnerTutorialActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq);

        final ArrayList<Item> beginnerList = new ArrayList<>();

        beginnerList.add(new Item("1","Chapter 1"));
        beginnerList.add(new Item("2","Chapter 2"));
        beginnerList.add(new Item("3","Chapter 3"));
        beginnerList.add(new Item("4","Chapter 4"));
        beginnerList.add(new Item("5","Chapter 5"));
        beginnerList.add(new Item("6","Chapter 6"));
        beginnerList.add(new Item("7","Chapter 7"));
        beginnerList.add(new Item("8","Chapter 8"));
        beginnerList.add(new Item("9","Chapter 9"));
        beginnerList.add(new Item("10","Chapter 10"));

        ListView listView = (ListView) findViewById(R.id.list_view);
        ChapterAdapter chapterAdapter = new ChapterAdapter(BeginnerTutorialActivity.this,beginnerList,R.color.purple);
        listView.setAdapter(chapterAdapter);
    }
}
