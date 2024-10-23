package IF_Else;

import java.util.Scanner;

public class Q15_OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        double input = sc.nextDouble();
        if (input % 1 == 0) {
            int a = (int) input;
            if (a % 2 == 0) {
                System.out.print("Even");
            } else {
                System.out.print("Odd");
            }
        } else {
            System.out.print("The number is a decimal, not an integer.");
        }
        sc.close();
    }
}
