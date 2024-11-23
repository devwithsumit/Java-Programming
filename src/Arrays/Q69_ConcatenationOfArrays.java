package Arrays;

import java.util.Arrays;

public class Q69_ConcatenationOfArrays {
//   Creating a new array by concatenating a given array with itself
    public static int[] getConcatenation(int[] arr){
        int[] ans = new int[arr.length * 2];

        for (int i = 0; i < arr.length; i++) {
            ans[i] = arr[i];
            ans[i + arr.length] = arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1, 4, 6};
        System.out.println("Concatenated Array : " + Arrays.toString(getConcatenation(arr)));
    }
}
