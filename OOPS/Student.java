package OOPS;
import Strings.Greeting;
import dsa_patterns.butterfly_pattern;
import org.w3c.dom.ls.LSOutput;

import java.util.* ;
import java.io.*;
import static Strings.Greeting.*;
class Student {
    int rno;
    String name;
    float marks = 90;

    public Student() {
        this.rno = 44;
        this.name = "Simran kaur";
        this.marks = 100;
        System.out.println("Default constructor");
        System.out.println(rno + " " + name + " " + marks);
    }

    public Student(int r_no, String name, int marks) {
        this.rno = r_no;
        this.name = name;
        this.marks = marks;
        System.out.println(rno + " " + name + " " + marks);

    }


    public static void main(String[] args) {
        Student S = new Student();
        Student smaeyra = new Student(15, "smaeyra", 150);
        Student aryan = new Student(16, "Aryan", 149);
        int a = 10; //wrapper class
        Integer num = 45; // num is an object
        String s = num.toString(35);
        System.out.println(s + 10);
//final keyword
        final int bonus = 25;
//     bonus = 45 ; this is giving an error coz we can't modify it due to final keyword .
        Greeting(); //imported from Greeting class
    }
}