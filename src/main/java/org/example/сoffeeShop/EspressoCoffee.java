package org.example.сoffeeShop;

public class EspressoCoffee implements Coffee{
    @Override
    public void brew() {
        System.out.println("Cooking espresso ");
    }
}
