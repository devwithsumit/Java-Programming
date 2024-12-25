package OOPS;
// Definition: Methods declared with the static keyword belong to the class, not a specific object.
public class T6_StaticMethods {
    /*Key Features:
      • Can be invoked using the class name.
      • Can access only static fields or methods directly.
      • Cannot access instance fields or methods unless explicitly passed an object reference.*/
    static int a;
    static void method1(){
        System.out.println(a);
    }

    public static void main(String[] args) {
        T6_StaticMethods obj = new T6_StaticMethods();
        /* If tried to invoke via object's reference then
        reference name will be replaced by class name at runtime.*/
        obj.method1();
    }
}
