package com.example.mina.musicapp.factory;

import com.example.mina.musicapp.model.link;

import java.util.ArrayList;
import java.util.List;

public class album_7 implements albumsInterface {
    List<link>album_videos;
    public  album_7(){
        album_videos=new ArrayList<>();
    }
    @Override
    public List<link> videos() {

        album_videos.add( new link("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/uy5pWDFq0vI\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>>"));
        album_videos.add( new link("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/IetIg7y5k3A\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>>"));

        return album_videos;
    }
}
