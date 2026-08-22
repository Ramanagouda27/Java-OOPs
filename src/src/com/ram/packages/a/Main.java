package com.ram.packages.a;

import com.ram.packages.b.Message;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world from package a");

        //calling imported static method
        Message.message();
    }
}
