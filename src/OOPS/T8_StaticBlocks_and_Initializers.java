package OOPS;

/** Definition: A block of code preceded by the static keyword, executed once when the class is first loaded into memory. */

public class T8_StaticBlocks_and_Initializers {
    /* Key Features: static blocks
      • Executes before any objects are created or static methods are called.
      • Useful for initializing static variables.*/
    /** Key Features: Initializer Blocks
       • Runs each time an object is created.
       • Executes before the constructor.
       • Can be used for initializing instance variables or setting up the object state.*/

    static int value;
    // Static Block :- runs FIRST when class loads no matter object is created of not
    static {
        value = 1;
        System.out.println("Static");
    }

    // Initializer Block :- Runs SECOND, an old method to initialise the instance members of the class
    {
        value = 2;
        System.out.println("Initializer");
    }
    // Constructor :- Runs THIRD, a method used to create objects as well as initialised along with creation;
    T8_StaticBlocks_and_Initializers() {
        value = 3;
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        T8_StaticBlocks_and_Initializers obj = new T8_StaticBlocks_and_Initializers();
    }
}
