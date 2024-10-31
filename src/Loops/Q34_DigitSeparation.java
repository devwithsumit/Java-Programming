package Loops;

public class Q34_DigitSeparation {
    public static void main(String[] args) {
        int n = 2345;
        while (n > 0) {
            System.out.println(n % 10);
            n /= 10;
        }
    }
}

