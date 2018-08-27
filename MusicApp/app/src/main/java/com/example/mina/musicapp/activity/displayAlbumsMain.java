package com.example.mina.musicapp.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.mina.musicapp.R;
import com.example.mina.musicapp.adapter.AlbumsAdapter;
import com.example.mina.musicapp.adapter.linksAdapter;
import com.example.mina.musicapp.factory.factoryPattern;
import com.example.mina.musicapp.model.link;

import java.util.ArrayList;
import java.util.List;

public class displayAlbumsMain extends AppCompatActivity {

    RecyclerView videosList;
    List<link> linkVideosList;
    linksAdapter adapter;
    factoryPattern factory;
    int position;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_albums_main);
        videosList=(RecyclerView)findViewById(R.id.recycler_view_videos);
        linkVideosList=new ArrayList<link>();
        Intent intent=getIntent();
        Bundle b= intent.getExtras();
        position=b.getInt("position");
        factory=new factoryPattern(position);

        linkVideosList=factory.videos_demo().videos();
        adapter=new linksAdapter(displayAlbumsMain.this,linkVideosList);
        RecyclerView.LayoutManager manager=new LinearLayoutManager(this);
        videosList.setLayoutManager(manager);
        videosList.setItemAnimator(new DefaultItemAnimator());
        videosList.setAdapter(adapter);

    }
}
