package com.example.nikhilreddy.ass;

import android.content.Intent;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuItem;

import android.view.View;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;

import java.nio.BufferUnderflowException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;


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
        expandableListDetail = new LinkedHashMap<String, List<String>>();

        List<String> chap1 = new ArrayList<String>();
        chap1.add("1.1 What is Autosar?");
        chap1.add("1.2 Basic AUTOSAR Approach");
        chap1.add("1.3 Autosar Architecture");
        chap1.add("1.4 Microcontroller Abstraction Layer");
        chap1.add("1.5 ECU Abstraction Layer");
        chap1.add("1.6 Complex Driver");
        chap1.add("1.7 Services Layer");
        chap1.add("1.8 Run Time Environment (RTE)");
        chap1.add("1.9 Autosar Methodology");
        chap1.add("1.10 System and ECU");

        List<String> chap2 = new ArrayList<String>();
        chap2.add("2.1 Why is the focus on Automotives?");

        List<String> chap3 = new ArrayList<String>();
        chap3.add("3.1 Standards before Autosar");

        List<String> chap4 = new ArrayList<String>();
        chap3.add("4.1 ");

        List<String> chap5 = new ArrayList<String>();
        chap3.add("5.1 ");

        expandableListDetail.put("1. What is Autosar?", chap1);
        expandableListDetail.put("2. Why is the focus on Automotives?", chap2);
        expandableListDetail.put("3. Standards before Autosar", chap3);
        expandableListDetail.put("4. ", chap4);
        expandableListDetail.put("5. ", chap5);

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
                final Intent disp_content = new Intent(BeginnerTutorialActivity.this, displayContent.class);
                disp_content.putExtra("chapter",groupPosition);
                disp_content.putExtra("topic",childPosition);
                startActivity(disp_content);
                return true;
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