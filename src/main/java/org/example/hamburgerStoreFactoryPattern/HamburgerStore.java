package org.example.hamburgerStoreFactoryPattern;

public abstract class HamburgerStore {


    public Hamburger orderHamburger(String type){
        Hamburger burger;
        burger = createHamburger(type);

        burger.prepape();
        burger.cook();
        burger.box();

        return burger;
    }

    abstract public Hamburger createHamburger(String type);
}
