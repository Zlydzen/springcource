package by.byshnev.springcource;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    private Music music1;
    private Music music2;
    private Music music3;


    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music music1,
                       @Qualifier("rockMusic") Music music2,
                       @Qualifier("rapMusic") Music music3) {
        this.music1 = music1;
        this.music2 = music2;
        this.music3 = music3;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public void playMusic(Genres genres) {
        if (genres == Genres.CLASSICAL) {
            System.out.println("Playing: " + music1.getSong().get((int) (music1.getSong().size() * Math.random())));
        }
        if (genres == Genres.RAP) {
            System.out.println("Playing: " + music3.getSong().get((int) (music3.getSong().size() * Math.random())));
        }
        if (genres == Genres.ROCK){
            System.out.println("Playing: " + music2.getSong().get((int) (music2.getSong().size() * Math.random())));
        }
    }
}
