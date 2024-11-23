package Arrays;

import java.util.Arrays;

public class Q70_ArrayPermutation {
//    requires constructing a new array based on the
//    values and indices of an existing array
    /*Given an arr of len n
    each element is unique
    range (0 to n-1)*/
//    build new array where, new[i] = arr[arr[i]];

//    The element on the index is the index of the element of array
//    to be placed on the same index of new array.
//    for e.g - element 0 index of old arr[] is the index
//     of the element of new[] to be placed in new arr[];
//    arr[3, 4, 1, 2, 0]
//    arr[0] = 3 is the index of the element (i.e. arr[3]) to be placed in ans[0]
//    ans[0] = arr[arr[0]] = arr[3] = 2
//    therefore ans[0] = 2;

    public static int[] buildArray(int[] arr) {
        int[] ans = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            ans[i] = arr[arr[i]];/* ans[0] = arr[arr[i -> 0] -> 2] -> 4*/
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 4, 0, 3, 1};

        System.out.println(Arrays.toString(buildArray(arr)));
    }
}
