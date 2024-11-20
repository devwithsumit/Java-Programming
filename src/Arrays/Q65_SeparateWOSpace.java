package Arrays;

import java.util.Arrays;

public class Q65_SeparateWOSpace {
    public static void main(String[] args) {
        int[] arr = new int[]{3, -2, 5, -4, 7, -6, 9, -1};
        int i = 0, j = arr.length - 1;
        while (i <= j){
            if (arr[i] < 0) i++;
            else if (arr[j] >= 0) j--;
            else{
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;j--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
