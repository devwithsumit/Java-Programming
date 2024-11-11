package Arrays;

import java.util.Scanner;

public class Q56_SecondMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.print("Enter elements : ");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        int max = Math.max(arr[0], arr[1]);
        int secondMax = Math.min(arr[0], arr[1]);
        for (int i = 2; i < arr.length; i++) {
            if(arr[i] > max){
                secondMax = max;
                max = arr[i];
            }else if (arr[i] > secondMax){
                secondMax = arr[i];
            }
        }
        System.out.println("Max : " + max);
        System.out.println("Second max : " + secondMax);
    }
}