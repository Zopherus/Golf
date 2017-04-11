package com.example.ejz19.golf;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
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

    public void StartGame(View view)
    {
        Intent intent = new Intent(this, ChoosePlayers.class);
        startActivity(intent);
    }

    public void Players(View view)
    {
        Intent intent = new Intent(this, Players.class);
        startActivity(intent);
    }

    public void Courses(View view)
    {
        Intent intent = new Intent(this, Courses.class);
        startActivity(intent);
    }
}
