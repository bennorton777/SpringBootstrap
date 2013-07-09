package com.ben.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * This class has nothing to do with the webpage/velocity template stuff
 * It remains here because it might be useful boilerplate later if we decide to talk about autowiring and the magic of beans.
 * It's really cool stuff, but not yet something you've said you need.
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "SpringBeans.xml");

        HelloWorld obj = (HelloWorld) context.getBean("helloBean");
        obj.printHello();
    }
}