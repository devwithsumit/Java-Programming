package OOPS;

public class T12_FinalKeyword {
    /** Final keyword: Used to create constants (values that cannot change after initialization).
      • Final variable :- cannot be reassigned
      • Final method  :- cannot be overridden
      • Final Class  :- cannot be inherited*/

    final static class Parent{
        /** Declaring a class final makes it's all method final by default except variables.*/
        int a = 0;
        final void print(){
            System.out.println("Parent");
        }
    }
//    static class Child extends Parent{ // Compilation error: Cannot extend a final class
//        // Compilation error: Cannot override final method
//        void print(){
//            System.out.println("Child");
//        }
//    }
    public static void main(String[] args) {
        final int a = 9;
//        a = 6; //Cannot assign a value to final variable 'a'
    }
}
