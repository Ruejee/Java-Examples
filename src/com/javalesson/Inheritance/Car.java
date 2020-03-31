package com.javalesson.Inheritance;

public class Car extends Auto {
    public Car(String producer, String model, Engine engine) {
        super(producer, model, engine);
        System.out.println("Car was initialized");
    }
}
