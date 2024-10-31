package Loops;

import java.util.Scanner;

public class Q37_PalindromicChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int n = sc.nextInt();

        int originalNum = n;
        int reversedNum = 0;

        while (n > 0) {
            int lastDigit = n % 10;
            reversedNum = reversedNum * 10 + lastDigit;
            n /= 10;
        }
        System.out.println(reversedNum == originalNum ? "Palindrome" : "Non-Palindromic");
    }
}
