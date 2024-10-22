package IF_Else;

import java.util.Scanner;

public class Q13_Q14_GenderBasedGreet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your gender (f/F for female,m/M male, any key for others): ");
        String gender = sc.next();
        if(gender.equalsIgnoreCase("f")){
            System.out.println("Good morning Ma'am.");
        }else if(gender.equalsIgnoreCase("m")){
            System.out.println("Good Morning Sir.");
        }else{
            System.out.println("Good Morning to all others.");
        }
    }
}
