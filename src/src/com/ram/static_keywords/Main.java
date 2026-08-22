package com.ram.static_keywords;

public class Main {
    public static void main(String[] args) {
        Human obj = new Human(21, "Ram",100, false);
        Human obj1 = new Human(21, "Sony",1000, true);
        Human obj2 = new Human(21, "Abhi",1000, true);

        System.out.println(obj.name);
        System.out.println(obj.population); //Human.population is the right way to access the static variable
        System.out.println(obj1.population);
        System.out.println(obj2.population);


        System.out.println(Human.population);
        System.out.println(Human.population);
        System.out.println(Human.population);

    }
}
