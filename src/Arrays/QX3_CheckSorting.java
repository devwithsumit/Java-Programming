package Arrays;

public class QX3_CheckSorting {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 7, 9};
        boolean isSorted = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] > arr[i + 1]){
                isSorted = false;
                break;
            }
        }
        System.out.println(isSorted);
    }
}
