package Arrays;

import java.util.Scanner;

public class Q54_Array_Sum_Mean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //input size
        System.out.print("Enter size : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int sum  = 0;
        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }
        System.out.println("Sum is : " + sum);
        System.out.println("Mean is : " + (double) sum/size);
    }
}
