package String;

import java.util.Arrays;

public class Q83_SortWordsOfSentence {
    public static void main(String[] args) {
        String str = "hello bro how are you doing";
        String[] words = str.split(" ");
        Arrays.sort(words);

        for (int i = 0; i < words.length - 1; i++) {
            for (int j = 0; j < words.length - 1 - i; j++) {
                if(words[j].compareTo(words[j + 1]) > 0){
                    String temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;
                }
            }
        }


        String ans = String.join(" ", words);
        ans = ans.trim();
        System.out.println(ans);
    }
}
