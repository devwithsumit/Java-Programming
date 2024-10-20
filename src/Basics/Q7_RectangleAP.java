package Basics;

import  java.util.Scanner;

public class Q7_RectangleAP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        int l = sc.nextInt();
        System.out.print("Enter breadth: ");
        int b = sc.nextInt();
        int perimeter = 2 * (l + b);
        int area = l * b;
        System.out.println("perimeter of rectangle is :" + perimeter);
        System.out.println("Area of rectangle is :" + area);
    }
}
