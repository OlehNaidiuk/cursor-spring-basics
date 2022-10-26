package com.naidiuk.java_configuration.entity;

public class MusicTrack {
    private String trackName;
    private String artist;

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    @Override
    public String toString() {
        return artist + " - " + trackName;
    }
}
