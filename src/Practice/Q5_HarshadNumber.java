package Practice;

public class Q5_HarshadNumber {
    public static void main(String[] args) {
        int n = 102;
        int sum = 0, temp = n;
        while (n > 0){
            sum += n % 10;
            n /= 10;
        }
        System.out.println(temp % sum == 0 ? "Harshad Number": "Not a Harshad Number");
    }
}
