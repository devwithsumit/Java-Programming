package Pattern;

import java.util.Scanner;

public class QX4_Palindrome_Triangle {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter number of rows: ");
//        int n = sc.nextInt();
        int n = 4;
        for (int i = 1; i <= n; i++) {
            int dscNumber = i;
            int ascNumber = 2;
            for (int j = 1; j <= n * 2 - 1; j++) {
                if (j < n - i + 1) System.out.print("- ");
                else if(j > n && j < n + i)System.out.print(ascNumber++ + " ");
                else if (j <= n) System.out.print(dscNumber-- + " ");
            }
            System.out.println();
        }
    }
}
