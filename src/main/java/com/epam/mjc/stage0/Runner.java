package com.epam.mjc.stage0;

public class Runner {
    public static void main(String[] args) {
        System.out.println(new Animal("red", 3, true).getDescription());
        System.out.println(new Dog().getDescription());
        System.out.println(new Bird().getDescription());
    }
}
