package by.byshnev.springcource;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Music classicalMusic = context.getBean("classicalMusic", Music.class);
        System.out.println(classicalMusic.getSong());

        context.close();
    }
}
