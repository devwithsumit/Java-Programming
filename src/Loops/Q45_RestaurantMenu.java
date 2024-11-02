package Loops;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Q45_RestaurantMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the variety");
        int choice;
        do {
            System.out.println("1 for Italian, 2 for India, 3 for Chinese: ");
            choice = sc.nextInt();
            switch (choice){
                case 1 -> {
                    System.out.println("Italian Menu");
                    System.out.println("1 for pizza, 2 for pasta");
                    choice = sc.nextInt();
                    switch (choice){
                        case 1 -> System.out.println("Pizza ordered");
                        case 2 -> System.out.println("Pasta ordered");
                    }
                }
                case 2 ->{
                    System.out.println("Indian Menu");
                    System.out.println("1 for Chhole Bhature, 2 for Paratha");
                    choice = sc.nextInt();
                    switch (choice){
                        case 1 -> System.out.println("Chhole Bhature ordered");
                        case 2 -> System.out.println("Paratha ordered");
                    }
                }
                case 3 ->{
                    System.out.println("Chinese Menu");
                    System.out.println("1 for Chow mein, 2 for Noodles");
                    choice = sc.nextInt();
                    switch (choice){
                        case 1 -> System.out.println("Chow mein ordered");
                        case 2 -> System.out.println("Noodles ordered");
                    }
                }
            }
            System.out.println("Press 1 for Close !");
        }while (choice == 1);
    }
}
