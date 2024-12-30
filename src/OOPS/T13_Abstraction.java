package OOPS;

public class T13_Abstraction {
    abstract class Animal {
        int anInt;
        /** Abstract method forces it's class to be abstract */
        abstract void sound(); // Abstract method - Semi-implementation

        abstract void eat(); // Second abstract method

        void sleep(){   // Concrete method
            System.out.println("Animal sleeps");
        }
    }

    class Dog extends Animal {
        /** Derived class must override all abstract methods of the parent class.*/
        @Override
        void sound() {
            System.out.println("Dog barks.");
        }
        void eat(){
            System.out.println("This animal eats food.");
        }
    }

    public static void main(String[] args) {

    }
}
