package com.example.positivethinking;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.positivethinking.model.ModelManager;
import com.example.positivethinking.tool.AppAdapter;

public class ListThoughtActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_thought);
        setTitle(R.string.app_name);

        RecyclerView recyclerView = findViewById(R.id.recycler_view);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        AppAdapter adapter = new AppAdapter();
        adapter.setThoughtHashMap(ModelManager.getPositiveApp().getThoughts());

        recyclerView.setAdapter(adapter);


    }
}
