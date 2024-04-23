package org.example.carFactorty;

public class Main {
    public static void main(String[] args) {
        CarFactory tesla = new TeslaFactory();
       Car car =  tesla.createCar("model 3");
        System.out.println(car.releaseCar());

    }
}
