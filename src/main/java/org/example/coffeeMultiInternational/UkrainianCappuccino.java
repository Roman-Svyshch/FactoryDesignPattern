package org.example.coffeeMultiInternational;

public class UkrainianCappuccino extends Coffee {
    public UkrainianCappuccino() {
        name = "Ukrainian cappuccino";
        description = "This is heaven Ukrainian cappuccino.";
    }

    @Override
    public void preparing() {
        System.out.println("Cooking cappuccino");
    }
}
