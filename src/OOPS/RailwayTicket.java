package OOPS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RailwayTicket {
    String name;
    String coach;
    long contact;
    int amount;
    int totalBill;

    public RailwayTicket() {
    }

    public RailwayTicket(String name, String coach, long contact, int amount, int totalBill) {
        this.name = name;
        this.coach = coach;
        this.contact = contact;
        this.amount = amount;
        this.totalBill = totalBill;
    }

    public void accept(String name, String coach, long contact, int amount) {
        this.name = name;
        this.coach = coach;
        this.contact = contact;
        this.amount = amount;
    }

    public void update() {
        switch (this.coach) {
            case "First_AC" -> this.totalBill = 700 + amount;
            case "Second_AC" -> this.totalBill = 500 + amount;
            case "Third_AC" -> this.totalBill = 250 + amount;
            default -> this.totalBill = amount;
        }
    }

    public void display() {
        System.out.println(STR."Name: \{name}, \nCoach: \{coach}, \nContact: \{contact}, \nAmount: \{amount}, \nTotal Bill: ₹\{totalBill}");
    }

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        // name input
        System.out.print("Enter your full name: ");
        String name = br.readLine();

        //coach in form of number input
        System.out.print("Enter coach (1 - First AC, 2 - Second AC, 3 - Third AC, 4 - Sleeper, 5 - General):");
        int input = Integer.parseInt(br.readLine());

        String coach;// coach String
        switch (input) { // convert coach from number to string
            case 1 -> coach = "First_AC";
            case 2 -> coach = "Second_AC";
            case 3 -> coach = "Third_AC";
            case 4 -> coach = "Sleeper";
            default -> coach = "General";
        }
        // mobile number input
        System.out.print("Enter your mobile number: ");
        long contact = Long.parseLong(br.readLine());

        // extra amount input
        System.out.print("Enter the amount: ");
        int amount = Integer.parseInt(br.readLine());

        // creating new ticket object
        RailwayTicket t1 = new RailwayTicket("name", "coach", 0, 0, 0);
        // methods
        t1.accept(name, coach, contact, amount);
        t1.update();
        t1.display();
    }
}
