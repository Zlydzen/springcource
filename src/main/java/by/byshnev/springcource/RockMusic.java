package by.byshnev.springcource;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Queen - We Will Rock You";
    }
}
