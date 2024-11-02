package Loops;

import java.util.Scanner;

public class Q41_Calculator {
    public static void main(String[] args) {
        long body = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.print("1 for addition" +
                "\n2 for Subtraction" +
                "\n3 for multiplication" +
                "\n4 for division" +
                "\nOther key to exit : ");
        int input = sc.nextInt();
        double output = switch (input) {
            case 1 -> a + b;
            case 2 -> a - b;
            case 3 -> a * b;
            case 4 -> (double) a / b;
            default -> 0;
        };
        System.out.println(output);
    }
}
