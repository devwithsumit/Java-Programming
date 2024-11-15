package Practice;

public class Q15_AbsSumOfPairs {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++) {
                sum += arr[j] - arr[i];
            }
        }
        System.out.println(sum);
    }
}
