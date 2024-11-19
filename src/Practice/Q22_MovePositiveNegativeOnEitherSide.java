package Practice;

import java.util.Arrays;
import java.util.Collections;

public class Q22_MovePositiveNegativeOnEitherSide {
    public static void main(String[] args) {
        Integer[] arr = {-1, -3, -2, 1, 3, 4, 0};
        int start = 0, end = arr.length - 1;
        while (start < end) {
            if (arr[start] > 0) {
                start++;
            } else if (arr[end] < 0) {
                end--;
            } else {
                int temp = arr[start];
                arr[start++] = arr[end];
                arr[end] = temp;
            }
        }
//        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
    }
}
