package IF_Else;

import java.util.Scanner;

public class Q19_LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        if(year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)){
            System.out.println("Leap Year");
        }else{
            System.out.println("Not a Leap Year");
        }
        sc.close();
    }
}
