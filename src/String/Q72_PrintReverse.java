package String;

public class Q72_PrintReverse {
    public static void main(String[] args) {
        String s = "hello";
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(s.length() - i - 1));
        }
    }
}
