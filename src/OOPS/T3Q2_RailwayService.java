package OOPS;

import java.util.Scanner;

public class T3Q2_RailwayService {
    String name;
    String coach;
    long contact;
    int amount;
    int totalAmount;

    T3Q2_RailwayService(){
        name = "";
        coach = "";
        contact = 0;
        amount = 0;
        totalAmount = 0;
    }
    void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter full name: ");
        name = sc.nextLine();
        System.out.print("Enter coach: ");
        coach = sc.nextLine();
        System.out.print("Enter mobile number: ");
        contact = sc.nextLong();
        System.out.print("Enter amount: ");
        amount = sc.nextInt();
    }
    void update(){
        switch (this.coach){
            case "First_AC" -> totalAmount = 700 + amount;
            case "Second_AC" -> totalAmount = 500 + amount;
            case "Third_AC" -> totalAmount = 300 + amount;
            default -> totalAmount = amount;
        }
    }
    void display(){
        System.out.println("Name: " + name);
        System.out.println("Coach: " + coach);
        System.out.println("Mobile No: " + contact);
        System.out.println("Total Amount to be paid: " + totalAmount);
    }

    public static void main(String[] args) {
        T3Q2_RailwayService r1 = new T3Q2_RailwayService();
        r1.accept();
        r1.update();
        r1.display();
    }
}
