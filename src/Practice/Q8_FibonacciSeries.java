package Practice;

public class Q8_FibonacciSeries {
    public static void main(String[] args) {
        int range  = 10;
        int num1  = 0 , num2 = 1;
        for (int i = 0; i < range; i++) {
            System.out.print(num1 + " ");
            int nextTerm = num1 + num2;
            num1 = num2;
            num2 = nextTerm;
        }
    }
}
