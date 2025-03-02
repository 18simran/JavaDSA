package OOPS;

public class Human {
    int age ;
    String name ;
    int salary ;
    boolean married ;
    static int  population ; //now population is common static integer variable for all instances of lass Human .
    public Human(int age , String name , int salary , boolean married) {

        this.age = age  ;
        this.name = name ;
        this.salary = salary ;
        this.married = married ;
        Human.population += 1 ;
    }
}
