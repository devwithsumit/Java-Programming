package Practice;

import java.util.Arrays;

public class Q18_MaxElementDeletion {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 4, 1};
        int size = arr.length, count = 0;
        while (size > 0) {
            int maxIndex = 0;
            for (int i = 0; i < size; i++) {
                if (arr[i] > arr[maxIndex]) {
                    maxIndex = i;
                }
            }
            count++;
            size = maxIndex;
        }
        System.out.println(count);
    }
}
