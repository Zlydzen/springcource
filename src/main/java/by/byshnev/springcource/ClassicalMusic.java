package by.byshnev.springcource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {

    @PostConstruct
    public void doInit(){
        System.out.println("Init-method...");
    }

    @PreDestroy
    public void doDestroy(){
        System.out.println("Destroy-method...");
    }

    @Override
    public List<String> getSong() {
        List<String> listClassical = new ArrayList<>();
        listClassical.add("Bach - Takkata & Fuga D.moll");
        listClassical.add("Rohmaninov - Preludia");
        listClassical.add("Bethoven - Moon sonata");
        return listClassical;
    }

}
