package Arrays;

import java.util.Arrays;

public class Q58_ReverseCopy {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 5, 6, 8, 9};
        int[] rev = new int[arr.length];
        int i = arr.length - 1, j = 0;
        while (i >= 0){
            rev[j++] = arr[i--];
        }

//        for (int i = 0; i <= lastIndex; i++) {
//            copy[i] = arr[lastIndex - i];
//            /* [4 to 0] ; first 4 - 0 = 4; second 4 - 1 = 3*/
//        }

        System.out.println(Arrays.toString(rev));
    }
}
