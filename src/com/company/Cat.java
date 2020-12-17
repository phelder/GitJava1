package com.company;

public class Cat {
    private boolean isFat;
    private String name;
    private int age;

    public Cat(boolean isFat, String name, int age) {
        this.isFat = isFat;
        this.name = name;
        this.age = age;
    }

    public boolean isFat() {
        return isFat;
    }

    public void setFat(boolean fat) {
        isFat = fat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "isFat=" + isFat +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
