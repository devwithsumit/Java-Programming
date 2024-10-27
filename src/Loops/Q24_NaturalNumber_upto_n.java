package Loops;

import java.util.Scanner;

public class Q24_NaturalNumber_upto_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(i + (i == n ? "" : ", "));
        }
    }
}
