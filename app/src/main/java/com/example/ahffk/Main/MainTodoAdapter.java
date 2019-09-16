package com.example.ahffk.Main;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ahffk.R;
import com.example.ahffk.data.entity.Todoitem;

import java.util.ArrayList;

public class MainTodoAdapter extends RecyclerView.Adapter {

    private ArrayList<Todoitem> itemList = new ArrayList<>();
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        MainTodoViewHolder viewHolder=
                new MainTodoViewHolder(LayoutInflater.from(parent.getContext()
                        .inflate(R.layout.item_todo,parent,false));
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
