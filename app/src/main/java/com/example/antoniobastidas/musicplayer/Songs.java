package com.example.antoniobastidas.musicplayer;

import android.graphics.drawable.Drawable;

/**
 * Created by AntonioBastidas on 06/05/15.
 */
public class Songs {

    private String name;
    private String artista;
    private String time;
    private Drawable album;

    public Songs(String name, String artista, String time, Drawable album) {
        this.name = name;
        this.artista = artista;
        this.album = album;
        this.time=time;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String time) {
        this.artista = artista;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Drawable getAlbum() {
        return album;
    }

    public void setAlbum(Drawable album) {
        this.album = album;
    }
}
