package com.naidiuk.annotation_configuration.service;

import com.naidiuk.annotation_configuration.entity.MusicTrack;

import java.util.List;

public class ClassicalMusicPlayerServiceImpl implements ClassicalMusicPlayerService {
    private final List<MusicTrack> classicalTracks;

    public ClassicalMusicPlayerServiceImpl(List<MusicTrack> classicalTracks) {
        this.classicalTracks = classicalTracks;
    }

    @Override
    public void playClassicalMusic() {
        for (MusicTrack classicalTrack : classicalTracks) {
            System.out.println(classicalTrack);
        }
    }
}
