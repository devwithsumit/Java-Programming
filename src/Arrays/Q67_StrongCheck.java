package Arrays;

public class Q67_StrongCheck {
//    numbers whose digit's factorials sum up exactly same as the number
//    145 = 1! + 4! + 5! = 145
    static int fact(int a) {
        if(a < 0)
            throw new IllegalArgumentException("Factorial of negative numbers is not defined");
        if (a <= 1) return 1;
        return a * fact(a - 1);
    }
    static boolean StrongCheck(int n){
        int temp = n, sum = 0;
        while (temp > 0) {
            sum += fact((temp % 10));
            temp /= 10;
        }
        return sum == n;
    }
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            if (StrongCheck(i)) System.out.println(i);
        }
    }
}
