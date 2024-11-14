package Arrays;

public class Q63_BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7, 8, 9};
        int key = 9, index = -1;
        int start = 0, end = arr.length - 1;

        while (start <= end){
            int mid = (start + end) / 2;
            if (key == arr[mid]){
                index = mid;
                break;
            }
            else if (key < arr[mid])
                end = mid - 1;
            else if (key > arr[mid])
                start = mid + 1;
        }

        System.out.println(index != -1 ? "Found at " + index + " index" : "Not Found");
    }
}
