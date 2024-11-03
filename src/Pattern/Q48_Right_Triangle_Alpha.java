package Pattern;

public class Q48_Right_Triangle_Alpha {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            char letter = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print(letter++ + " ");
            }
            System.out.println();
        }
    }
}
