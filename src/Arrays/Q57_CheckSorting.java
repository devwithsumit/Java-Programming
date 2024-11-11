package Arrays;

public class Q57_CheckSorting {
    public static void main(String[] args) {
        int[] arr = new int[]{23, 56, 89, 95, 98};
        boolean isSorted = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]){
                isSorted = false;
                break;
            }
        }
        System.out.println(isSorted ? "Sorted" : "Unsorted");
    }
}
