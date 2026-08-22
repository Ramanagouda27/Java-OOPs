package com.ram.static_keywords;

public class A {
    public static void main(String[] args) {

        // you cannot access non static stuff without referencing their instances in
        // a static context
        A programinstance = new A();
        programinstance.greeting();
    }
    void greeting(){
        System.out.println("Hello !!");
    }
}
