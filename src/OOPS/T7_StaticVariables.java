package OOPS;

/**
Definition :- static variables are shared across all objects of a class
*/
public class T7_StaticVariables {
    /** Key Features:
      • Can only be declared at the class level.
      • Loaded into memory when the class is first loaded.
      • Shared by all instances of the class.
      • Accessible by both static and non-static methods.*/

    static int a = 9;

    void nonStaticDisplay(){
        /** accessing a in non-static method */
        System.out.println("In non-static method -> a: " + a);
    }
    static void staticDisplay(){
        /** accessing a in static method */
        System.out.println("In static method -> a: " + a);
    }

    public static void main(String[] args) {
        T7_StaticVariables obj1 = new T7_StaticVariables();
        T7_StaticVariables obj2 = new T7_StaticVariables();
        //sharing of static variable across different objects
        System.out.println(obj1.a);
        System.out.println(obj2.a);

        obj1.nonStaticDisplay();
        obj1.staticDisplay();
    }
}
