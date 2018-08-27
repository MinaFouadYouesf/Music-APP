package com.example.mina.musicapp.factory;

import com.example.mina.musicapp.model.link;

import java.util.ArrayList;
import java.util.List;

public class album_2 implements albumsInterface {
    List<link> album_videos;

    public album_2() {
        album_videos = new ArrayList<>();
    }

    @Override
    public List<link> videos() {

        album_videos.add(new link("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/_CQq0DBiNy4\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>>"));
        album_videos.add(new link("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/xrjz8a37yAI\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>>"));
        album_videos.add(new link("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/cHR2FGfeci0\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>>"));
        album_videos.add(new link("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/6wsQb4n3T1k?list=PLdXBEeW9Z3Jb4pD6o2Gytjc1Ksp4MORpd\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>>"));
        album_videos.add(new link("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/GopLKdv3wP0?list=PLdXBEeW9Z3Jb4pD6o2Gytjc1Ksp4MORpd\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>>"));
        album_videos.add(new link("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/Ghth4f1ib2M?list=PLdXBEeW9Z3Jb4pD6o2Gytjc1Ksp4MORpd\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>>"));
        album_videos.add(new link("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/SPXPg50UiUc?list=PLdXBEeW9Z3Jb4pD6o2Gytjc1Ksp4MORpd\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>>"));
        album_videos.add(new link("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/H8J6Ff1fntQ?list=PLdXBEeW9Z3Jb4pD6o2Gytjc1Ksp4MORpd\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>>"));
        album_videos.add(new link("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/ZrnmcY_oiuY?list=PLdXBEeW9Z3Jb4pD6o2Gytjc1Ksp4MORpd\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>>"));
        album_videos.add(new link("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/EWG584jcSmA?list=PLdXBEeW9Z3Jb4pD6o2Gytjc1Ksp4MORpd\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>>"));
        return album_videos;
    }
}
