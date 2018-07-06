package com.example.nikhilreddy.ass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class IntermediateTutorialActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq);

        final ArrayList<Item> intermediateList = new ArrayList<>();

        intermediateList.add(new Item("1","Chapter 1"));
        intermediateList.add(new Item("2","Chapter 2"));
        intermediateList.add(new Item("3","Chapter 3"));
        intermediateList.add(new Item("4","Chapter 4"));
        intermediateList.add(new Item("5","Chapter 5"));
        intermediateList.add(new Item("6","Chapter 6"));
        intermediateList.add(new Item("7","Chapter 7"));
        intermediateList.add(new Item("8","Chapter 8"));
        intermediateList.add(new Item("9","Chapter 9"));
        intermediateList.add(new Item("10","Chapter 10"));

        ListView listView = (ListView) findViewById(R.id.list_view);
        ChapterAdapter chapterAdapter = new ChapterAdapter(IntermediateTutorialActivity.this,intermediateList,R.color.purple);
        listView.setAdapter(chapterAdapter);
    }
}
