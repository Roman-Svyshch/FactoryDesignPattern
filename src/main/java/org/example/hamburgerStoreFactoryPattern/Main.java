package org.example.hamburgerStoreFactoryPattern;

public class Main {
    public static void main(String[] args) {

        HamburgerStore mozabmikianStore = new MozabikianHamburgerStore();
        HamburgerStore jamBurgerStore = new JamaikanHamburgerStore();

        Hamburger hamburger = mozabmikianStore.orderHamburger("cheese");
        System.out.println("Paulo Order " + hamburger.getName());

        hamburger = jamBurgerStore.orderHamburger("veggie");
        System.out.println("James order " + hamburger.getName());
    }
}
