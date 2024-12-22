package OOPS;

import java.util.Scanner;

public class ArrayOfObject {
    int age;
    String name;

    ArrayOfObject(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return STR."ArrayOfObject{\nage=\{age}, \n\tname='\{name}'\n}";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        ArrayOfObject[] arr = new ArrayOfObject[size];
        for (int i = 0; i < arr.length; i++) {
            sc.nextLine();
            System.out.println("Enter name ");
            String name = sc.nextLine();
            System.out.println("Enter  age ");
            int age = sc.nextInt();
            arr[i] = new ArrayOfObject(age, name);
        }

        for (ArrayOfObject a : arr) {
            System.out.println(a);
        }
    }
}
