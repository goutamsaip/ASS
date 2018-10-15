package com.example.nikhilreddy.ass;

import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * It is used for FAQ activity
 */
public class FaqActivity extends AppCompatActivity implements SearchView.OnQueryTextListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq);

        final ArrayList<Item> faqList = new ArrayList<>();

        faqList.add(new Item(1,"F.A.Q   1"));
        faqList.add(new Item(2,"F.A.Q   2"));
        faqList.add(new Item(3,"F.A.Q   3"));
        faqList.add(new Item(4,"F.A.Q   4"));
        faqList.add(new Item(5,"F.A.Q   5"));
        faqList.add(new Item(6,"F.A.Q   6"));
        faqList.add(new Item(7,"F.A.Q   7"));
        faqList.add(new Item(8,"F.A.Q   8"));
        faqList.add(new Item(9,"F.A.Q   9"));
        faqList.add(new Item(10,"F.A.Q   10"));

        ListView listView = (ListView) findViewById(R.id.list_view);
        ChapterAdapter chapterAdapter = new ChapterAdapter(FaqActivity.this,faqList,R.color.white);
        listView.setAdapter(chapterAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_search, menu);

        MenuItem searchItem = menu.findItem(R.id.search);
        SearchView searchView = (SearchView) MenuItemCompat.getActionView(searchItem);
        searchView.setOnQueryTextListener(this);

        return true;
    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        // User pressed the search button
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        // User changed the text
        return false;
    }
}
