package Loops;

public class Q38_StrongNum {
    public static void main(String[] args) {
        int n = 145;
        int originalNum = n, sum = 0;
        while (n > 0) {
            sum += fact((n%10));
            n /= 10;
        }
        System.out.println(sum == originalNum ? "Strong" : "Not a armstrong");
    }
    public static int fact(int a) {
        if(a == 1) return 1;
        return a * fact(a - 1);
    }
}
