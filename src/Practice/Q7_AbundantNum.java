package Practice;

public class Q7_AbundantNum {
    public static void main(String[] args) {
        int n = 8, sum = 0;
        for (int i = 1; i <= n/2; i++) {
            if(n % i == 0){
                sum += i;
            }
        }
        System.out.println(sum);
        System.out.println(sum > n ? "Abundant Num" : "Non-Abundant");
    }
}
