package Practice;

import java.util.Scanner;

public class Q1_MovieRating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rating: ");
        double rating = sc.nextDouble();
        System.out.print("Enter movie name: ");
//        sc.nextLine();
        String name = sc.nextLine();
        if(rating >= 4.6)
            System.out.println(name + " is a Super Hit movie");
        else if (rating >= 3.5) {
            System.out.println(name + " is a Hit movie");
        } else if (rating >= 2.1) {
            System.out.println(name + " is a Semi-hit movie");
        }
        else
            System.out.println(name + " is a Flop movie");
    }
}

