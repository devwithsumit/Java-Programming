package OOPS;


public class T9_Inheritance {
    static class Parent {
        Parent(int a) {
            System.out.println("Parent: " + a);
        }
    }
    static class Child extends Parent {
        //** Object class is the cosmic class is the root class of all Java classes
        Child() {
            this(15);
            System.out.println("Child");
        }
        Child(int a) {
            super(a);
        }
    }

    public static void main(String[] args) {
        Child obj = new Child();
    }
}
