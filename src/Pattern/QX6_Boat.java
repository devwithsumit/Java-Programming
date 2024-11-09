package Pattern;

import java.util.Scanner;

public class QX6_Boat {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.print("Enter the size of the Boat (recommended size 6 - 10): ");
        int n = sc.nextInt();
        n = n == 1 ? 2 : n;
        for (int i = 1; i <= n; i++) {
            //Pushing triangle forward
            for (int j = 1; j <= n; j++) {
                System.out.print(" ");
            }
            //spaces for shaping the triangle
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            //main triangle
            for (int j = 1; j <= i; j++) {
                if (j == 1 || i == n || j == i)
                    System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
        // code for creating the base of the boat
        int baseRows = n <= 3 ? 2 : n <= 7 ? 3 : n/2 - 1;
        for (int i = 1; i <= baseRows; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * n - i) + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
