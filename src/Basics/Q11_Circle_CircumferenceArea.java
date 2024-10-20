package Basics;

import java.util.Scanner;


public class Q11_Circle_CircumferenceArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of the circle: ");
        double radius = sc.nextInt();
        double area =  Math.PI * radius * radius;
        double circumference =  2 * Math.PI * radius;
        System.out.printf("Area of rectangle is ≈ %.2f", area);
        System.out.printf("\nCircumference of rectangle is ≈ %.2f", circumference);
    }
}
