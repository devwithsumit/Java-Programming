package Loops;

public class Q0_Chronological_DigitSeparation {
    public static void main(String[] args) {
        int n = 3458;
        int length = 0, temp = n;
//        calculating length
        while (temp > 0) {
            length++;
            temp /= 10;
        }
//        divisor = 1 + 0s(length - 1)
        int divisor = (int) Math.pow(10, (length - 1));
        while (divisor > 0) {
            System.out.println(STR."\{n / divisor % 10}, ");
            divisor /= 10;
        }
    }
}
