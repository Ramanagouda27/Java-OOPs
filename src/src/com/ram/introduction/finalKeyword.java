package com.ram.introduction;

import java.io.StringReader;
import java.lang.invoke.StringConcatException;

public class finalKeyword {
    public static void main(String[] args) {

        //final behaviour for primitive types
        final int BONUS = 2;


        //final behaviour for reference objects
        Last one = new Last("ram");
        one.name = "rahul";
        System.out.println(one.name);

        //when a non-primitive is finalized then you cant do the object referencing
        one = new Last("patil");

    }
    static class Last{
        final int num = 10;
        String name;

        public Last(String name){
            this.name = name;
        }

    }
}
