package IF_Else;

public class Q21_Bill {
    public static void main(String[] args) {
        double price = 4.2;
        int units = 313;
        int u100 = 420, u200 = 1020, u400 = 2620;
        if(units > 0 && units <= 100){
            System.out.println(units * price);
        } else if (units > 100 && units <= 200) {
            units = units - 100;
            System.out.println(u100 + units * 6);
        } else if (units > 200 && units <= 400) {
            units = units - 200;
            System.out.println(u200 + units * 8);
        }else{
            units = units - 400;
            System.out.println(u400 + units * 13);
        }
    }
}
