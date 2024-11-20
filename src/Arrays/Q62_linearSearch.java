package Arrays;

public class Q62_linearSearch {
    public static void main(String[] args) {
        int [] arr = {2, 7, 1, 5, 3, 8, 9};
        int key = 8, index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key)
                index = i;
        }
        System.out.println(index != -1 ? "Found at " + index + " index" : "Not Found");
    }
}
