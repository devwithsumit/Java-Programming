package String;

import java.util.Arrays;

public class Q79_SplitAndCapitalize {
    public static String capitalize(String word){
        if(word.length() <= 2)
            return word.toUpperCase();

        char char1 = Character.toUpperCase(word.charAt(0));
        char charLast = Character.toUpperCase(word.charAt(word.length() - 1));
//        if(ch1 >= 'a' && ch1 <= 'z'){
//            ch1 = (char) (ch1 - 32);
//        }
        String middleStr = word.substring(1, word.length() - 1);
        return char1 + middleStr + charLast;
    };
    public static void main(String[] args) {
        String str = "hello brother how are you";
        String[] words = str.split(" ");

        for (int i = 0; i < words.length; i++) {
            words[i] = (char) (words[i].charAt(0) - 32) + words[i].substring(1, words[i].length() - 1) + (char) (words[i].charAt(words[i].length() - 1) - 32);
        }

        String ans = String.join(" ", words);
        System.out.println(ans);
    }
}
