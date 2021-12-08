package by.byshnev.springcource;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

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

    public void playMusic(Genres genres) {
        if (genres.equals(Genres.CLASSICAL)) {
            System.out.println("Playing: " + music1.getSong().get((int) (music1.getSong().size() * Math.random())));
        }
        if (genres.equals(Genres.RAP)) {
            System.out.println("Playing: " + music3.getSong().get((int) (music3.getSong().size() * Math.random())));
        }
        if (genres.equals(Genres.ROCK)){
            System.out.println("Playing: " + music2.getSong().get((int) (music2.getSong().size() * Math.random())));
        }
    }
}
