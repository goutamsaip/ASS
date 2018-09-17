package com.example.nikhilreddy.ass;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * it is used for arcticles
 */
public class ArticlesActivity extends AppCompatActivity implements SearchView.OnQueryTextListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_articles);

        final ArrayList<Item> generalList = new ArrayList<>();

        generalList.add(new Item(1,"Article   1"));
        generalList.add(new Item(2,"Article   2"));
        generalList.add(new Item(3,"Article   3"));
        generalList.add(new Item(4,"Article   4"));
        generalList.add(new Item(5,"Article   5"));
        generalList.add(new Item(6,"Article   6"));
        generalList.add(new Item(7,"Article   7"));
        generalList.add(new Item(8,"Article   8"));
        generalList.add(new Item(9,"Article   9"));
        generalList.add(new Item(10,"Article   10"));

        ListView listView = (ListView) findViewById(R.id.articles_list_view);
        ChapterAdapter chapterAdapter = new ChapterAdapter(ArticlesActivity.this,generalList,R.color.white);
        listView.setAdapter(chapterAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String url = "https://www.autosar.org/";
                openWebPage(url);
            }
        });
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

    /**
     * it is used for opening the web page in the articles
     * @param url
     */
    public void openWebPage(String url) {
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}
