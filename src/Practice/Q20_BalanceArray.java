package Practice;

public class Q20_BalanceArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 2, 1, 3};
        int leftSum = 0, rightSum = 0;
        int start = 0, end = arr.length - 1;
        while (start < end){
            leftSum += arr[start++];
            rightSum += arr[end--];
        }
        System.out.println("The difference is : " + Math.abs(leftSum - rightSum)
        + " that should be added to " + (leftSum < rightSum ? "Left" : "Right" ) + " half.");
    }
}
