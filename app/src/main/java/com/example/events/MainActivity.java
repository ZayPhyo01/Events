package com.example.events;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.events.adpater.EventAdapter;

public class MainActivity extends AppCompatActivity {
RecyclerView eventList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eventList = findViewById(R.id.rv_events_list);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        EventAdapter eventAdapter = new EventAdapter();
        eventList.setAdapter(eventAdapter);
        eventList.setLayoutManager(layoutManager);
    }
}
