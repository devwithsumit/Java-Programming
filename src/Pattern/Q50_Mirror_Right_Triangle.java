package Pattern;

public class Q50_Mirror_Right_Triangle {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

//            // Alternate Method without using spaces;
//            for (int j = 1; j <= n; j++) {
//                if (i + j >= n + 1) System.out.print("* ");
//                else System.out.print("- ");
//            }
            System.out.println();
        }
    }
}
