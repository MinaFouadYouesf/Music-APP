package com.example.mina.musicapp.factory;

import com.example.mina.musicapp.model.link;

import java.util.ArrayList;
import java.util.List;

public class album_1 implements albumsInterface {

    List<link> album_videos;

    public album_1() {
        album_videos = new ArrayList<>();
    }

    @Override
    public List<link> videos(){

        album_videos.add(new link("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/trwmhm5WaYQ\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>>"));
        album_videos.add(new link("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/8F5QZpJxrto\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>>"));
        album_videos.add(new link("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/iOllrvwFdjw\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>>"));
        album_videos.add(new link("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/R8p0lUGhUrs\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>>"));
        album_videos.add(new link("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/u33XRWS3y5o?list=PLiPFnhsiN6AU0RggY9Vp2FKm2xnnHQxb0\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>>"));
        album_videos.add(new link("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/SSIofshQ-HE?list=PLiPFnhsiN6AU0RggY9Vp2FKm2xnnHQxb0\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>>"));
        album_videos.add(new link("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/ICQLCxjNTPs?list=PLiPFnhsiN6AU0RggY9Vp2FKm2xnnHQxb0\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>>"));
        album_videos.add(new link("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/Q_9dIyQNwvE?list=PLiPFnhsiN6AU0RggY9Vp2FKm2xnnHQxb0\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>>"));
        album_videos.add(new link("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/_wP_WoxjP6E?list=PLiPFnhsiN6AU0RggY9Vp2FKm2xnnHQxb0\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>>"));
        album_videos.add(new link("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/GZGDS7B393o?list=PLiPFnhsiN6AU0RggY9Vp2FKm2xnnHQxb0\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>>"));
        album_videos.add(new link("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/1BXhtBFS0ZA?list=PLiPFnhsiN6AU0RggY9Vp2FKm2xnnHQxb0\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>>"));
        album_videos.add(new link("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/iyjdN8yXUeA?list=PLiPFnhsiN6AU0RggY9Vp2FKm2xnnHQxb0\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>>"));
        return album_videos;
    }
}
