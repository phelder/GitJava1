package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");
        Person p1 = new Person("Bob", 20, "NY");
        System.out.println(p1);

        Car c1 = new Car("Honda", "Civic", 2002);
        System.out.println(c1);


        Cat garfield = new Cat(true,"Garfield",10);
        Cat filemon = new Cat(true,"Filemon",10);

        System.out.println(garfield);
        System.out.println(filemon);

    }
}
