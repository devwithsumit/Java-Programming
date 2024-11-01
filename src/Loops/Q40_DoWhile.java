package Loops;

import java.util.Scanner;

public class Q40_DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter 1 to repeat the task or any other key to exit");
        do{
            System.out.print("Enter here: ");
            n = sc.nextInt();
        }while (n != 0);
    }
}
