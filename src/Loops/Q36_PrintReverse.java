package Loops;

import java.util.Scanner;

public class Q36_PrintReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int n = sc.nextInt();
        int reverse = 0;
        while (n > 0) {
            reverse = reverse * 10 + (n % 10);
            n /= 10;
        }
        System.out.print(reverse);
    }
}
