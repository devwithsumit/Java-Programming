package OOPS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class T3Q3_RestaurantManagement {
    static class Restaurant {
        String customerName = "";
        String foodType = "Indian";
        List<String> selectedDishes = new ArrayList<>();

//        Restaurant(){
//            List
//        }

        int totalBill  = 0;
        void accept() throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter name: ");
            customerName = br.readLine();
            System.out.println("Enter food type (Indian, Chinese, Italian)");
            foodType = br.readLine();
            System.out.println("Enter ");
        }
    }
}