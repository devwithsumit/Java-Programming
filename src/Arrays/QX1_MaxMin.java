package Arrays;

public class QX1_MaxMin {
    public static void main(String[] args) {
        int[] arr = {3,2, 4, 5, 6, 7, 9};
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i])
                max = arr[i];
            if(min > arr[i])
                min = arr[i];
        }
        System.out.println("Max : " + max);
        System.out.println("Min : " + min);
    }
}
