package com.company;

public class Dog {
    private String race;
    private String name;
    private int age;

    public Dog(String race, String name, int age) {
        this.race = race;
        this.name = name;
        this.age = age;
    }

    public String getRace() {
        return race;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
