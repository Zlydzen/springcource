package by.byshnev.springcource;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RapMusic implements Music {

    @Override
    public List<String> getSong() {
        List<String> listRap = new ArrayList<>();
        listRap.add("2Pac - Changes");
        listRap.add("DMX - Who let's the Dogs Out");
        listRap.add("Jay-Z - New York");
        return listRap;
    }
}
