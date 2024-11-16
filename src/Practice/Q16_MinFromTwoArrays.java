package Practice;

public class Q16_MinFromTwoArrays {
    public static void main(String[] args) {
        int[] A = {3, 6, 4, 5, 6};
        char[] B = {'a', 'c', 'b', 'b', 'a'};
        int minA, minB, minC;
        minA = minB = minC = Integer.MAX_VALUE;
        for (int i = 0; i < A.length; i++) {
            if (B[i] == 'a') {
                minA = Math.min(A[i], minA);
            }
            if (B[i] == 'b') {
                minB = Math.min(A[i], minB);
            }
            if (B[i] == 'c') {
                minC = Math.min(A[i], minC);
            }
        }
        double min = Math.min((long) minA + minB, minC);
        System.out.println((int) min);
    }
}
