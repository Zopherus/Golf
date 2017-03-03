package com.example.ejz19.golf;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.lang.reflect.Array;

public class ChoosePlayers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_players);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ListView listView = (ListView) findViewById(R.id.ListView);
        String[] names = new String[]{
                "Eric Zhu",
                "Eli Reed",
                "Jeffrey Maxwell",
                "Eric Zhu",
                "Ethan Karlinsey"
        };

        listView.setAdapter(new TextAdapter(this, names));



    }

}
