package com.ram.static_keywords;

// outside classes cannot be static
// as it is independent class
public class InnerClass {
    static class Test {
         String name ;

         public Test(String name) {
             this.name = name;
         }
     }

    public static void main(String[] args) {
        Test obj = new Test("Ram");
        Test obj2 = new Test("Rahul");

        System.out.println(obj.name);
        System.out.println(obj2.name);


    }


}
