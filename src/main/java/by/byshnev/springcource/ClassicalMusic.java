package by.byshnev.springcource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

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
    public String getSong() {
        return "Bethoven - Moon sonata";

    }

}
