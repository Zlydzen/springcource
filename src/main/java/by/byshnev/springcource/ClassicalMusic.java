package by.byshnev.springcource;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {
    private ClassicalMusic() {
    }                              // can't to create new object using "new"

    public static ClassicalMusic getClassicalMusic() {       //factory-method
        return new ClassicalMusic();
    }

    public void doMyInit() {
        System.out.println("Initialization has been started....");
    }

    public void doDestroy() {
        System.out.println("Application has been destroyed");
    }

    @Override
    public String getSong() {
        return "Bach - Takkata & Fuga (D.moll)";
    }
}
