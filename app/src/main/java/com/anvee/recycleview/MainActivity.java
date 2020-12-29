package com.anvee.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.pg_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        String[] languages = {"James","John","Robert","Michael","William",
                "David","Richard","Joseph","Thomas","Charles",
                "Christopher","Daniel","Matthew","Anthony","Donald",
                "Steven","Andrew","Kenneth","George","Ronald"};
        recyclerView.setAdapter(new ProgramAdapter(languages));
    }
}