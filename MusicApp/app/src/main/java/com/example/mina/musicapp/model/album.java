package com.example.mina.musicapp.model;

public class album {

    private String name;
    private int numOfSongs;
    private  int albumImage;

    public album(String name, int numOfSongs,int albumImage){
        this.name = name;
        this.numOfSongs = numOfSongs;
        this.albumImage=albumImage;
    }

    public String getName() {
        return name;
    }

    public int getNumOfSongs() {
        return numOfSongs;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumOfSongs(int numOfSongs) {
        this.numOfSongs = numOfSongs;
    }

    public int getAlbumImage() {
        return albumImage;
    }

    public void setAlbumImage(int albumImage) {
        this.albumImage = albumImage;
    }
}
