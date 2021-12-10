package by.byshnev.springcource;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MusicPlayer {

    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    private Music rapSong;
    private Music rockSong;
    private Music classicalSong;

    List<Music> list = new ArrayList<>();

    public MusicPlayer(List<Music> list) {
        this.list = list;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    Random random = new Random();

    public void playMusic() {
        Music music = list.get(random.nextInt(3));
        System.out.println(music.getSong());
    }
}
