package by.byshnev.springcource;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {

    @Override
    public List<String> getSong() {
        List<String> listClassical = new ArrayList<>();
        listClassical.add("Bach - Takkata & Fuga D.moll");
        listClassical.add("Rohmaninov - Preludia");
        listClassical.add("Bethoven - Moon sonata");
        return listClassical;
    }

}
