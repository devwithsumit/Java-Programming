package Practice;

public class Q13_SumOfFibonacci_toN {
    public static void main(String[] args) {
        int n = 4;
        int first = 0, second = 1, sum = 0;
        for (int i = 0; i <= 2 * n; i++) {
            if(i % 2 == 0) {
                sum += first;
                System.out.print(first + (i != 2 * n ? " + " : " = "));
            }

            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println(sum);
    }
}
