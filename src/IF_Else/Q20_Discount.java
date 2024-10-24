package IF_Else;

public class Q20_Discount {
    public static void main(String[] args) {
        double amount = 8745;
        if(amount > 0 && amount <= 5000){
            System.out.println(amount);
        }else if(amount > 5000 && amount <= 7000){
            System.out.println(amount * 0.9 + " discount = "+ amount * 0.1);
        } else if (amount > 7000 && amount <= 1000) {
            System.out.println(amount * 0.8 + " discount = "+ amount * 0.2);
        }else{
            System.out.println(amount * 0.7 + " discount = "+ amount * 0.3);
        }
    }
}
