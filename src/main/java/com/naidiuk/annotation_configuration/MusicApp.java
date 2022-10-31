package com.naidiuk.annotation_configuration;

import com.naidiuk.annotation_configuration.service.MusicPlayerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MusicApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.naidiuk.annotation_configuration");
        MusicPlayerService musicPlayerService = applicationContext.getBean(MusicPlayerService.class);
        musicPlayerService.playClassicalMusic();
        musicPlayerService.playRockMusic();
    }
}
