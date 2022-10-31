package com.naidiuk.java_configuration;

import com.naidiuk.java_configuration.configuration.MusicAppConfiguration;
import com.naidiuk.java_configuration.service.MusicPlayerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MusicApp {
    public static void main( String[] args ) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MusicAppConfiguration.class);
        MusicPlayerService musicPlayerService = (MusicPlayerService) applicationContext.getBean("musicPlayerService");
        musicPlayerService.playClassicalMusic();
        musicPlayerService.playRockMusic();
    }
}
