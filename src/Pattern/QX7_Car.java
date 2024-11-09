package Pattern;

public class QX7_Car {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 2; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= (2 * i) + n - 2; j++) {
                if (j == 1 || i == n || i == 1 || j == 2 * i + n - 2)
                    System.out.print("* ");
                else System.out.print(". ");
            }
            System.out.println();
        }
        for (int i = 1; i <= n / 2 + 2; i++) {
            //main trapezium
            for (int j = 1; j <= 3 * n + 2; j++) {
                if (i == n / 2 + 2 && j == 2) {
                    System.out.print("  ");
                } else if (i == n / 2 + 2 && j == 3 * n) {
                    System.out.print("  ");
                }
                else System.out.print("* ");
            }
            System.out.println();
        }
    }
}
