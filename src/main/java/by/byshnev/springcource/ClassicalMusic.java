package by.byshnev.springcource;

public class ClassicalMusic implements Music {

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
