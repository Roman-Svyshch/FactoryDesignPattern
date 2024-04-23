package org.example.сoffeeShop;

public class CoffeeShop {
    public static void main(String[] args) {
        Coffee espresso = new EspressoCoffee();
        Coffee cappuccino = new CappuccinoCoffee();
        Coffee latte = new LatteCoffee();
        espresso.brew();
        cappuccino.brew();
        latte.brew();
    }
}
