package com.example;

public class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public String makeSound() {
        return "Voff";
    }
}
