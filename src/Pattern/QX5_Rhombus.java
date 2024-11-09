package Pattern;

import java.util.Scanner;

public class QX5_Rhombus {
    public static void main(String[] args) {
        int n = 3;
        int i, j;
        for (i = 1; i <= n; i++) {
            // inner loop to print spaces
            for (j = 1; j <= n - i; j++) {
                System.out.print("- ");
            }
            // inner loop to print stars
            for (j = 1; j <= (2 * i) - 1 /*up to 7*/; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (i = 2; i <= n; i++) {
            for (j = 1; j <= i - 1; j++) {
                System.out.print("- ");
            }
            for (j = 1; j <= 2 * (n - i) +  1 /*up to 7*/; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        /*Alternate method*/
//        for (i = 1; i <= n * 2 - 1; i++) {
//            for (j = 1; j <= n * 2 - 1; j++) {
//                if (i + j >= n + 1 && j >= i - (n - 1) && j <= n + i - 1 && i + j <= n * 2 + 2) {
//                    System.out.print("* ");
//                } else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }

    }
}
