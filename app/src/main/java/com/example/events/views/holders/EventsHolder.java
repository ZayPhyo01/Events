package com.example.events.views.holders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.events.R;

public class EventsHolder extends RecyclerView.ViewHolder {

   public TextView tvEventCategoryHeader;

    public EventsHolder(View itemView) {
        super(itemView);
        tvEventCategoryHeader = itemView.findViewById(R.id.tv_event_category_header);

    }
}
