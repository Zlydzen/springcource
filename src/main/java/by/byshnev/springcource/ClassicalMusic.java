package by.byshnev.springcource;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {

    @Override
    public String getSong() {
        return "Bach - Takkata & Fuga (D.moll)";
    }

}
