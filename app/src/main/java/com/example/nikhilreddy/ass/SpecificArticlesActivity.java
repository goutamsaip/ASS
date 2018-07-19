package com.example.nikhilreddy.ass;

import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class SpecificArticlesActivity extends AppCompatActivity implements SearchView.OnQueryTextListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_articles);

        final ArrayList<Item> specificList = new ArrayList<>();

        specificList.add(new Item("1","Article   1"));
        specificList.add(new Item("2","Article   2"));
        specificList.add(new Item("3","Article   3"));
        specificList.add(new Item("4","Article   4"));
        specificList.add(new Item("5","Article   5"));
        specificList.add(new Item("6","Article   6"));
        specificList.add(new Item("7","Article   7"));
        specificList.add(new Item("8","Article   8"));
        specificList.add(new Item("9","Article   9"));
        specificList.add(new Item("10","Article   10"));

        ListView listView = (ListView) findViewById(R.id.articles_list_view);
        ChapterAdapter chapterAdapter = new ChapterAdapter(SpecificArticlesActivity.this,specificList,R.color.white);
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
