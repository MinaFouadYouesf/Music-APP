package com.example.mina.musicapp.activity;

import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.example.mina.musicapp.R;
import com.example.mina.musicapp.adapter.AlbumsAdapter;
import com.example.mina.musicapp.model.album;
import java.util.ArrayList;
import java.util.List;
import static com.example.mina.musicapp.R.*;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private AlbumsAdapter adapter;
    private List<album> albumList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(id.toolbar);
        setSupportActionBar(toolbar);

        recyclerView = (RecyclerView) findViewById(id.recycler_view);

        albumList = new ArrayList<>();
        adapter = new AlbumsAdapter(this, albumList);

        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);

        prepareAlbums();

        try {
            Glide.with(this).load(drawable.cover).into((ImageView) findViewById(id.backdrop));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /**
     * Adding few albums for testing
     */
    private void prepareAlbums() {
        int[] covers = new int[]{
                drawable.album1,
                drawable.album2,
                drawable.album3,
                drawable.album4,
                drawable.album5,
                drawable.album6,
                drawable.album7,
                drawable.album8,
                drawable.album9,
                drawable.album10,
                drawable.album11};

        album a = new album("True Romance", 8, covers[0]);
        albumList.add(a);

        a = new album("Xscpae", 7, covers[1]);
        albumList.add(a);

        a = new album("Maroon 5", 11, covers[2]);
        albumList.add(a);

        a = new album("Born to Die", 12, covers[3]);
        albumList.add(a);

        a = new album("Honeymoon", 3, covers[4]);
        albumList.add(a);

        a = new album("I Need a Doctor", 4, covers[5]);
        albumList.add(a);

        a = new album("Loud", 3, covers[6]);
        albumList.add(a);

        a = new album("Legend", 3, covers[7]);
        albumList.add(a);

        a = new album("Hello", 1, covers[8]);
        albumList.add(a);

        a = new album("Greatest Hits", 1, covers[9]);
        albumList.add(a);

        adapter.notifyDataSetChanged();
    }


}