package Pattern;

public class Q52_VShape {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {

//            Sumit ka ghisa pita method 😅
//            for (int j = 1; j < i; j++) {
//                System.out.print(" ");
//            }
//            System.out.print("* ");
//            for (int k = 1; k <= n - i - 1; k++) {
//                System.out.print("  ");
//            }
//            if (i != n) System.out.print("* ");

//            Bhaiya ka tarika 🗿
            for (int j = 1; j <= n * 2; j++) {
                if (j == i || i + j == n * 2) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
