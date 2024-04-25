package org.example;

public class Lorry extends Vehicle implements Drivable{

    @Override
    public void move() {
        System.out.println("Lorry is driving.");
    }


}
