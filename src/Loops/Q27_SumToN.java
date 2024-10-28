package Loops;

import java.util.Scanner;

public class Q27_SumToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to get sum up to that number : ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
            System.out.print(i + (i == n ? "" : " + "));
        }
        System.out.printf(" = %d", sum);
    }
}
