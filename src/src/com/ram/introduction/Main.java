package com.ram.introduction;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Student[] students = new Student[5];

        Student ram = new Student(126,"ram",90.0f);
        Student rahul = new Student(27,"rahul",89);
        Student LOQ = new Student();
        Student lenovo = new Student(ram);
        Student callcons = new Student();

        System.out.println(ram.rno);
        System.out.println(ram.name);
        System.out.println(ram.marks);

        System.out.println(rahul.rno);
        System.out.println(rahul.name);
        System.out.println(rahul.marks);

        System.out.println(LOQ.rno);
        System.out.println(LOQ.name);
        System.out.println(LOQ.marks);

        System.out.println(lenovo.name);

        System.out.println(callcons.rno);
        System.out.println(callcons.name);
        System.out.println(callcons.marks);
    }

    //CREATE A CLASS
    static class Student{
        int rno;
        String name;
        float marks;

        //Student xyz = new Student(20, "patil", 80.0f)
        //here this keyword is replaced with the xyz
        Student(int rno, String name, float marks){
            this.rno = rno;
            this.name = name;
            this.marks = marks;
        }

//        Student(){
//            this.rno = 123;
//            this.name = "Pagal Enter the name";
//            this.marks = 100;
//        }

        Student(Student other){
            this.rno = other.rno;
            this.name = other.name;
            this.marks = other.marks;
        }

        //calling a constructor form other constructor using this key word
        Student(){
            this(999, "Gunda", 100.0f);
        }
    }
}
