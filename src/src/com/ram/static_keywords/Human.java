package com.ram.static_keywords;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population; // static variable means common to everyone


    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population +=1;

    }
}
