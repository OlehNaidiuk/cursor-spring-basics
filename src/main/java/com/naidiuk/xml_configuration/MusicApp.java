package com.naidiuk.xml_configuration;

import com.naidiuk.xml_configuration.service.MusicPlayerService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MusicApp {
    public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("bean-factory.xml");
        MusicPlayerService musicPlayerService = (MusicPlayerService) beanFactory.getBean("musicPlayerServiceBean");
        musicPlayerService.playClassicalMusic();
        musicPlayerService.playRockMusic();
    }
}
