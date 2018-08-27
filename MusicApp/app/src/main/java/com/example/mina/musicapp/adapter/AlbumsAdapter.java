package com.example.mina.musicapp.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.mina.musicapp.R;
import com.example.mina.musicapp.activity.displayAlbumsMain;
import com.example.mina.musicapp.model.album;

import java.util.List;


public class AlbumsAdapter extends RecyclerView.Adapter<AlbumsAdapter.MyViewHolder> {

    private Context mContext;
    private List<album> albumList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, count;
        public ImageView thumbnail, overflow;
        public CardView cardView;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            count = (TextView) view.findViewById(R.id.count);
            thumbnail = (ImageView) view.findViewById(R.id.thumbnail);
            cardView=(CardView)view.findViewById(R.id.card_view);
        }
    }


    public AlbumsAdapter(Context mContext, List<album> albumList) {
        this.mContext = mContext;
        this.albumList = albumList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_album_design, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
        album albumObject = albumList.get(position);
        holder.title.setText(albumObject.getName());
        holder.count.setText(albumObject.getNumOfSongs() + " songs");
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Toast.makeText(mContext, String.valueOf(position), Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(mContext, displayAlbumsMain.class);
                intent.putExtra("position",position);
                mContext.startActivity(intent);
            }
        });

        // loading album cover using Glide library
        Glide.with(mContext).load(albumObject.getAlbumImage()).into(holder.thumbnail);

    }


    @Override
    public int getItemCount() {
        return albumList.size();
    }
}