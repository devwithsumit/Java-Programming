package Arrays;


public class Q55_MaxNum {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 69, 96, 77, 145, 20};
        int maxIndex = 0;
        int max = arr[maxIndex];

//        System.out.print("Your array is : ["); /*To Print the array */
//        for (int i : arr){
//            System.out.print(i + (i != arr[arr.length - 1] ? ", " : "]\n"));
//        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[maxIndex] < arr[i]) {
                maxIndex = i;
            }
        }
        System.out.println("Maximum is : " + arr[maxIndex] + " at " + " index " + maxIndex);
    }
}
