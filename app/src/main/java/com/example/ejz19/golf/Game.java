package com.example.ejz19.golf;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class Game extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);


        GridView gridView = (GridView) findViewById(R.id.gridView);
        String[] names = new String[]{
                "",
                "Eric",
                "Eli",
                "Jeffrey",
                "Ethan",
                "Hole 1",
                "5","5","5","5",
                "Hole 2", "", "", "", "",
                "Hole 3", "", "", "", ""
        };


        gridView.setAdapter(new TextAdapter(this, names));
    }
}
