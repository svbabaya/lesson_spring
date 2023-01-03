package ru.maxima.exercise;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
@Component
public class MusicPlayer {
    private final ArrayList<Music> listOfGenres = new ArrayList<Music>();

    public void addGenreToList(Music music) {
        listOfGenres.add(music);
    }

    public void play() {
        for(Music m : listOfGenres) {
            System.out.println("Method play() is playing: " + m.getSong());
        }
    }

    public MusicPlayer() {
        System.out.println("MusicPlayer is turned on!");
    }

}
