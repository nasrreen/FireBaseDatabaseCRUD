package com.example.acer.firebasedatabasecrud;

/**
 * Created by ACER on 02-Nov-17.
 */

public class Artist {

    String artistId;
    String artistName;

    public Artist(){

    }

    public Artist(String artistId, String artistName) {
        this.artistId = artistId;
        this.artistName = artistName;
    }

    public String getArtistId() {
        return artistId;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistId(String artistId) {
        this.artistId = artistId;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }
}
