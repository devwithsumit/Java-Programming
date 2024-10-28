package Loops;

import java.util.Scanner;

public class Q28_Factorial {
    public static void main(String[] args) {
        int n = 5;
        int fact = 1;
        for (int i = n; i >= 1; i--) {
            fact *= i;
            System.out.print(i + (i == 1 ? " = " : " * "));
        }
        System.out.printf("%d", fact);
    }
}
