package com.calcounterapplication.demoexlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    ExpandableListView expandableListView;
    List<String> langs;
    Map<String, List<String>> topics;
    ExpandableListAdapter listAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         expandableListView = (ExpandableListView) findViewById(R.id.expandableListView);
         fillData();

         listAdapter = new MyExListAdapter(this,langs,topics);
         expandableListView.setAdapter(listAdapter);
    }

    public void fillData()
    {
        langs = new ArrayList<>();
        topics = new HashMap<>();

        langs.add("Java");
        langs.add("C");

        List<String> java = new ArrayList<>();
        List<String> c = new ArrayList<>();

        java.add("Super");
        java.add("Encapsulation");
        java.add("Methods");

        c.add("Procedure");
        c.add("Pointers");
        c.add("Array");

        topics.put(langs.get(0),java);
        topics.put(langs.get(1),c);

    }
}
