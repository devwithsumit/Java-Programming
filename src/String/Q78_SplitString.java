package String;

import java.util.Arrays;

public class Q78_SplitString {
    public static void main(String[] args) {
        String str = "hello bhai kese ho!";
        String[] ans = str.split(" ");
        for(String j : ans){
            System.out.println(j);
        }
    }
}
