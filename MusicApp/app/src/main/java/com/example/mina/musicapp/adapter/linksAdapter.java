package com.example.mina.musicapp.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.example.mina.musicapp.R;
import com.example.mina.musicapp.model.link;

import java.util.List;

public class linksAdapter extends RecyclerView.Adapter<linksAdapter.myViewHolder>  {

    List<link> linkVideosList;
    Context context;

    public  linksAdapter(){}
    public linksAdapter(Context context,List<link> linkVideosList){

        this.context=context;
       this.linkVideosList=linkVideosList;
   }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from( parent.getContext()).inflate(R.layout.display_songs_design, parent, false);

        return new myViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {
        holder.webView.loadData( linkVideosList.get(position).getURL(), "text/html" , "utf-8" );

    }


    @Override
    public int getItemCount() {

    return linkVideosList.size();
    }


    public class myViewHolder extends  RecyclerView.ViewHolder{

        WebView webView;
        public myViewHolder(View itemView) {
            super(itemView);

      webView=(WebView)itemView.findViewById(R.id.webVideoView);
            webView.getSettings().setPluginState(WebSettings.PluginState.ON);
            webView.getSettings().setJavaScriptEnabled(true);
            webView.getSettings().setAllowFileAccess(true);
            webView.setWebChromeClient(new WebChromeClient() { } );
        }
    }
}
