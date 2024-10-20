package Basics;

import java.util.Scanner;

public class Q8_CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal amount: ");
        double principal = sc.nextInt();
        System.out.print("Enter Rate in %: ");
        double rate = sc.nextDouble() / 100;
        System.out.print("Enter number of times interest is compounded/year: ");
        int timesCompounded = sc.nextInt();
        System.out.print("Enter the time the money is invested for (in years): ");
        int years = sc.nextInt();

        double amount = principal * Math.pow((1 + (rate / timesCompounded)), timesCompounded * years);
        System.out.printf("The Amount generated will be : %.2f", amount);
        System.out.printf("\nThe total interest earned will be: %.2f", (amount - principal));
    }
}