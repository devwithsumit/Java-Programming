package Practice;

import java.util.Arrays;

public class Q21_MoveZeroOneToEitherSide {
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0, 1, 1, 0};
        int start = 0, end = arr.length - 1;
        while (start < end) {
            if (arr[start] == 1) {
                start++;
            } else if (arr[end] == 0) {
                end--;
            } else {
                int temp = arr[start];
                arr[start++] = arr[end];
                arr[end--] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
