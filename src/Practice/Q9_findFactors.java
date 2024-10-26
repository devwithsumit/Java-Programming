package Practice;

import java.util.Scanner;

public class Q9_findFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range from 1 to: ");
        int n = sc.nextInt(), requiredDivisors = 4, count = 0;
        for (int i = 1; i <= n; i++) {
            int temp = 1;
            for (int j = 1; j <= i/2; j++) {
                if (i % j == 0) temp++;
            }
            if (temp == requiredDivisors ){
                count++;
                System.out.println(i);
            };
        }
        System.out.println("Total Number of numbers are : " + count);
    }
}
