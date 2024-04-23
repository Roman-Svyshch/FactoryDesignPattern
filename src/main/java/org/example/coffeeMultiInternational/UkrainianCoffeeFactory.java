package org.example.coffeeMultiInternational;

public class UkrainianCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee createEspresso() {
        return new UkrainianEspresso();
    }

    @Override
    public Coffee createCappuccino() {
        return new UkrainianCappuccino();
    }

    @Override
    public Coffee createLatte() {
        return new UkrainianLatte();
    }
}
