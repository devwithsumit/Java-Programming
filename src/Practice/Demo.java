package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.function.IntToDoubleFunction;

class Demo {
    //    Todo
//    public static boolean isVowelString(String s) {
//        if(s.length() < 5) return false;
//        Set<Character> vowels = new HashSet<>();
//        for (char ch : s.toCharArray()) {
//            if(ch == 'a' || ch  == 'e' || ch  == 'i' || ch  == 'o' || ch  == 'u'){
//               vowels.add(ch);
//            }else{
//                return false;
//            }
//        }
//        System.out.println(vowels);
//        return vowels.size() == 5;
//    }
//    public static int countVowelSubstrings(String word) {
//        int n = word.length();
//        if (n < 5) {
//            return 0;
//        }
//        if (word.length() < 5)
//            return 0;
//
//        int count = 0;
//        for(int i = 0; i < word.length(); i++){
//            int[] vowels = new int[5];
//            int j = i;
//            for (; j < word.length(); j++) {
//                switch(word.charAt(j)){
//                    case 'a':
//                    case 'e':
//                    case 'i':
//                    case 'o':
//                    case 'u':
//                        vowels[word.charAt(i) - 'a']++;
//                    default:
//                        break;
//                }
//            }
//            if(isVowelString(word.substring(i,j))) count++;
//        }
//        return count;
//    }
    public static int[] findErrorNums(int[] nums) {
        Map<Integer, Integer> freqMap = new TreeMap<>();
        for (int i = 0; i < nums.length; i++) {

            freqMap.put(nums[i], freqMap.getOrDefault(nums[i], 0) + 1);
        }
        System.out.println(freqMap);
        int[] ans = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (!freqMap.containsKey(i + 1)) {
//                System.out.println(i + 1);
                ans[1] = i + 1;
                continue;
            }
            if (freqMap.get(nums[i]) == 2) {
//                System.out.println(freqMap.get(nums[i]));
                ans[0] = nums[i];
            }
        }
        System.out.println(freqMap);
        return ans;
    }

    public static int diagonalSum(int[][] mat) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (i == j) sum += mat[i][j];
                else if (i + j == mat.length - 1) {
                    sum += mat[i][j];
                }
            }
        }
        return mat.length;
    }

    public static void main(String[] args) throws IOException {

//        diagonalSum(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});

        int[][] image = new int[][]{
                {1, 1, 0},
                {1, 0, 1},
                {0, 0, 0},
        };
        int n = image.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n / 2; j++) {
                int temp = image[i][j];
                image[i][j] = image[i][n - j - 1] == 0 ? 1 : 0;
                image[i][n - j - 1] = temp == 0 ? 1 : 0;
            }
        }
        System.out.println(Arrays.deepToString(image));
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                if (image[i][j] == 1) image[i][j] = 0;
//                else image[i][j] = 1;
//            }
//        }
//        System.out.println(Arrays.deepToString(image));
    }
}