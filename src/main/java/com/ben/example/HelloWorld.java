package com.ben.example;

/**
 * Spring bean
 * This class has nothing to do with the webpage/velocity template stuff
 * It remains here because it might be useful boilerplate later if we decide to talk about autowiring and the magic of beans.
 * It's really cool stuff, but not yet something you've said you need.
 *
 */
public class HelloWorld {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void printHello() {
        System.out.println("Spring 3 : Hello ! " + name);
    }
}