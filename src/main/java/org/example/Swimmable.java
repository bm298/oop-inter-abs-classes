package org.example;

public interface Swimmable {
    default void swim() {
        System.out.println("Default swimming behavior");
    }
}
