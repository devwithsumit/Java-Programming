package Arrays;

import java.util.Arrays;

public class Q59_LeftShifting {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 7, 9, 1, 8};
        int temp = arr[0]; /*store first element*/
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1]; /*shift the element at one index before position*/
        }
        /*Last space will be empty so store the first element at the last position*/
        arr[arr.length - 1] = temp;
        System.out.println(Arrays.toString(arr));
    }
}
