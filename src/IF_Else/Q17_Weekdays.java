package IF_Else;

import java.util.Scanner;

public class Q17_Weekdays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] days = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        System.out.print("Enter any number from 1-7: ");
        int input = sc.nextInt();
        try {
            System.out.println(days[input - 1]);
        } catch (Exception e) {
            System.out.println(e.getMessage());;
        }
    }
}
