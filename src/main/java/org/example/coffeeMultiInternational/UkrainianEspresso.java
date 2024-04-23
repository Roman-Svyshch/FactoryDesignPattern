package org.example.coffeeMultiInternational;

public class UkrainianEspresso extends Coffee {
    public UkrainianEspresso() {
        name = "Ukrainian espresso";
        description = "This is heaven Ukrainian espresso.";
    }

    @Override
    public void preparing() {
        System.out.println("Cooking espresso");
    }
}
