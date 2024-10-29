package Loops;

import java.util.Scanner;

public class Q32_PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number to Check it's a prime or not: ");
        int n = sc.nextInt();
        int factorsCount = 0;
        for (int i = 1; i <= n; i++) {
            if(n % i == 0) {
                factorsCount += 1;
            }
        }
        System.out.print(factorsCount == 2 ? "Prime": "Not Prime");
    }
}
