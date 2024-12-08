package String;

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public static String reversePrefix(String word, char ch) {
        if(word.indexOf(ch) == -1) return word;

        int start = 0, end = word.indexOf(ch);
        char[] ans = word.toCharArray();
        while(start < end){
            char temp = ans[start];
            ans[start++] = ans[end];
            ans[end--] = temp;
        }
        return new String(ans);
    }

    public static void main(String[] args) {
        String s = "abcdefd";
        System.out.println(reversePrefix(s, 'd'));
    }
}