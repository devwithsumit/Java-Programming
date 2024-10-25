package Practice;

public class Q4_HCF {
    public static void main(String[] args) {
        int n = 20, m = 12, HCF = 1;
        for (int i = 1; i <= Math.max(n , m) / 2; i++) {
            if (n % i == 0 && m % i == 0) HCF = i;;
        }
        System.out.println(HCF);
    }
}
