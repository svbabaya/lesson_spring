package ru.maxima.exercise;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
//        ClassicalMusic classicalMusic = new ClassicalMusic();
//        RockMusic rockMusic = new RockMusic();
//        FolkMusic folkMusic = new FolkMusic();
        ClassicalMusic classicalMusic = context.getBean("classicalMusic", ClassicalMusic.class);
        RockMusic rockMusic = context.getBean("rockMusic", RockMusic.class);
        FolkMusic folkMusic = context.getBean("folkMusic", FolkMusic.class);
//        MusicPlayer musicPlayer = new MusicPlayer();
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.addGenreToList(classicalMusic);
        musicPlayer.addGenreToList(rockMusic);
        musicPlayer.addGenreToList(folkMusic);

        musicPlayer.play();

        context.close();

    }
}
