package IF_Else;

import java.util.Scanner;

public class Q22_Vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character : ");
        char input = sc.next().charAt(0);
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        boolean isVowel = false;
        for (int i = 0; i < vowels.length ; i++) {
            if (input == vowels[i]) {
                isVowel = true;
                break;
            }
        }
        System.out.println(input + " is a " +(isVowel ? "vowel": "consonant"));
    }
}
