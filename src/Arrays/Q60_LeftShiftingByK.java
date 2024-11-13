package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q60_LeftShiftingByK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[]{3, 7, 9, 1, 8};
        System.out.println(Arrays.toString(arr));
        System.out.print("Enter how times you want to perform shifting in the above array: ");
        int n = sc.nextInt();
        int k = n % arr.length;
        while (k-- > 0) {
            int temp = arr[0]; /*store first element*/
            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1]; /*shift the element at one index before position*/
            }
            /*Last space will be empty so store the first element at the last position*/
            arr[arr.length - 1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
