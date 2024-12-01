package String;

public class Q76_ToggleAlphabets {
    public static void main(String[] args) {
        String s = "AcgDfD";
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch >= 'A' && ch <= 'Z'){
                ans += (char) (ch + 32);
            }else if(ch >= 'a' && ch <= 'z'){
                ans += (char) (ch - 32);
            }
        }
        System.out.println(ans);
    }
}
