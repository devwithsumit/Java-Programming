package IF_Else;

import java.util.Scanner;

public class Q16_VoterChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.next();
        System.out.print("Enter your age: ");
        double age = sc.nextDouble();
        if(age % 1 == 0){
            int a = (int) age;
            if(a >= 18)
                System.out.println("Hello " + name + " you are a valid voter");
            else{
                System.out.println("Sorry " + name + " you are a not yet a valid voter");
                System.out.println("After " + (18 - a) + " years you will be a valid voter");
            }
        }else{
            System.out.println("Please enter an integer value for age");
        }
    }
}
