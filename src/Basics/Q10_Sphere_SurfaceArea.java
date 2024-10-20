package Basics;

import java.util.Scanner;


public class Q10_Sphere_SurfaceArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of the sphere: ");
        double radius = sc.nextInt();
        double surface_area = 4 * Math.PI * radius * radius;
        System.out.printf("Area of rectangle is ≈ %.2f", surface_area);
    }
}
