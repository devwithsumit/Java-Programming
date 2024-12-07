package String;

import java.util.Arrays;

public class Q82_CheckAnagram {

    public static boolean checkAnagram(char[] a, char[] b){
        if(a.length != b.length) return false;

        int[] str1Bitmap = new int[26];
        int[] str2Bitmap = new int[26];

        for (int i = 0; i < a.length; i++) {
            str1Bitmap[a[i] - 97]++;
            str2Bitmap[b[i] - 97]++;
        }
        return Arrays.equals(str1Bitmap, str2Bitmap);
    }
    public static void main(String[] args) {
        String str1 = "car";
        String str2 = "arc";

        char[] a = str1.toCharArray();
        char[] b = str2.toCharArray();

        System.out.println(checkAnagram(a,b));
    }
}
