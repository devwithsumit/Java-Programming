package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Q68_PrimeCheck {
    //prime number - only 2 factors 1 and the number itself;
    //return true if number is prime;
    static boolean primeCheck(int n) {
        boolean isPrime = true; //initially true
        if (n == 0 || n == 1) return false;//for 0 and 1
        for (int i = 2; i <= n / 2; i++) { /*0 to n/2 (50/2 = 25)*/
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {
//        int[] arr = {1, 2, 4, 6, 7, 8, 9, 11};
        var primeArray = new ArrayList<>();
        for (int i = 0; i <= 100; i++) {
            if (primeCheck(i)) primeArray.add(i);
        }
        ;
        System.out.println("Prime numbers:\n" + primeArray);
    }
}
