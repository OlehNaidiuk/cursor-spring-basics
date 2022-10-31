package com.naidiuk.annotation_configuration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MusicPlayerServiceImpl implements MusicPlayerService {
    private final ClassicalMusicPlayerService classicalMusicPlayerService;
    private final RockMusicPlayerService rockMusicPlayerService;

    @Autowired
    public MusicPlayerServiceImpl(ClassicalMusicPlayerService classicalMusicPlayerService,
                                  RockMusicPlayerService rockMusicPlayerService) {
        this.classicalMusicPlayerService = classicalMusicPlayerService;
        this.rockMusicPlayerService = rockMusicPlayerService;
    }

    @Override
    public void playClassicalMusic() {
        classicalMusicPlayerService.playClassicalMusic();
    }

    @Override
    public void playRockMusic() {
        rockMusicPlayerService.playRockMusic();
    }
}
