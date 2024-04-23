package org.example.hamburgerStoreFactoryPattern;

public class JamaikanChesseBurger extends Hamburger {

    public JamaikanChesseBurger() {
    name = "Jamaikan Cheese Burger ";
    sauce = " Jamaican Chiily sause";
    buns = "Cookie dough buns!";
    }

    @Override
    public void cook() {
        System.out.println("Cooking Jamaican style");
    }
}
