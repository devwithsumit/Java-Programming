package Arrays;

import java.awt.*;
import java.util.Arrays;

public class Q64_SeparateNegativeAndPositive {
    public static void main(String[] args) {
        int[] arr = {2, -4, 1, -5, 7, -8, 9};
        int[] brr = new int[arr.length];
        int index = 0;
//      Using extra space - Time Complexity O(2n) less
        for (int j : arr) {
            if (j < 0)
                brr[index++] = j;
        }
        for (int j : arr) {
            if (j > 0)
                brr[index++] = j;
        }
        //Simple sorting method(Time Complexity O(n^2)) highest
//        for (int i = 0; i <= arr.length - 1; i++) {
//            for (int j = i; j < arr.length - 2; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }

        System.out.println(Arrays.toString(arr));
    }
}
