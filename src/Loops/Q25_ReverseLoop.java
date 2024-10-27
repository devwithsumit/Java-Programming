package Loops;

import java.util.Scanner;

public class Q25_ReverseLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            System.out.print(i + (i == 1 ? "" : ", "));
        }
    }
}
