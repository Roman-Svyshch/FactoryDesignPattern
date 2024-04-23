package org.example.hamburgerStoreFactoryPattern;

public abstract class Hamburger {
    public String name;
    public String sauce;
    public String buns;
    public void prepape() {
        System.out.println("preparing " + name);
        System.out.println("adding sauce " + sauce);
        System.out.println("adding buns " + buns);
    }

    public void cook() {
        System.out.println("Cooking ....");
    }

    public void box() {
        System.out.println("Boxing ...");
    }

    public String getName(){
        return name;

    }
}
