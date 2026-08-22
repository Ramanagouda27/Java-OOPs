package com.ram.introduction;

public class WrapperExamples {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        Integer num = 40;

        swap(a,b);

        System.out.println(a + " " + b);

    }

    static void swap(int a , int b){
        int temp = a;
        a = b;
        b = temp;
    }
}
