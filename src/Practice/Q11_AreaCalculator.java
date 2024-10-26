package Practice;

import java.util.Scanner;

public class Q11_AreaCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean repeat = false;
        int n;
        do {
            System.out.print("Enter the 1 for square 2 for rectangle 3 for circle: ");
            n = sc.nextInt();
            switch (n){
                case 1 ->{
                    System.out.print("Enter side : ");
                    int side = sc.nextInt();
                    System.out.println("Area  = " + side * side);
                }
                case 2 -> {
                    System.out.print("Enter Length : ");
                    int length = sc.nextInt();
                    System.out.print("Enter breadth : ");
                    int breadth = sc.nextInt();
                    System.out.println("Area  = " + length * breadth);
                }
                case 3 ->{
                    System.out.print("Enter radius : ");
                    int radius = sc.nextInt();
                    System.out.println("Area  = " + Math.PI * radius * radius);
                }
            }
            System.out.print("Enter 1 for repeat any other for repeat :");
            n = sc.nextInt();
        }while (n == 1);
        System.out.println("Thank You for Using");
    }
}
