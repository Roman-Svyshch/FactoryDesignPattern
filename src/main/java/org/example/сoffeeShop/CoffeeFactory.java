package org.example.сoffeeShop;

public class CoffeeFactory {

    public Coffee createCoffee(String type){

        return switch (type.toLowerCase()) {
            case "espresso" -> new EspressoCoffee();
            case "cappuccino" -> new CappuccinoCoffee();
            case "latte" -> new LatteCoffee();
            default -> throw new IllegalArgumentException("Unknown type of coffee " + type);
        };
    }
}
