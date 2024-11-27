package Arrays;

import java.util.Arrays;

public class QX5_RightRotateByK {
    static int[] rightRotate(int[] arr, int k){
        int n = arr.length;
        k = k % n;
        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        return arr;
    }
    static  int[] reverse(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));
        rightRotate(arr, 5);
        System.out.println(Arrays.toString(arr));
    }
}
