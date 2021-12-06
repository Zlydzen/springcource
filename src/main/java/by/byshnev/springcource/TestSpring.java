package by.byshnev.springcource;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        ClassicalMusic musicBean1 = context.getBean("musicBean", ClassicalMusic.class);
        ClassicalMusic musicBean2 = context.getBean("musicBean", ClassicalMusic.class);

        context.close();
    }
}
