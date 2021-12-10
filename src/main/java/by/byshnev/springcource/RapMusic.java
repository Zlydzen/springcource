package by.byshnev.springcource;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

public class RapMusic implements Music {

    @Override
    public String getSong() {
        return "Baha Man - Who let's the Dogs Out";
    }
}
