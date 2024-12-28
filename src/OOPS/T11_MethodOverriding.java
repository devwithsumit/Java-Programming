package OOPS;
/** Definition:- Method overriding allows a child class to provide a specific implementation of a method that is already defined in its parent class.
It enables runtime polymorphism, where the call to an overridden method is resolved dynamically during runtime.*/


public class T11_MethodOverriding {
    static class Animal {
        void sleep() {
            System.out.println("Animal sleeping 💤.");
        }
    }

    static class Owl extends Animal {
        @Override
        void sleep() {
            System.out.println("Owl is awake 🦉");
        }
    }

    public static void main(String[] args) {
        Animal obj = new Owl(); // Dynamic method dispatch
        obj.sleep();            // Calls Child's overridden method

        /** if you want to access non-static nested class (non-static members of the enclosing class)
         method given below can be used.*/
//         T11_MethodOverriding outer = new T11_MethodOverriding(); // Create enclosing class object
//         Animal obj1 = outer.new Owl(); // Create inner class object
    }
}
