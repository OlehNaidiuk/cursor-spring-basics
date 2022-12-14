package com.naidiuk.xml_configuration.service;

import com.naidiuk.xml_configuration.entity.MusicTrack;

import java.util.List;

public class RockMusicPlayerServiceImpl implements RockMusicPlayerService {
    private final List<MusicTrack> rockTracks;

    public RockMusicPlayerServiceImpl(List<MusicTrack> rockTracks) {
        this.rockTracks = rockTracks;
    }

    @Override
    public void playRockMusic() {
        for (MusicTrack rockTrack : rockTracks) {
            System.out.println(rockTrack);
        }
    }
}
