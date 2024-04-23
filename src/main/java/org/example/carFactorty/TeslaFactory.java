package org.example.carFactorty;

public class TeslaFactory implements CarFactory{

    public Car createCar(String type) {
        switch (type.toLowerCase()){
            case "model 3" -> {
                return new TeslaModelThree();
            }
            default -> throw new IllegalArgumentException("Unknown type of car");
        }
    }

}
