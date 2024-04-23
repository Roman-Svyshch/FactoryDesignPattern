package org.example.carFactorty;

public class Car {
    public String name;
    public String model;
    public String type;
    public int year;

    public String releaseCar(){
        return name + " " + model + " was released at " + year;
    }
}
