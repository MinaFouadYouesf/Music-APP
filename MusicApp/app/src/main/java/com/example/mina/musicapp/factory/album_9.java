package com.example.mina.musicapp.factory;

import com.example.mina.musicapp.model.link;

import java.util.ArrayList;
import java.util.List;

public class album_9 implements albumsInterface {
    List<link>album_videos;
    public  album_9(){
        album_videos=new ArrayList<>();
    }
    @Override
    public List<link> videos() {

        album_videos.add( new link("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/9h0Arg_-380\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>>"));

        return album_videos;
    }
}
