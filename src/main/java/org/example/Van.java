package org.example;

public class Van extends Vehicle implements Drivable {

        @Override
        public void move() {
            System.out.println("Van is driving.");
        }

}
