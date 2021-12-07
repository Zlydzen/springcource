package by.byshnev.springcource;

import org.springframework.stereotype.Component;


public class RapMusic implements Music {

    @Override
    public String getSong() {
        return "2Pac - Changes";
    }
}
