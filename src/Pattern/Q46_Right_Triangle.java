package Pattern;

public class Q46_Right_Triangle {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            //Alernate Method
//            for (int j = 1; j <= n; j++) {
//                if (j <= i) System.out.print("* ");
//                else System.out.print("- ");
//            }
            System.out.println();
        }
    }
}
