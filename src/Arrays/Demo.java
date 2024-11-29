package Arrays;

import java.util.Arrays;

public class Demo {

    Demo(int[][] arr){
//        arrays inside 2D array can be replaced with
//        a new Array may or may not have different size and elements;
        arr[0] = new int[]{2,2,2,2};/*it will reflect in the original 2D-array*/
        System.out.println(Arrays.deepToString(arr));
    }
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };
//        print all the references of arr object pointing towards different arrays
//        System.out.println(Arrays.toString(arr));
        new Demo(arr);
//        System.out.println(Arrays.deepToString(arr));
    }
}
