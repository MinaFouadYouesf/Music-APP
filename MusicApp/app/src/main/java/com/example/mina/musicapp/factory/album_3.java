package com.example.mina.musicapp.factory;

import com.example.mina.musicapp.model.link;

import java.util.ArrayList;
import java.util.List;

public class album_3 implements albumsInterface {
    List<link>album_videos;
    public  album_3(){
        album_videos=new ArrayList<>();
    }
    @Override
    public List<link> videos() {

        album_videos.add( new link("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/UEXpPJSLP4A\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>>"));

        album_videos.add( new link("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/aJOTlE1K90k\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>>"));
        album_videos.add( new link("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/09R8_2nJtjg\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>>"));
        album_videos.add( new link("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/qpgTC9MDx1o\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>>"));
        album_videos.add( new link("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/nIjVuRTm-dc\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>>"));
        album_videos.add( new link("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/TnCa71iUVxA\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>>"));
        album_videos.add( new link("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/Y7ix6RITXM0\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>>"));
        album_videos.add( new link("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/KRaWnd3LJfs\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>>"));
        album_videos.add( new link("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/NmugSMBh_iI\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>>"));
        album_videos.add( new link("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/x9mGRTaD_00\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>>"));
        album_videos.add( new link("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/MU8B4XDI3Uw\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>>"));

        return album_videos;
    }
}
