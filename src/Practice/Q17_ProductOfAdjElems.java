package Practice;

import java.awt.geom.CubicCurve2D;
import java.util.Arrays;

public class Q17_ProductOfAdjElems {
    static void updateArray(int[] arr){
        int prev = arr[0];
        arr[0] = arr[0] * arr[1];
        for (int i = 1; i < arr.length - 1; i++) {
            int current = arr[i]; //store current elem before updating
            arr[i] = prev * arr[i + 1];//update ith elem
            prev = current;//put the current elem in the prev elem
        };
        arr[arr.length - 1] = prev * arr[arr.length - 1];
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6};
        updateArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}
