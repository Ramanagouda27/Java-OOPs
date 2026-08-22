package com.ram.Singleton;

public class Main {
    public static void main(String[] args) {
        Singelton obj1 =  Singelton.getInstance();

        Singelton obj2 =  Singelton.getInstance();

        Singelton obj3 =  Singelton.getInstance();

        // all 3 reference variables are pointing to just one object
    }
}
