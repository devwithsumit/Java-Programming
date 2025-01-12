package BitwiseOperators;

public class BinaryToDecimal {
    public static void main(String[] args) {
        /* Java In-built method */
//        String binary = "1010";
//        System.out.println(Integer.parseInt(binary, 2));
        int n = 101001, pos = 0;
        System.out.println(Integer.parseInt(Integer.toString(n), 2));
        int decimal = 0;
        while (n > 0){
            // decimal = lastDigit * 2 ^ position;
            decimal += n % 10 * (int) Math.pow(2, pos++);
            n /= 10;
        }
        System.out.println(decimal); //10
    }
}
