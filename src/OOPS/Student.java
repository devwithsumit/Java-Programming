package OOPS;

public class Student {
    int age;
    String name;

/*  *** this is compulsory in case of conflict
    Means - without this keyword it will target the nearest variable
    with this keyword it will target only the data members/attributes/instance fields. */


    //    initialization via method
    void init(String n, int a) {
        this.name = n;
        this.age = a;
    }
//    compile time polymorphism
    //constructor overloading
    Student(){

    }

    //    constructor initialisation
    Student(String n, int a) {
        this.name = n;
        this.age = a;
    }

    public String toString() {
        return STR."{Student={ name : \{name}, age : \{age}}";
    }
}
