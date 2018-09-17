package com.example.nikhilreddy.ass;

import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuItem;

import android.view.View;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * It is used for tutorials
 */
public class BeginnerTutorialActivity extends AppCompatActivity implements SearchView.OnQueryTextListener {

    ExpandableListView expandableListView;
    ExpandableListAdapter expandableListAdapter;
    List<String> expandableListTitle;
    HashMap<String, List<String>> expandableListDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial);

        expandableListView = (ExpandableListView) findViewById(R.id.expandableListView);
        expandableListDetail = new HashMap<String, List<String>>();

        List<String> chap1 = new ArrayList<String>();
        chap1.add("Topic 1");
        chap1.add("Topic 2");
        chap1.add("Topic 3");
        chap1.add("Topic 4");
        chap1.add("Topic 5");

        List<String> chap2 = new ArrayList<String>();
        chap2.add("Brazil");
        chap2.add("Spain");
        chap2.add("Germany");
        chap2.add("Netherlands");
        chap2.add("Italy");

        List<String> chap3 = new ArrayList<String>();
        chap3.add("United States");
        chap3.add("Spain");
        chap3.add("Argentina");
        chap3.add("France");
        chap3.add("Russia");

        expandableListDetail.put("Chapter 1", chap1);
        expandableListDetail.put("Chapter 2", chap2);
        expandableListDetail.put("Chapter 3", chap3);

        expandableListTitle = new ArrayList<String>(expandableListDetail.keySet());
        expandableListAdapter = new CustomExpandableListAdapter(this, expandableListTitle, expandableListDetail);
        expandableListView.setAdapter(expandableListAdapter);
        expandableListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
            @Override
            public void onGroupExpand(int groupPosition) {
            }
        });

        expandableListView.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {

            @Override
            public void onGroupCollapse(int groupPosition) {
            }
        });

        expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {
                return false;
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
}