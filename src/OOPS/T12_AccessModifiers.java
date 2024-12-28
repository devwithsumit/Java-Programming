package OOPS;

public class T12_AccessModifiers {
    private   int a = 10;
    /**
     * default - within package level
     * private - within the class level where it is declared.
     * public - global level
     * protected :
     * --- package level with an Exception
     * --- outside package - only child class && only using the child class ref.
     */
    static class Student{
        static private int a;
    }
    public static void main(String[] args) {
        Student obj = new Student();
//        System.out.println(obj.a);
    }
}
