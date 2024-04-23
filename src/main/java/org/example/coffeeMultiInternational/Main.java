package org.example.coffeeMultiInternational;

public class Main {
    public static void main(String[] args) {
        CoffeeFactory ukrainianFactory = new UkrainianCoffeeFactory();

        Coffee espresso = ukrainianFactory.createEspresso();
        System.out.println(espresso.name);
        System.out.println(espresso.description);
        espresso.preparing();

    }
}
