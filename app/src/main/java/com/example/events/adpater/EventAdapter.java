package com.example.events.adpater;

import android.graphics.Color;
import android.provider.CalendarContract;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.events.R;
import com.example.events.views.holders.EventsHolder;

public class EventAdapter extends RecyclerView.Adapter<EventsHolder> {

    @NonNull
    @Override
    public EventsHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.event_item_view,parent,false);
        return new EventsHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EventsHolder holder, int position) {

        if(position>0) {
            holder.tvEventCategoryHeader.setText("The popular in Los Angles");
            holder.tvEventCategoryHeader.setTextColor(Color.BLACK);
        }


    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
