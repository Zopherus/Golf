package com.example.ejz19.golf;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Players extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_players);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button button = (Button) findViewById(R.id.Button);
        button.setText("Add Player");

        GridView gridView = (GridView) findViewById(R.id.GridView);
        String[] names = new String[]{
                "Player",
                "Handicap",
                "Eric Zhu",
                "5",
                "Eli Reed",
                "3",
                "Jeffrey Maxwell",
                "9"
        };


        gridView.setAdapter(new TextAdapter(this, names));
    }
}
