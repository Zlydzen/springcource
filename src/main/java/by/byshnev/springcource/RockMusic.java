package by.byshnev.springcource;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {

    @Override
    public List<String> getSong() {
        List<String> listRock = new ArrayList<>();
        listRock.add("Queen - We Will Rock You");
        listRock.add("AC/DC - Thunderbolt");
        listRock.add("Roxette - Listen to Your Heart");
        return listRock;
    }
}
