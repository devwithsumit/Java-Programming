package Practice;

public class Q12_NeonNum {
    public static void main(String[] args) {
        int n = 9 , sum = 0;
        int square = (int) Math.pow(n, 2);
        while (square > 0){
            sum = sum +  (square % 10);
            square /= 10;
        }
        System.out.println(sum == n ? "Neon" : "Not a Neon");
    }
}
