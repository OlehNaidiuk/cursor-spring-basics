package com.naidiuk.annotation_configuration.service;

import com.naidiuk.annotation_configuration.entity.MusicTrack;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

@Service
public class ClassicalMusicPlayerServiceImpl implements ClassicalMusicPlayerService {
    private List<MusicTrack> classicalTracks;

    @PostConstruct
    public void init() {
        MusicTrack capriceNo24 = new MusicTrack();
        capriceNo24.setArtist("Niccolo Paganini");
        capriceNo24.setTrackName("Caprice No. 24");

        MusicTrack winter = new MusicTrack();
        winter.setArtist("Antonio Vivaldi");
        winter.setTrackName("Winter");

        classicalTracks = Arrays.asList(capriceNo24, winter);
    }

    @Override
    public void playClassicalMusic() {
        for (MusicTrack classicalTrack : classicalTracks) {
            System.out.println(classicalTrack);
        }
    }
}
