package com.example.positivethinking.tool;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.positivethinking.R;
import com.example.positivethinking.model.Thought;

import java.util.HashMap;

public class AppAdapter extends RecyclerView.Adapter<AppAdapter.AppViewHolder>  {

     private HashMap <Integer,Thought> thoughtHashMap;

    @NonNull
    @Override
    public AppViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.thought_cell,parent,false);
        return new AppViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AppViewHolder holder, int position) {
        Thought thought = thoughtHashMap.get(position);
        holder.setThought(thought);
    }

    @Override
    public int getItemCount() {
        if (thoughtHashMap != null)
            return thoughtHashMap.size();
        else
            return 0;
    }

    public void setThoughtHashMap (HashMap<Integer,Thought> thoughts){
        thoughtHashMap = thoughts;
    }

    public class AppViewHolder extends RecyclerView.ViewHolder{

        private final TextView thoughtTextView;

        private Thought thought;

        public AppViewHolder(@NonNull View itemView) {
            super(itemView);
            this.thoughtTextView = itemView.findViewById(R.id.thought_list);
        }

        public void setThought(Thought thought) {
            this.thought = thought;
            thoughtTextView.setText(thought.getText());
        }
    }
}
