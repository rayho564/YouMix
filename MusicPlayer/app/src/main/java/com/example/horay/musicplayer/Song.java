package com.example.horay.musicplayer;

/**
 * Created by HoRay on 2/12/2016.
 */
public class Song {
    private long id;
    private String title;
    private String artist;

    public Song(long songID, String songTitle, String songArtist) {
        id=songID;
        title=songTitle;
        artist=songArtist;
    }

    /*If you plan to use more track information, then you are free to add
        additional instance variables to the class.
     */
    public long getID(){return id;}
    public String getTitle(){return title;}
    public String getArtist(){return artist;}

}
