package com.naidiuk.annotation_configuration.service;

import com.naidiuk.annotation_configuration.entity.MusicTrack;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

@Service
public class RockMusicPlayerServiceImpl implements RockMusicPlayerService {
    private List<MusicTrack> rockTracks;

    @PostConstruct
    public void init() {
        MusicTrack uprising = new MusicTrack();
        uprising.setArtist("Muse");
        uprising.setTrackName("Uprising");

        MusicTrack calm = new MusicTrack();
        calm.setArtist("Ария");
        calm.setTrackName("Штиль");

        rockTracks = Arrays.asList(uprising, calm);
    }

    @Override
    public void playRockMusic() {
        for (MusicTrack rockTrack : rockTracks) {
            System.out.println(rockTrack);
        }
    }
}
