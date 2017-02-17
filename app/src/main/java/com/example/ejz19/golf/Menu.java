package com.example.ejz19.golf;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.Button;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Button button = (Button) findViewById(R.id.Game);
        button.setText("Start Game");
        button = (Button) findViewById(R.id.Players);
        button.setText("Players");
        button = (Button) findViewById(R.id.Courses);
        button.setText("Courses");
    }
}
