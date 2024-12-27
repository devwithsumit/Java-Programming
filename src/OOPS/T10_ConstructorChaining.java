package OOPS;

public class T10_ConstructorChaining {
    /** Constructor Chaining:
        • Constructor chaining refers to calling one constructor from another within the same class or across the parent-child class hierarchy.
        • In parent-child relationships, the chain always starts from the top-most parent and ends at the child class constructor. */

    static class Parent {
        Parent(int a) {
            System.out.println("Parent");
        }
    }
    static class Child extends Parent {
        Child() {
            // super(); super() call to Default parent constructor[Parent()] is inserted by the compiler which will give syntax error
            this(10);// call parameterised constructor of the Child
            System.out.println("Default");
        }

        Child(int a) {
            super(a); // calling the parameterised constructor of the Parent
            System.out.println("Parameterised");
        }
    }

    public static void main(String[] args) {
        Child c = new Child(); // Compilation error!
    }
}
