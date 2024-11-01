package Loops;

public class Q39_AutomorphicNum {
    public static void main(String[] args) {
        int n = 625;
        int OriginalNum = n;
        int count = 0;
        while (n > 0){
            count++;
            n /= 10;
        }
        long square = OriginalNum * OriginalNum;
        long lastDigitsOfSquare = square % (long) Math.pow(10, count);
        System.out.println(lastDigitsOfSquare == OriginalNum ? "Automorphic": "Non Automorphic");
    }
}
