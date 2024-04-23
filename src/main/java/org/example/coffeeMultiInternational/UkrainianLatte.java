package org.example.coffeeMultiInternational;

public class UkrainianLatte extends Coffee {
    public UkrainianLatte() {
        name = "Ukrainian Latte";
        description = "This is heaven Ukrainian Latte.";
    }

    @Override
    public void preparing() {
        System.out.println("Cooking Latte");
    }
}
