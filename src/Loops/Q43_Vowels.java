package Loops;

public class Q43_Vowels {
    public static void main(String[] args) {
        char input = 'a';
        String ans = switch(input){
            case 'a', 'e', 'o', 'u' -> "Vowel";
            default -> "consonant";
        };
        System.out.println(ans);
    }
}
