package OOPS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T3Q1_CabService {
    String car_type;
    double km;
    double bill;

    // constructor
    public T3Q1_CabService() {
        this.car_type = "";
        this.km = 0;
        this.bill = 0;
    }
    //accept method
    public void accept(String car_type, double km) {
        this.car_type = car_type;
        this.km = km;
    }
    //calculate method
    public void calculate() {
        if(this.car_type.equalsIgnoreCase("A")){
            if(this.km <= 5) this.bill = 150;
            else {
                this.bill = 10 * (this.km - 5) + 150;
            }
        }else{ // Non - Ac
            if (this.km <= 5) this.bill = 120;
            else {
                this.bill = 8 * (this.km - 5) + 120;
            }
        }
    }
    // display method
    public void display() {
        System.out.println(STR."CAR TYPE: \{car_type.toUpperCase()}, \nKILOMETER TRAVELLED: \{km}, \nTOTAL BILL: ₹\{bill}");
    }

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br =  new BufferedReader(isr);

        T3Q1_CabService s1 = new T3Q1_CabService();

        System.out.print("Select the car type: a for AC or n for Non Ac: ");
        String car_type = br.readLine();
        System.out.print("Enter the Kilometer travelled: ");
        int km = Integer.parseInt(br.readLine());
        if(car_type.equalsIgnoreCase("A")) s1.accept("AC Car",km);
        else s1.accept("Non AC Car",km);
        s1.calculate();
        s1.display();
    }
}
