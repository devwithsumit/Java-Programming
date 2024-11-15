package Practice;

public class Q14_PascalTrianglePattern {
    public static void main(String[] args) {
        int n = 3;
        for (int i = 0; i <= n + 1; i++) {
            int first = 1;
            for (int j = 0; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i + 1; j++) {
                System.out.print(first + "   ");
                first = first * (i + 1 - j) / j;
            }
            System.out.println();
        }
    }
}
