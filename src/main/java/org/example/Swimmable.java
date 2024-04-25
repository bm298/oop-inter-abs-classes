package org.example;

public interface Swimmable {
    void swim() {
        System.out.println(this.getClass().getSimpleName() + " is swimming!");
    }
}
