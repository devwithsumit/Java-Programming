package BitwiseOperators;

import javax.naming.BinaryRefAddr;

public class DecimalToBinary {
    public static void main(String[] args) {
        /*Java In-built method*/
//        int n = 10;
//        System.out.println(Integer.toBinaryString(n));

        int n = 10, pos = 0;
        int binary = 0;
        while (n > 0){
            binary = binary + n % 2 * (int) Math.pow(10, pos++);
            n /= 2;
        }
        System.out.println(binary); //1010
    }
}
