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

    public static boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;
        for (int rotation = 0; rotation < 4; rotation++) {

            if (areMatricesEqual(mat, target)) { // return true if match found
                return true;
            }
            rotate90(mat); // rotate of match not found
        }
        // return false if any of the rotated array does not match
        return false;
    }

    public static boolean areMatricesEqual(int[][] mat, int[][] target) {
        if (mat.length != target.length) return false;
        // check if two 2D arrays are equal or not
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (mat[i][j] != target[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void rotate90(int[][] mat) {
        int n = mat.length;
        //Transpose of the matrix (only for n x n )
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        //Reverse each row
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[i][n - j - 1];
                mat[i][n - j - 1] = temp;
            }
        }
    }

    public static void main(String[] args) throws IOException {

//        diagonalSum(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
        int[][] mat = new int[][]{
                {0, 1},
                {1, 0},
        };
        int[][] target = new int[][]{
                {1, 0},
                {0, 1},
        };
        System.out.println(findRotation(mat, target));
    }
}