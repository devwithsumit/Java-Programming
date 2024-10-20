package Basics;

import java.util.Scanner;

public class Q9_TriangleArea_HeronsFormula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side a: ");
        double a = sc.nextInt();
        System.out.print("Enter side b: ");
        double b = sc.nextInt();
        System.out.print("Enter side c: ");
        double c = sc.nextInt();
        double semiP = (a + b + c) / 2;
        double area = Math.sqrt(semiP * (semiP - a) * (semiP - b) * (semiP - c));
        System.out.printf("Area of rectangle is : %.2f", area);
    }
}
