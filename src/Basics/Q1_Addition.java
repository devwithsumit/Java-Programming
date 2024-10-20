package Basics;

import java.util.Scanner;

public class Q1_Addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.println("The sum is: " + (a + b));
    }
}