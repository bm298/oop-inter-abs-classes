package org.example;

public class Aeroplane extends Vehicle implements Flyable, Drivable{
    @Override
    public void move() {
        System.out.println("Aeroplane is flying.");
    }
}
