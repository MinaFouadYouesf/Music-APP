package com.example.mina.musicapp.factory;

import com.example.mina.musicapp.model.link;

import java.util.ArrayList;
import java.util.List;

public class album_4 implements albumsInterface {
    List<link>album_videos;
    public  album_4(){
        album_videos=new ArrayList<>();
    }
    @Override
    public List<link> videos() {


        album_videos.add( new link("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/Bag1gUxuU0g\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>>"));
        album_videos.add( new link("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/ORnYNaTZGUU\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>>"));
        album_videos.add( new link("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/ig_b-3Q-e8I\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>>"));
        album_videos.add( new link("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/JRWox-i6aAk\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>>"));
        album_videos.add( new link("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/AddAcFd-SEs\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>>"));
        album_videos.add( new link("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/loTdgMww8VU\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>>"));
        album_videos.add( new link("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/8J66KGKNPSo\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>>"));
        album_videos.add( new link("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/uy53wVs0u6U\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>>"));


        return album_videos;
    }
}
