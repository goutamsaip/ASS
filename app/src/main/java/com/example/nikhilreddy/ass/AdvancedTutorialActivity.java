package com.example.nikhilreddy.ass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class AdvancedTutorialActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq);

        final ArrayList<Item> advancedList = new ArrayList<>();

        advancedList.add(new Item("1","Chapter 1"));
        advancedList.add(new Item("2","Chapter 2"));
        advancedList.add(new Item("3","Chapter 3"));
        advancedList.add(new Item("4","Chapter 4"));
        advancedList.add(new Item("5","Chapter 5"));
        advancedList.add(new Item("6","Chapter 6"));
        advancedList.add(new Item("7","Chapter 7"));
        advancedList.add(new Item("8","Chapter 8"));
        advancedList.add(new Item("9","Chapter 9"));
        advancedList.add(new Item("10","Chapter 10"));

        ListView listView = (ListView) findViewById(R.id.list_view);
        ChapterAdapter chapterAdapter = new ChapterAdapter(AdvancedTutorialActivity.this,advancedList,R.color.purple);
        listView.setAdapter(chapterAdapter);
    }
}
