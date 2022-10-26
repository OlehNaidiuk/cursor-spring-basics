package com.naidiuk.annotation_configuration.configuration;

import com.naidiuk.annotation_configuration.entity.MusicTrack;
import com.naidiuk.annotation_configuration.service.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
@ComponentScan(basePackages = "com.naidiuk.annotation_configuration")
public class MusicAppConfiguration {
    @Bean
    public MusicTrack capriceNo24() {
        MusicTrack capriceNo24 = new MusicTrack();
        capriceNo24.setArtist("Niccolo Paganini");
        capriceNo24.setTrackName("Caprice No. 24");
        return capriceNo24;
    }

    @Bean
    public MusicTrack winter() {
        MusicTrack winter = new MusicTrack();
        winter.setArtist("Antonio Vivaldi");
        winter.setTrackName("Winter");
        return winter;
    }

    @Bean
    public MusicTrack uprising() {
        MusicTrack uprising = new MusicTrack();
        uprising.setArtist("Muse");
        uprising.setTrackName("Uprising");
        return uprising;
    }

    @Bean
    public MusicTrack calm() {
        MusicTrack calm = new MusicTrack();
        calm.setArtist("Ария");
        calm.setTrackName("Штиль");
        return calm;
    }

    @Bean
    public List<MusicTrack> classicalTracks() {
        return Arrays.asList(capriceNo24(), winter());
    }

    @Bean
    public List<MusicTrack> rockTracks() {
        return Arrays.asList(uprising(), calm());
    }

    @Bean
    public ClassicalMusicPlayerService classicalMusicService() {
        return new ClassicalMusicPlayerServiceImpl(classicalTracks());
    }

    @Bean
    public RockMusicPlayerService rockMusicService() {
        return new RockMusicPlayerServiceImpl(rockTracks());
    }

    @Bean
    public MusicPlayerService musicPlayerService() {
        return new MusicPlayerServiceImpl(classicalMusicService(), rockMusicService());
    }
}
