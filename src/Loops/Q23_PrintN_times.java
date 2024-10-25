package Loops;

import java.util.Scanner;

public class Q23_PrintN_times {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Hello World");
        }
    }
}
