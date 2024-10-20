package Basics;

import java.util.Scanner;

public class Q6_Swapping2Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        a = a + b;
        b = a - b;
        a = a - b;

//        Alternate method
//        int c = a;
//        a = b;
//        b = c;
        System.out.println("a = " + a + "\nb = " + b);
    }
}
