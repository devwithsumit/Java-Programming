package Loops;

public class Q29_SumOfOddEven {
    public static void main(String[] args) {
        int range  = 10;
        int sumOdd = 0, sumEven = 0;
        for (int i = 1; i <= range; i++) {
            if (i % 2 ==0) sumEven += i;
            else sumOdd += i;
        }
        System.out.println(STR."Range (1 to \{range})");
        System.out.println(STR."Sum of even numbers \{sumEven} \nSum of odd numbers \{sumOdd}");
    }
}
