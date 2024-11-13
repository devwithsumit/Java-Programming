package Arrays;

import java.util.Arrays;

public class Q61_Reverse_wOutSpace {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 5, 6, 8, 9};
        int i = arr.length - 1, j = 0;
        while (i > j){
            int temp = arr[j];
            arr[j++] = arr[i];
            arr[i--] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
