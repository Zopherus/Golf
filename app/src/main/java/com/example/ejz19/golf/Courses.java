package com.example.ejz19.golf;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class Courses extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses);

        ListView listView = (ListView) findViewById(R.id.ListView);
        String[] courses = new String[]{
                "Course1",
                "Course2",
                "Course3"
        };


        listView.setAdapter(new TextAdapter(this, courses));
    }
}
