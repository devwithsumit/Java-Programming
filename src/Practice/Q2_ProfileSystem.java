package Practice;

import java.util.Scanner;

public class Q2_ProfileSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter gender: ");
        char gender = sc.next().charAt(0);
        System.out.print("Enter Years of Service: ");
        int yearsOfService = sc.nextInt();
        System.out.print("Enter Qualification: ");
        char qualification = sc.next().charAt(0);
//        int salary = 15000;
        if (gender == 'm' || gender == 'M') {
            if (yearsOfService >= 10) {
                if (qualification == 'p') {
                    System.out.println("salary = 15000");
                } else if (qualification == 'g') {
                    System.out.println("salary = 10000");
                }
            } else if (yearsOfService >= 0) {
                if (qualification == 'p') {
                    System.out.println("salary = 10000");
                } else if (qualification == 'g') {
                    System.out.println("salary = 7000");
                }
            }
        } else if (gender == 'f' || gender == 'F') {
            if (yearsOfService >= 10) {
                if (qualification == 'p') {
                    System.out.println("salary = 12000");
                } else if (qualification == 'g') {
                    System.out.println("salary = 9000");
                }
            } else if (yearsOfService >= 0) {
                if (qualification == 'p') {
                    System.out.println("salary = 10000");
                } else if (qualification == 'g') {
                    System.out.println("salary = 6000");
                }
            }
        }
    }
}

