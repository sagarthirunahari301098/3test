package com.example.fragmenttask3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecycleAdaptor extends RecyclerView.Adapter<RecycleAdaptor.ViewHolder> {
    ArrayList data_received;
    public RecycleAdaptor(ArrayList data_received) {
        this.data_received = data_received;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        // using inflater to convert to view
        View view = layoutInflater.inflate(R.layout.layout,parent,false);
        //storing view in viewHolder
        ViewHolder viewHolder =  new ViewHolder(view);
        return viewHolder;
        //hello new update........................
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.textView.setText(data_received.get(position).toString());

    }

    @Override
    public int getItemCount() {
        return data_received.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textview_names);
        }
    }
}
