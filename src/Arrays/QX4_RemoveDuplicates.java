package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class QX4_RemoveDuplicates {
    static int removeDuplicate(int[] arr) {
        int n = arr.length;
        int j = 0;
        for (int i = 1; i < n; i++) {
            if(arr[j] != arr[i]){// Check if current element is unique
                j++;// Move the unique pointer forward
                arr[j] = arr[i];// Place the unique element at i
            }
        }
        return j + 1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 4, 4, 5};
        int newSize = removeDuplicate(arr);
        int[] uniqueArray = Arrays.copyOfRange(arr, 0 , newSize);
        System.out.println(Arrays.toString(uniqueArray));
    }
}
