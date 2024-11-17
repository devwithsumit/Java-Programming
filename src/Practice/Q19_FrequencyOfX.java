package Practice;

import java.util.Arrays;

public class Q19_FrequencyOfX {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 1, 4, 5, 6};
        int x = 1, count = 0;
        for (int j : arr) {
            if (x == j)
                count++;
        }
        System.out.println(count); //output - 3
    }
}
